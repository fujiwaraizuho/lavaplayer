
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "recipeId",
    "playerId",
    "videos",
    "audios",
    "movies",
    "protocols",
    "authTypes",
    "serviceUserId",
    "token",
    "signature",
    "contentId",
    "heartbeatLifetime",
    "contentKeyTimeout",
    "priority",
    "transferPresets",
    "urls"
})

public class Session {

    @JsonProperty("recipeId")
    private String recipeId;
    @JsonProperty("playerId")
    private String playerId;
    @JsonProperty("videos")
    private List<String> videos = null;
    @JsonProperty("audios")
    private List<String> audios = null;
    @JsonProperty("movies")
    private List<Object> movies = null;
    @JsonProperty("protocols")
    private List<String> protocols = null;
    @JsonProperty("authTypes")
    private AuthTypes authTypes;
    @JsonProperty("serviceUserId")
    private String serviceUserId;
    @JsonProperty("token")
    private String token;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("contentId")
    private String contentId;
    @JsonProperty("heartbeatLifetime")
    private Long heartbeatLifetime;
    @JsonProperty("contentKeyTimeout")
    private Long contentKeyTimeout;
    @JsonProperty("priority")
    private Double priority;
    @JsonProperty("transferPresets")
    private List<String> transferPresets = null;
    @JsonProperty("urls")
    private List<Url> urls = null;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("recipeId")
    public String getRecipeId() {
        return recipeId;
    }

    @JsonProperty("recipeId")
    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    @JsonProperty("playerId")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("playerId")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("videos")
    public List<String> getVideos() {
        return videos;
    }

    @JsonProperty("videos")
    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    @JsonProperty("audios")
    public List<String> getAudios() {
        return audios;
    }

    @JsonProperty("audios")
    public void setAudios(List<String> audios) {
        this.audios = audios;
    }

    @JsonProperty("movies")
    public List<Object> getMovies() {
        return movies;
    }

    @JsonProperty("movies")
    public void setMovies(List<Object> movies) {
        this.movies = movies;
    }

    @JsonProperty("protocols")
    public List<String> getProtocols() {
        return protocols;
    }

    @JsonProperty("protocols")
    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    @JsonProperty("authTypes")
    public AuthTypes getAuthTypes() {
        return authTypes;
    }

    @JsonProperty("authTypes")
    public void setAuthTypes(AuthTypes authTypes) {
        this.authTypes = authTypes;
    }

    @JsonProperty("serviceUserId")
    public String getServiceUserId() {
        return serviceUserId;
    }

    @JsonProperty("serviceUserId")
    public void setServiceUserId(String serviceUserId) {
        this.serviceUserId = serviceUserId;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("signature")
    public String getSignature() {
        return signature;
    }

    @JsonProperty("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    @JsonProperty("contentId")
    public String getContentId() {
        return contentId;
    }

    @JsonProperty("contentId")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    @JsonProperty("heartbeatLifetime")
    public Long getHeartbeatLifetime() {
        return heartbeatLifetime;
    }

    @JsonProperty("heartbeatLifetime")
    public void setHeartbeatLifetime(Long heartbeatLifetime) {
        this.heartbeatLifetime = heartbeatLifetime;
    }

    @JsonProperty("contentKeyTimeout")
    public Long getContentKeyTimeout() {
        return contentKeyTimeout;
    }

    @JsonProperty("contentKeyTimeout")
    public void setContentKeyTimeout(Long contentKeyTimeout) {
        this.contentKeyTimeout = contentKeyTimeout;
    }

    @JsonProperty("priority")
    public Double getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    @JsonProperty("transferPresets")
    public List<String> getTransferPresets() {
        return transferPresets;
    }

    @JsonProperty("transferPresets")
    public void setTransferPresets(List<String> transferPresets) {
        this.transferPresets = transferPresets;
    }

    @JsonProperty("urls")
    public List<Url> getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(List<Url> urls) {
        this.urls = urls;
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
        sb.append(Session.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("recipeId");
        sb.append('=');
        sb.append(((this.recipeId == null)?"<null>":this.recipeId));
        sb.append(',');
        sb.append("playerId");
        sb.append('=');
        sb.append(((this.playerId == null)?"<null>":this.playerId));
        sb.append(',');
        sb.append("videos");
        sb.append('=');
        sb.append(((this.videos == null)?"<null>":this.videos));
        sb.append(',');
        sb.append("audios");
        sb.append('=');
        sb.append(((this.audios == null)?"<null>":this.audios));
        sb.append(',');
        sb.append("movies");
        sb.append('=');
        sb.append(((this.movies == null)?"<null>":this.movies));
        sb.append(',');
        sb.append("protocols");
        sb.append('=');
        sb.append(((this.protocols == null)?"<null>":this.protocols));
        sb.append(',');
        sb.append("authTypes");
        sb.append('=');
        sb.append(((this.authTypes == null)?"<null>":this.authTypes));
        sb.append(',');
        sb.append("serviceUserId");
        sb.append('=');
        sb.append(((this.serviceUserId == null)?"<null>":this.serviceUserId));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("signature");
        sb.append('=');
        sb.append(((this.signature == null)?"<null>":this.signature));
        sb.append(',');
        sb.append("contentId");
        sb.append('=');
        sb.append(((this.contentId == null)?"<null>":this.contentId));
        sb.append(',');
        sb.append("heartbeatLifetime");
        sb.append('=');
        sb.append(((this.heartbeatLifetime == null)?"<null>":this.heartbeatLifetime));
        sb.append(',');
        sb.append("contentKeyTimeout");
        sb.append('=');
        sb.append(((this.contentKeyTimeout == null)?"<null>":this.contentKeyTimeout));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("transferPresets");
        sb.append('=');
        sb.append(((this.transferPresets == null)?"<null>":this.transferPresets));
        sb.append(',');
        sb.append("urls");
        sb.append('=');
        sb.append(((this.urls == null)?"<null>":this.urls));
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
        result = ((result* 31)+((this.contentKeyTimeout == null)? 0 :this.contentKeyTimeout.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this.transferPresets == null)? 0 :this.transferPresets.hashCode()));
        result = ((result* 31)+((this.heartbeatLifetime == null)? 0 :this.heartbeatLifetime.hashCode()));
        result = ((result* 31)+((this.contentId == null)? 0 :this.contentId.hashCode()));
        result = ((result* 31)+((this.videos == null)? 0 :this.videos.hashCode()));
        result = ((result* 31)+((this.authTypes == null)? 0 :this.authTypes.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.recipeId == null)? 0 :this.recipeId.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        result = ((result* 31)+((this.movies == null)? 0 :this.movies.hashCode()));
        result = ((result* 31)+((this.urls == null)? 0 :this.urls.hashCode()));
        result = ((result* 31)+((this.serviceUserId == null)? 0 :this.serviceUserId.hashCode()));
        result = ((result* 31)+((this.audios == null)? 0 :this.audios.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.protocols == null)? 0 :this.protocols.hashCode()));
        result = ((result* 31)+((this.playerId == null)? 0 :this.playerId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Session)) {
            return false;
        }
        Session rhs = ((Session) other);
        return (((((((((((((((((Objects.equals(this.contentKeyTimeout, rhs.contentKeyTimeout))&&(Objects.equals(this.signature, rhs.signature)))&&(Objects.equals(this.transferPresets, rhs.transferPresets)))&&(Objects.equals(this.heartbeatLifetime, rhs.heartbeatLifetime)))&&(Objects.equals(this.contentId, rhs.contentId)))&&(Objects.equals(this.videos, rhs.videos)))&&(Objects.equals(this.authTypes, rhs.authTypes)))&&(Objects.equals(this.priority, rhs.priority)))&&(Objects.equals(this.recipeId, rhs.recipeId)))&&(Objects.equals(this.token, rhs.token)))&&(Objects.equals(this.movies, rhs.movies)))&&(Objects.equals(this.urls, rhs.urls)))&&(Objects.equals(this.serviceUserId, rhs.serviceUserId)))&&(Objects.equals(this.audios, rhs.audios)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.protocols, rhs.protocols)))&&(Objects.equals(this.playerId, rhs.playerId)));
    }

}
