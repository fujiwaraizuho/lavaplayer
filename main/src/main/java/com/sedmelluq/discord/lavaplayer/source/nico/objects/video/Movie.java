
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contentId",
    "audios",
    "videos",
    "session"
})

public class Movie {

    @JsonProperty("contentId")
    private String contentId;
    @JsonProperty("audios")
    private List<Audio> audios = null;
    @JsonProperty("videos")
    private List<Video> videos = null;
    @JsonProperty("session")
    private Session session;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contentId")
    public String getContentId() {
        return contentId;
    }

    @JsonProperty("contentId")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    @JsonProperty("audios")
    public List<Audio> getAudios() {
        return audios;
    }

    @JsonProperty("audios")
    public void setAudios(List<Audio> audios) {
        this.audios = audios;
    }

    @JsonProperty("videos")
    public List<Video> getVideos() {
        return videos;
    }

    @JsonProperty("videos")
    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    @JsonProperty("session")
    public Session getSession() {
        return session;
    }

    @JsonProperty("session")
    public void setSession(Session session) {
        this.session = session;
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
        sb.append(Movie.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("contentId");
        sb.append('=');
        sb.append(((this.contentId == null)?"<null>":this.contentId));
        sb.append(',');
        sb.append("audios");
        sb.append('=');
        sb.append(((this.audios == null)?"<null>":this.audios));
        sb.append(',');
        sb.append("videos");
        sb.append('=');
        sb.append(((this.videos == null)?"<null>":this.videos));
        sb.append(',');
        sb.append("session");
        sb.append('=');
        sb.append(((this.session == null)?"<null>":this.session));
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
        result = ((result* 31)+((this.contentId == null)? 0 :this.contentId.hashCode()));
        result = ((result* 31)+((this.audios == null)? 0 :this.audios.hashCode()));
        result = ((result* 31)+((this.videos == null)? 0 :this.videos.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.session == null)? 0 :this.session.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Movie)) {
            return false;
        }
        Movie rhs = ((Movie) other);
        return (((((Objects.equals(this.contentId, rhs.contentId))&&(Objects.equals(this.audios, rhs.audios)))&&(Objects.equals(this.videos, rhs.videos)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.session, rhs.session)));
    }

}
