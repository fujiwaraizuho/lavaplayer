
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "videoId",
    "videoDuration",
    "isAdultRatingNG",
    "isAuthenticationRequired",
    "isR18",
    "nicosid",
    "lang",
    "watchTrackId",
    "genre",
    "gender",
    "age"
})
public class AdditionalParams {

    @JsonProperty("videoId")
    private String videoId;
    @JsonProperty("videoDuration")
    private Long videoDuration;
    @JsonProperty("isAdultRatingNG")
    private Boolean isAdultRatingNG;
    @JsonProperty("isAuthenticationRequired")
    private Boolean isAuthenticationRequired;
    @JsonProperty("isR18")
    private Boolean isR18;
    @JsonProperty("nicosid")
    private String nicosid;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("watchTrackId")
    private String watchTrackId;
    @JsonProperty("genre")
    private String genre;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("age")
    private Long age;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("videoId")
    public String getVideoId() {
        return videoId;
    }

    @JsonProperty("videoId")
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    @JsonProperty("videoDuration")
    public Long getVideoDuration() {
        return videoDuration;
    }

    @JsonProperty("videoDuration")
    public void setVideoDuration(Long videoDuration) {
        this.videoDuration = videoDuration;
    }

    @JsonProperty("isAdultRatingNG")
    public Boolean getIsAdultRatingNG() {
        return isAdultRatingNG;
    }

    @JsonProperty("isAdultRatingNG")
    public void setIsAdultRatingNG(Boolean isAdultRatingNG) {
        this.isAdultRatingNG = isAdultRatingNG;
    }

    @JsonProperty("isAuthenticationRequired")
    public Boolean getIsAuthenticationRequired() {
        return isAuthenticationRequired;
    }

    @JsonProperty("isAuthenticationRequired")
    public void setIsAuthenticationRequired(Boolean isAuthenticationRequired) {
        this.isAuthenticationRequired = isAuthenticationRequired;
    }

    @JsonProperty("isR18")
    public Boolean getIsR18() {
        return isR18;
    }

    @JsonProperty("isR18")
    public void setIsR18(Boolean isR18) {
        this.isR18 = isR18;
    }

    @JsonProperty("nicosid")
    public String getNicosid() {
        return nicosid;
    }

    @JsonProperty("nicosid")
    public void setNicosid(String nicosid) {
        this.nicosid = nicosid;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("watchTrackId")
    public String getWatchTrackId() {
        return watchTrackId;
    }

    @JsonProperty("watchTrackId")
    public void setWatchTrackId(String watchTrackId) {
        this.watchTrackId = watchTrackId;
    }

    @JsonProperty("genre")
    public String getGenre() {
        return genre;
    }

    @JsonProperty("genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("age")
    public Long getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Long age) {
        this.age = age;
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
        sb.append(AdditionalParams.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("videoId");
        sb.append('=');
        sb.append(((this.videoId == null)?"<null>":this.videoId));
        sb.append(',');
        sb.append("videoDuration");
        sb.append('=');
        sb.append(((this.videoDuration == null)?"<null>":this.videoDuration));
        sb.append(',');
        sb.append("isAdultRatingNG");
        sb.append('=');
        sb.append(((this.isAdultRatingNG == null)?"<null>":this.isAdultRatingNG));
        sb.append(',');
        sb.append("isAuthenticationRequired");
        sb.append('=');
        sb.append(((this.isAuthenticationRequired == null)?"<null>":this.isAuthenticationRequired));
        sb.append(',');
        sb.append("isR18");
        sb.append('=');
        sb.append(((this.isR18 == null)?"<null>":this.isR18));
        sb.append(',');
        sb.append("nicosid");
        sb.append('=');
        sb.append(((this.nicosid == null)?"<null>":this.nicosid));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
        sb.append(',');
        sb.append("watchTrackId");
        sb.append('=');
        sb.append(((this.watchTrackId == null)?"<null>":this.watchTrackId));
        sb.append(',');
        sb.append("genre");
        sb.append('=');
        sb.append(((this.genre == null)?"<null>":this.genre));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("age");
        sb.append('=');
        sb.append(((this.age == null)?"<null>":this.age));
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
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.nicosid == null)? 0 :this.nicosid.hashCode()));
        result = ((result* 31)+((this.videoId == null)? 0 :this.videoId.hashCode()));
        result = ((result* 31)+((this.isAdultRatingNG == null)? 0 :this.isAdultRatingNG.hashCode()));
        result = ((result* 31)+((this.isR18 == null)? 0 :this.isR18 .hashCode()));
        result = ((result* 31)+((this.videoDuration == null)? 0 :this.videoDuration.hashCode()));
        result = ((result* 31)+((this.isAuthenticationRequired == null)? 0 :this.isAuthenticationRequired.hashCode()));
        result = ((result* 31)+((this.genre == null)? 0 :this.genre.hashCode()));
        result = ((result* 31)+((this.watchTrackId == null)? 0 :this.watchTrackId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        result = ((result* 31)+((this.age == null)? 0 :this.age.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdditionalParams)) {
            return false;
        }
        AdditionalParams rhs = ((AdditionalParams) other);
        return ((((((((((((Objects.equals(this.gender, rhs.gender))&&(Objects.equals(this.nicosid, rhs.nicosid)))&&(Objects.equals(this.videoId, rhs.videoId)))&&(Objects.equals(this.isAdultRatingNG, rhs.isAdultRatingNG)))&&(Objects.equals(this.isR18, rhs.isR18)))&&(Objects.equals(this.videoDuration, rhs.videoDuration)))&&(Objects.equals(this.isAuthenticationRequired, rhs.isAuthenticationRequired)))&&(Objects.equals(this.genre, rhs.genre)))&&(Objects.equals(this.watchTrackId, rhs.watchTrackId)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.lang, rhs.lang)))&&(Objects.equals(this.age, rhs.age)));
    }

}
