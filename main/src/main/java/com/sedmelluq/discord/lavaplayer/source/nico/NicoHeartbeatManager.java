package com.sedmelluq.discord.lavaplayer.source.nico;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.player.event.AudioEventAdapter;
import com.sedmelluq.discord.lavaplayer.tools.FriendlyException;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackEndReason;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;

public class NicoHeartbeatManager extends AudioEventAdapter {

    private static final Logger log = LoggerFactory.getLogger(NicoHeartbeatManager.class);
    private static Map<String,SessionFormat> sessions = new HashMap<>();

    private static boolean inited = false;

    public static void start(){
        if(inited){
            return;
        }

        inited = true;
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                UpdateSession();
            }
        };
        timer.scheduleAtFixedRate(task,0,120000);
    }

    public static void UpdateSession(){
        List<String> remKey = new ArrayList<>();
        for(Map.Entry<String,SessionFormat> entry : sessions.entrySet()){
            CloseableHttpClient client = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(entry.getValue().getUrl());
            httpPost.setEntity(new StringEntity(entry.getValue().getJson(), "UTF-8"));
            httpPost.setHeader("Content-type", "application/json; charset=UTF-8");
            httpPost.setHeader("Accept-Language", "ja,en-US;q=0.7,en;q=0.3");
            httpPost.addHeader("DNT", "1");
            httpPost.addHeader("Connection", "keep-alive");
            try {
                CloseableHttpResponse response = client.execute(httpPost);

                if(response.getStatusLine().getStatusCode() == 404){
                    remKey.add(entry.getKey());
                    client.close();
                    continue;
                }

                log.debug("code = " + response.getStatusLine().getStatusCode());

                ObjectMapper om = new ObjectMapper();
                JsonNode json = null;
                json = om.readTree(EntityUtils.toString(response.getEntity()));

                entry.getValue().setJson(json.get("data").toString());

                client.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        for (String key: remKey) {
            sessions.remove(key);
        }
    }

    public static void regionSession(String url, SessionFormat session){
        sessions.put(url, session);
        log.debug("ニコニコセッションを追加しました。");
    }

    @Override
    public void onTrackEnd(AudioPlayer player, AudioTrack track, AudioTrackEndReason endReason) {
        log.debug("セッション削除処理開始");
        if(Objects.equals(track.getSourceManager().getSourceName(), "niconico")){
            sessions.remove(track.getInfo().uri);
            log.debug("ニコニコセッションを削除しました。");
        }
    }

    @Override
    public void onTrackException(AudioPlayer player, AudioTrack track, FriendlyException exception) {
        if(Objects.equals(track.getSourceManager().getSourceName(), "niconico")){
            sessions.remove(track.getInfo().uri);
            log.debug("ニコニコセッションを削除しました。");
        }
    }
}
