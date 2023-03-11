
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "nickname",
    "iconUrl",
    "channel",
    "live",
    "isVideosPublic",
    "isMylistsPublic",
    "videoLiveNotice",
    "viewer"
})

public class Owner {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("iconUrl")
    private String iconUrl;
    @JsonProperty("channel")
    private Object channel;
    @JsonProperty("live")
    private Object live;
    @JsonProperty("isVideosPublic")
    private Boolean isVideosPublic;
    @JsonProperty("isMylistsPublic")
    private Boolean isMylistsPublic;
    @JsonProperty("videoLiveNotice")
    private Object videoLiveNotice;
    @JsonProperty("viewer")
    private Viewer__1 viewer;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("iconUrl")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("iconUrl")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @JsonProperty("channel")
    public Object getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Object channel) {
        this.channel = channel;
    }

    @JsonProperty("live")
    public Object getLive() {
        return live;
    }

    @JsonProperty("live")
    public void setLive(Object live) {
        this.live = live;
    }

    @JsonProperty("isVideosPublic")
    public Boolean getIsVideosPublic() {
        return isVideosPublic;
    }

    @JsonProperty("isVideosPublic")
    public void setIsVideosPublic(Boolean isVideosPublic) {
        this.isVideosPublic = isVideosPublic;
    }

    @JsonProperty("isMylistsPublic")
    public Boolean getIsMylistsPublic() {
        return isMylistsPublic;
    }

    @JsonProperty("isMylistsPublic")
    public void setIsMylistsPublic(Boolean isMylistsPublic) {
        this.isMylistsPublic = isMylistsPublic;
    }

    @JsonProperty("videoLiveNotice")
    public Object getVideoLiveNotice() {
        return videoLiveNotice;
    }

    @JsonProperty("videoLiveNotice")
    public void setVideoLiveNotice(Object videoLiveNotice) {
        this.videoLiveNotice = videoLiveNotice;
    }

    @JsonProperty("viewer")
    public Viewer__1 getViewer() {
        return viewer;
    }

    @JsonProperty("viewer")
    public void setViewer(Viewer__1 viewer) {
        this.viewer = viewer;
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
        sb.append(Owner.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nickname");
        sb.append('=');
        sb.append(((this.nickname == null)?"<null>":this.nickname));
        sb.append(',');
        sb.append("iconUrl");
        sb.append('=');
        sb.append(((this.iconUrl == null)?"<null>":this.iconUrl));
        sb.append(',');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
        sb.append(',');
        sb.append("live");
        sb.append('=');
        sb.append(((this.live == null)?"<null>":this.live));
        sb.append(',');
        sb.append("isVideosPublic");
        sb.append('=');
        sb.append(((this.isVideosPublic == null)?"<null>":this.isVideosPublic));
        sb.append(',');
        sb.append("isMylistsPublic");
        sb.append('=');
        sb.append(((this.isMylistsPublic == null)?"<null>":this.isMylistsPublic));
        sb.append(',');
        sb.append("videoLiveNotice");
        sb.append('=');
        sb.append(((this.videoLiveNotice == null)?"<null>":this.videoLiveNotice));
        sb.append(',');
        sb.append("viewer");
        sb.append('=');
        sb.append(((this.viewer == null)?"<null>":this.viewer));
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
        result = ((result* 31)+((this.nickname == null)? 0 :this.nickname.hashCode()));
        result = ((result* 31)+((this.channel == null)? 0 :this.channel.hashCode()));
        result = ((result* 31)+((this.isMylistsPublic == null)? 0 :this.isMylistsPublic.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.iconUrl == null)? 0 :this.iconUrl.hashCode()));
        result = ((result* 31)+((this.isVideosPublic == null)? 0 :this.isVideosPublic.hashCode()));
        result = ((result* 31)+((this.videoLiveNotice == null)? 0 :this.videoLiveNotice.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.live == null)? 0 :this.live.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Owner)) {
            return false;
        }
        Owner rhs = ((Owner) other);
        return ((((((((((Objects.equals(this.viewer, rhs.viewer))&&(Objects.equals(this.nickname, rhs.nickname)))&&(Objects.equals(this.channel, rhs.channel)))&&(Objects.equals(this.isMylistsPublic, rhs.isMylistsPublic)))&&(Objects.equals(this.id, rhs.id)))&&(Objects.equals(this.iconUrl, rhs.iconUrl)))&&(Objects.equals(this.isVideosPublic, rhs.isVideosPublic)))&&(Objects.equals(this.videoLiveNotice, rhs.videoLiveNotice)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.live, rhs.live)));
    }

}
