package com.sedmelluq.discord.lavaplayer.source.nico;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sedmelluq.discord.lavaplayer.container.mpeg.MpegAudioTrack;
import com.sedmelluq.discord.lavaplayer.source.AudioSourceManager;
import com.sedmelluq.discord.lavaplayer.source.nico.objects.video.Session;
import com.sedmelluq.discord.lavaplayer.source.nico.objects.video.Watch;
import com.sedmelluq.discord.lavaplayer.tools.io.HttpClientTools;
import com.sedmelluq.discord.lavaplayer.tools.io.HttpInterface;
import com.sedmelluq.discord.lavaplayer.tools.io.PersistentHttpStream;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackInfo;
import com.sedmelluq.discord.lavaplayer.track.DelegatedAudioTrack;
import com.sedmelluq.discord.lavaplayer.track.playback.LocalAudioTrackExecutor;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.URLDecoder;

/**
 * Audio track that handles processing NicoNico tracks.
 */
public class NicoAudioTrack extends DelegatedAudioTrack {
    private static final Logger log = LoggerFactory.getLogger(NicoAudioTrack.class);

    private final NicoAudioSourceManager sourceManager;

    /**
     * @param trackInfo     Track info
     * @param sourceManager Source manager which was used to find this track
     */
    public NicoAudioTrack(AudioTrackInfo trackInfo, NicoAudioSourceManager sourceManager) {
        super(trackInfo);

        this.sourceManager = sourceManager;
    }

    @Override
    public void process(LocalAudioTrackExecutor localExecutor) throws Exception {
        sourceManager.checkLoggedIn();

        try (HttpInterface httpInterface = sourceManager.getHttpInterface()) {
            loadVideoMainPage(httpInterface);
            String playbackUrl = loadPlaybackUrl(httpInterface);

            log.info("URLからニコニコ動画を開始： {}", playbackUrl);

            try (PersistentHttpStream stream = new PersistentHttpStream(httpInterface, new URI(playbackUrl), null)) {
                processDelegate(new MpegAudioTrack(trackInfo, stream), localExecutor);
            }
        }
    }

    private void loadVideoMainPage(HttpInterface httpInterface) throws IOException {
        HttpGet request = new HttpGet("https://www.nicovideo.jp/watch/" + trackInfo.identifier);

        try (CloseableHttpResponse response = httpInterface.execute(request)) {
            int statusCode = response.getStatusLine().getStatusCode();
            if (!HttpClientTools.isSuccessWithContent(statusCode)) {
                throw new IOException("Unexpected status code from video main page: " + statusCode);
            }

            EntityUtils.consume(response.getEntity());
        }
    }

    private String loadPlaybackUrl(HttpInterface httpInterface) throws IOException {
        HttpGet request = new HttpGet("https://www.nicovideo.jp/watch/" + trackInfo.identifier);
        log.info("https://www.nicovideo.jp/watch/" + trackInfo.identifier);

        try (CloseableHttpResponse response = httpInterface.execute(request)) {
            int statusCode = response.getStatusLine().getStatusCode();
            if (!HttpClientTools.isSuccessWithContent(statusCode)) {
                throw new IOException("Unexpected status code from playback parameters page: " + statusCode);
            }
            Document document = Jsoup.parse(EntityUtils.toString(response.getEntity()));
            log.info(document.toString());
            String json = document.select("div#js-initial-watch-data").attr("data-api-data");

            ObjectMapper om = new ObjectMapper();
            JsonNode jsonNode = null;
            JsonNode sessionNode = null;

            jsonNode = om.readTree(URLDecoder.decode(json, "UTF-8"));

            Watch watchObj = om.readValue(URLDecoder.decode(json, "UTF-8"), Watch.class);

            log.info(watchObj.toString());

            sessionNode = jsonNode.get("media").get("delivery").get("movie").get("session");
            log.info("Niconico Session:" + watchObj.getMedia().getDelivery().getMovie().getSession().toString());

            ObjectMapper postom = new ObjectMapper();

            if(watchObj.getViewer().getIsPremium()){
                log.debug("プレミアムアカウントでニコニコ動画へリクエストします。(ユーザー名:{}, Transfer Preset:{})", watchObj.getViewer().getNickname(), watchObj.getMedia().getDelivery().getMovie().getSession().getTransferPresets().get(0));
            }

            Session sessionObj = watchObj.getMedia().getDelivery().getMovie().getSession();

            String postJson ="{\"session\":{\"recipe_id\":\"" + sessionObj.getRecipeId() + "\",\"content_id\":\"out1\",\"content_type\":\"movie\",\"content_src_id_sets\":[{\"content_src_ids\":[{\"src_id_to_mux\":{\"video_src_ids\":[\"archive_h264_360p\",\"archive_h264_360p_low\"],\"audio_src_ids\":[\""+ sessionObj.getAudios().get(0) +"\"]}}]}],\"timing_constraint\":\"unlimited\",\"keep_method\":{\"heartbeat\":{\"lifetime\":120000}},\"protocol\":{\"name\":\"http\",\"parameters\":{\"http_parameters\":{\"parameters\":{\"http_output_download_parameters\":{\"use_well_known_port\":\"yes\",\"use_ssl\":\"yes\",\"transfer_preset\":\""+ (sessionObj.getTransferPresets().size() == 0 ? "" :sessionObj.getTransferPresets().get(0)) +"\"}}}}},\"content_uri\":\"\",\"session_operation_auth\":{\"session_operation_auth_by_signature\":{\"token\":" +
                    sessionNode.get("token").toString()
                    + ",\"signature\":\"" + sessionObj.getSignature() + "\"}},\"content_auth\":{\"auth_type\":\"ht2\",\"content_key_timeout\":600000,\"service_id\":\"nicovideo\",\"service_user_id\":\"" + sessionObj.getServiceUserId() + "\"},\"client_info\":{\"player_id\":\"" + sessionObj.getPlayerId() + "\"},\"priority\":"+ sessionObj.getPriority() + "}}";

            log.info("PostJson:" + postJson + "URL:" + sessionObj.getUrls().get(0).getUrl());

            HttpPost httpPost = new HttpPost("https://api.dmc.nico/api/sessions?_format=json");
            httpPost.setEntity(new StringEntity(postJson, "UTF-8"));

            httpPost.addHeader("Accept", "application/json");
            httpPost.addHeader("Accept-Encoding", "gzip, deflate, br");
            httpPost.setHeader("Accept-Language", "ja,en;q=0.9,en-GB;q=0.8,en-US;q=0.7");
            httpPost.addHeader("Connection", "keep-alive");
            httpPost.addHeader("DNT", "1");
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36 Edg/110.0.1587.63");
            httpPost.setHeader("Host", "api.dmc.nico");
            httpPost.setHeader("Origin", "https://www.nicovideo.jp");
            httpPost.setHeader("Referer", "https://www.nicovideo.jp/");

            JsonNode postJsonNode;
            try (CloseableHttpResponse postresponse = httpInterface.execute(httpPost)) {
                int statusCodePost = postresponse.getStatusLine().getStatusCode();
                if (statusCodePost != 201) {
                    log.info(EntityUtils.toString(postresponse.getEntity()));
                    throw new IOException("動画の配信リクエスト時にエラー: " + statusCodePost);
                }

                postJsonNode = postom.readTree(EntityUtils.toString(postresponse.getEntity()));
            }

            SessionFormat session = new SessionFormat(String.format("https://api.dmc.nico/api/sessions/%s?_format=json&_method=PUT", postJsonNode.get("data").get("session").get("id").textValue()), postJsonNode.get("data").toString());
            NicoHeartbeatManager.regionSession("https://www.nicovideo.jp/watch/" + trackInfo.identifier,session);
            log.info("Session Json: "+postJsonNode.get("data").toString());
            log.info("URL:" + postJsonNode.get("data").get("session").get("content_uri").textValue());
            return postJsonNode.get("data").get("session").get("content_uri").textValue();
        }
    }

    @Override
    protected AudioTrack makeShallowClone() {
        return new NicoAudioTrack(trackInfo, sourceManager);
    }

    @Override
    public AudioSourceManager getSourceManager() {
        return sourceManager;
    }

}
