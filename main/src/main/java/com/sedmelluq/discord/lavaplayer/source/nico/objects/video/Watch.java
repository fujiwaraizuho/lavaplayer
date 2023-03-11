
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ads",
    "category",
    "channel",
    "client",
    "comment",
    "community",
    "easyComment",
    "external",
    "genre",
    "marquee",
    "media",
    "okReason",
    "owner",
    "payment",
    "pcWatchPage",
    "player",
    "ppv",
    "ranking",
    "series",
    "smartphone",
    "system",
    "tag",
    "video",
    "videoAds",
    "videoLive",
    "viewer",
    "waku"
})

public class Watch {

    @JsonProperty("ads")
    private Object ads;
    @JsonProperty("category")
    private Object category;
    @JsonProperty("channel")
    private Object channel;
    @JsonProperty("client")
    private Client client;
    @JsonProperty("comment")
    private Comment comment;
    @JsonProperty("community")
    private Object community;
    @JsonProperty("easyComment")
    private EasyComment easyComment;
    @JsonProperty("external")
    private External external;
    @JsonProperty("genre")
    private Genre genre;
    @JsonProperty("marquee")
    private Marquee marquee;
    @JsonProperty("media")
    private Media media;
    @JsonProperty("okReason")
    private String okReason;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("payment")
    private Payment payment;
    @JsonProperty("pcWatchPage")
    private PcWatchPage pcWatchPage;
    @JsonProperty("player")
    private Player player;
    @JsonProperty("ppv")
    private Object ppv;
    @JsonProperty("ranking")
    private Ranking ranking;
    @JsonProperty("series")
    private Object series;
    @JsonProperty("smartphone")
    private Object smartphone;
    @JsonProperty("system")
    private com.sedmelluq.discord.lavaplayer.source.nico.objects.video.System system;
    @JsonProperty("tag")
    private Tag tag;
    @JsonProperty("video")
    private Video__2 video;
    @JsonProperty("videoAds")
    private VideoAds videoAds;
    @JsonProperty("videoLive")
    private Object videoLive;
    @JsonProperty("viewer")
    private Viewer__4 viewer;
    @JsonProperty("waku")
    private Waku waku;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ads")
    public Object getAds() {
        return ads;
    }

    @JsonProperty("ads")
    public void setAds(Object ads) {
        this.ads = ads;
    }

    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    @JsonProperty("channel")
    public Object getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Object channel) {
        this.channel = channel;
    }

    @JsonProperty("client")
    public Client getClient() {
        return client;
    }

    @JsonProperty("client")
    public void setClient(Client client) {
        this.client = client;
    }

    @JsonProperty("comment")
    public Comment getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    @JsonProperty("community")
    public Object getCommunity() {
        return community;
    }

    @JsonProperty("community")
    public void setCommunity(Object community) {
        this.community = community;
    }

    @JsonProperty("easyComment")
    public EasyComment getEasyComment() {
        return easyComment;
    }

    @JsonProperty("easyComment")
    public void setEasyComment(EasyComment easyComment) {
        this.easyComment = easyComment;
    }

    @JsonProperty("external")
    public External getExternal() {
        return external;
    }

    @JsonProperty("external")
    public void setExternal(External external) {
        this.external = external;
    }

    @JsonProperty("genre")
    public Genre getGenre() {
        return genre;
    }

    @JsonProperty("genre")
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @JsonProperty("marquee")
    public Marquee getMarquee() {
        return marquee;
    }

    @JsonProperty("marquee")
    public void setMarquee(Marquee marquee) {
        this.marquee = marquee;
    }

    @JsonProperty("media")
    public Media getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(Media media) {
        this.media = media;
    }

    @JsonProperty("okReason")
    public String getOkReason() {
        return okReason;
    }

    @JsonProperty("okReason")
    public void setOkReason(String okReason) {
        this.okReason = okReason;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("payment")
    public Payment getPayment() {
        return payment;
    }

    @JsonProperty("payment")
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @JsonProperty("pcWatchPage")
    public PcWatchPage getPcWatchPage() {
        return pcWatchPage;
    }

    @JsonProperty("pcWatchPage")
    public void setPcWatchPage(PcWatchPage pcWatchPage) {
        this.pcWatchPage = pcWatchPage;
    }

    @JsonProperty("player")
    public Player getPlayer() {
        return player;
    }

    @JsonProperty("player")
    public void setPlayer(Player player) {
        this.player = player;
    }

    @JsonProperty("ppv")
    public Object getPpv() {
        return ppv;
    }

    @JsonProperty("ppv")
    public void setPpv(Object ppv) {
        this.ppv = ppv;
    }

    @JsonProperty("ranking")
    public Ranking getRanking() {
        return ranking;
    }

    @JsonProperty("ranking")
    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    @JsonProperty("series")
    public Object getSeries() {
        return series;
    }

    @JsonProperty("series")
    public void setSeries(Object series) {
        this.series = series;
    }

    @JsonProperty("smartphone")
    public Object getSmartphone() {
        return smartphone;
    }

    @JsonProperty("smartphone")
    public void setSmartphone(Object smartphone) {
        this.smartphone = smartphone;
    }

    @JsonProperty("system")
    public com.sedmelluq.discord.lavaplayer.source.nico.objects.video.System getSystem() {
        return system;
    }

    @JsonProperty("system")
    public void setSystem(com.sedmelluq.discord.lavaplayer.source.nico.objects.video.System system) {
        this.system = system;
    }

    @JsonProperty("tag")
    public Tag getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    @JsonProperty("video")
    public Video__2 getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(Video__2 video) {
        this.video = video;
    }

    @JsonProperty("videoAds")
    public VideoAds getVideoAds() {
        return videoAds;
    }

    @JsonProperty("videoAds")
    public void setVideoAds(VideoAds videoAds) {
        this.videoAds = videoAds;
    }

    @JsonProperty("videoLive")
    public Object getVideoLive() {
        return videoLive;
    }

    @JsonProperty("videoLive")
    public void setVideoLive(Object videoLive) {
        this.videoLive = videoLive;
    }

    @JsonProperty("viewer")
    public Viewer__4 getViewer() {
        return viewer;
    }

    @JsonProperty("viewer")
    public void setViewer(Viewer__4 viewer) {
        this.viewer = viewer;
    }

    @JsonProperty("waku")
    public Waku getWaku() {
        return waku;
    }

    @JsonProperty("waku")
    public void setWaku(Waku waku) {
        this.waku = waku;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Watch.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("ads");
        sb.append('=');
        sb.append(((this.ads == null)?"<null>":this.ads));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
        sb.append(',');
        sb.append("client");
        sb.append('=');
        sb.append(((this.client == null)?"<null>":this.client));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("community");
        sb.append('=');
        sb.append(((this.community == null)?"<null>":this.community));
        sb.append(',');
        sb.append("easyComment");
        sb.append('=');
        sb.append(((this.easyComment == null)?"<null>":this.easyComment));
        sb.append(',');
        sb.append("external");
        sb.append('=');
        sb.append(((this.external == null)?"<null>":this.external));
        sb.append(',');
        sb.append("genre");
        sb.append('=');
        sb.append(((this.genre == null)?"<null>":this.genre));
        sb.append(',');
        sb.append("marquee");
        sb.append('=');
        sb.append(((this.marquee == null)?"<null>":this.marquee));
        sb.append(',');
        sb.append("media");
        sb.append('=');
        sb.append(((this.media == null)?"<null>":this.media));
        sb.append(',');
        sb.append("okReason");
        sb.append('=');
        sb.append(((this.okReason == null)?"<null>":this.okReason));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("pcWatchPage");
        sb.append('=');
        sb.append(((this.pcWatchPage == null)?"<null>":this.pcWatchPage));
        sb.append(',');
        sb.append("player");
        sb.append('=');
        sb.append(((this.player == null)?"<null>":this.player));
        sb.append(',');
        sb.append("ppv");
        sb.append('=');
        sb.append(((this.ppv == null)?"<null>":this.ppv));
        sb.append(',');
        sb.append("ranking");
        sb.append('=');
        sb.append(((this.ranking == null)?"<null>":this.ranking));
        sb.append(',');
        sb.append("series");
        sb.append('=');
        sb.append(((this.series == null)?"<null>":this.series));
        sb.append(',');
        sb.append("smartphone");
        sb.append('=');
        sb.append(((this.smartphone == null)?"<null>":this.smartphone));
        sb.append(',');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("video");
        sb.append('=');
        sb.append(((this.video == null)?"<null>":this.video));
        sb.append(',');
        sb.append("videoAds");
        sb.append('=');
        sb.append(((this.videoAds == null)?"<null>":this.videoAds));
        sb.append(',');
        sb.append("videoLive");
        sb.append('=');
        sb.append(((this.videoLive == null)?"<null>":this.videoLive));
        sb.append(',');
        sb.append("viewer");
        sb.append('=');
        sb.append(((this.viewer == null)?"<null>":this.viewer));
        sb.append(',');
        sb.append("waku");
        sb.append('=');
        sb.append(((this.waku == null)?"<null>":this.waku));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.viewer == null)? 0 :this.viewer.hashCode()));
        result = ((result* 31)+((this.smartphone == null)? 0 :this.smartphone.hashCode()));
        result = ((result* 31)+((this.waku == null)? 0 :this.waku.hashCode()));
        result = ((result* 31)+((this.okReason == null)? 0 :this.okReason.hashCode()));
        result = ((result* 31)+((this.channel == null)? 0 :this.channel.hashCode()));
        result = ((result* 31)+((this.media == null)? 0 :this.media.hashCode()));
        result = ((result* 31)+((this.video == null)? 0 :this.video.hashCode()));
        result = ((result* 31)+((this.videoAds == null)? 0 :this.videoAds.hashCode()));
        result = ((result* 31)+((this.genre == null)? 0 :this.genre.hashCode()));
        result = ((result* 31)+((this.client == null)? 0 :this.client.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.player == null)? 0 :this.player.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.pcWatchPage == null)? 0 :this.pcWatchPage.hashCode()));
        result = ((result* 31)+((this.easyComment == null)? 0 :this.easyComment.hashCode()));
        result = ((result* 31)+((this.videoLive == null)? 0 :this.videoLive.hashCode()));
        result = ((result* 31)+((this.marquee == null)? 0 :this.marquee.hashCode()));
        result = ((result* 31)+((this.community == null)? 0 :this.community.hashCode()));
        result = ((result* 31)+((this.ads == null)? 0 :this.ads.hashCode()));
        result = ((result* 31)+((this.external == null)? 0 :this.external.hashCode()));
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.series == null)? 0 :this.series.hashCode()));
        result = ((result* 31)+((this.ppv == null)? 0 :this.ppv.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.ranking == null)? 0 :this.ranking.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Watch)) {
            return false;
        }
        Watch rhs = ((Watch) other);
        return ((((((((((((((((((((((((((((Objects.equals(this.viewer, rhs.viewer))&&(Objects.equals(this.smartphone, rhs.smartphone)))&&(Objects.equals(this.waku, rhs.waku)))&&(Objects.equals(this.okReason, rhs.okReason)))&&(Objects.equals(this.channel, rhs.channel)))&&(Objects.equals(this.media, rhs.media)))&&(Objects.equals(this.video, rhs.video)))&&(Objects.equals(this.videoAds, rhs.videoAds)))&&(Objects.equals(this.genre, rhs.genre)))&&(Objects.equals(this.client, rhs.client)))&&(Objects.equals(this.payment, rhs.payment)))&&(Objects.equals(this.tag, rhs.tag)))&&(Objects.equals(this.player, rhs.player)))&&(Objects.equals(this.owner, rhs.owner)))&&(Objects.equals(this.pcWatchPage, rhs.pcWatchPage)))&&(Objects.equals(this.easyComment, rhs.easyComment)))&&(Objects.equals(this.videoLive, rhs.videoLive)))&&(Objects.equals(this.marquee, rhs.marquee)))&&(Objects.equals(this.community, rhs.community)))&&(Objects.equals(this.ads, rhs.ads)))&&(Objects.equals(this.external, rhs.external)))&&(Objects.equals(this.system, rhs.system)))&&(Objects.equals(this.series, rhs.series)))&&(Objects.equals(this.ppv, rhs.ppv)))&&(Objects.equals(this.comment, rhs.comment)))&&(Objects.equals(this.ranking, rhs.ranking)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.category, rhs.category)));
    }

}
