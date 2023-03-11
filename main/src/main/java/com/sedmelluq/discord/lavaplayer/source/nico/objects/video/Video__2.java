
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "description",
    "count",
    "duration",
    "thumbnail",
    "rating",
    "registeredAt",
    "isPrivate",
    "isDeleted",
    "isNoBanner",
    "isAuthenticationRequired",
    "isEmbedPlayerAllowed",
    "isGiftAllowed",
    "viewer",
    "watchableUserTypeForPayment",
    "commentableUserTypeForPayment",
    "9d091f87"
})

public class Video__2 {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("count")
    private Count count;
    @JsonProperty("duration")
    private Long duration;
    @JsonProperty("thumbnail")
    private Thumbnail thumbnail;
    @JsonProperty("rating")
    private Rating rating;
    @JsonProperty("registeredAt")
    private String registeredAt;
    @JsonProperty("isPrivate")
    private Boolean isPrivate;
    @JsonProperty("isDeleted")
    private Boolean isDeleted;
    @JsonProperty("isNoBanner")
    private Boolean isNoBanner;
    @JsonProperty("isAuthenticationRequired")
    private Boolean isAuthenticationRequired;
    @JsonProperty("isEmbedPlayerAllowed")
    private Boolean isEmbedPlayerAllowed;
    @JsonProperty("isGiftAllowed")
    private Boolean isGiftAllowed;
    @JsonProperty("viewer")
    private Viewer__3 viewer;
    @JsonProperty("watchableUserTypeForPayment")
    private String watchableUserTypeForPayment;
    @JsonProperty("commentableUserTypeForPayment")
    private String commentableUserTypeForPayment;
    @JsonProperty("9d091f87")
    private Boolean _9d091f87;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("count")
    public Count getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Count count) {
        this.count = count;
    }

    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @JsonProperty("thumbnail")
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("rating")
    public Rating getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @JsonProperty("registeredAt")
    public String getRegisteredAt() {
        return registeredAt;
    }

    @JsonProperty("registeredAt")
    public void setRegisteredAt(String registeredAt) {
        this.registeredAt = registeredAt;
    }

    @JsonProperty("isPrivate")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("isPrivate")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("isNoBanner")
    public Boolean getIsNoBanner() {
        return isNoBanner;
    }

    @JsonProperty("isNoBanner")
    public void setIsNoBanner(Boolean isNoBanner) {
        this.isNoBanner = isNoBanner;
    }

    @JsonProperty("isAuthenticationRequired")
    public Boolean getIsAuthenticationRequired() {
        return isAuthenticationRequired;
    }

    @JsonProperty("isAuthenticationRequired")
    public void setIsAuthenticationRequired(Boolean isAuthenticationRequired) {
        this.isAuthenticationRequired = isAuthenticationRequired;
    }

    @JsonProperty("isEmbedPlayerAllowed")
    public Boolean getIsEmbedPlayerAllowed() {
        return isEmbedPlayerAllowed;
    }

    @JsonProperty("isEmbedPlayerAllowed")
    public void setIsEmbedPlayerAllowed(Boolean isEmbedPlayerAllowed) {
        this.isEmbedPlayerAllowed = isEmbedPlayerAllowed;
    }

    @JsonProperty("isGiftAllowed")
    public Boolean getIsGiftAllowed() {
        return isGiftAllowed;
    }

    @JsonProperty("isGiftAllowed")
    public void setIsGiftAllowed(Boolean isGiftAllowed) {
        this.isGiftAllowed = isGiftAllowed;
    }

    @JsonProperty("viewer")
    public Viewer__3 getViewer() {
        return viewer;
    }

    @JsonProperty("viewer")
    public void setViewer(Viewer__3 viewer) {
        this.viewer = viewer;
    }

    @JsonProperty("watchableUserTypeForPayment")
    public String getWatchableUserTypeForPayment() {
        return watchableUserTypeForPayment;
    }

    @JsonProperty("watchableUserTypeForPayment")
    public void setWatchableUserTypeForPayment(String watchableUserTypeForPayment) {
        this.watchableUserTypeForPayment = watchableUserTypeForPayment;
    }

    @JsonProperty("commentableUserTypeForPayment")
    public String getCommentableUserTypeForPayment() {
        return commentableUserTypeForPayment;
    }

    @JsonProperty("commentableUserTypeForPayment")
    public void setCommentableUserTypeForPayment(String commentableUserTypeForPayment) {
        this.commentableUserTypeForPayment = commentableUserTypeForPayment;
    }

    @JsonProperty("9d091f87")
    public Boolean get9d091f87() {
        return _9d091f87;
    }

    @JsonProperty("9d091f87")
    public void set9d091f87(Boolean _9d091f87) {
        this._9d091f87 = _9d091f87;
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
        sb.append(Video__2 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("thumbnail");
        sb.append('=');
        sb.append(((this.thumbnail == null)?"<null>":this.thumbnail));
        sb.append(',');
        sb.append("rating");
        sb.append('=');
        sb.append(((this.rating == null)?"<null>":this.rating));
        sb.append(',');
        sb.append("registeredAt");
        sb.append('=');
        sb.append(((this.registeredAt == null)?"<null>":this.registeredAt));
        sb.append(',');
        sb.append("isPrivate");
        sb.append('=');
        sb.append(((this.isPrivate == null)?"<null>":this.isPrivate));
        sb.append(',');
        sb.append("isDeleted");
        sb.append('=');
        sb.append(((this.isDeleted == null)?"<null>":this.isDeleted));
        sb.append(',');
        sb.append("isNoBanner");
        sb.append('=');
        sb.append(((this.isNoBanner == null)?"<null>":this.isNoBanner));
        sb.append(',');
        sb.append("isAuthenticationRequired");
        sb.append('=');
        sb.append(((this.isAuthenticationRequired == null)?"<null>":this.isAuthenticationRequired));
        sb.append(',');
        sb.append("isEmbedPlayerAllowed");
        sb.append('=');
        sb.append(((this.isEmbedPlayerAllowed == null)?"<null>":this.isEmbedPlayerAllowed));
        sb.append(',');
        sb.append("isGiftAllowed");
        sb.append('=');
        sb.append(((this.isGiftAllowed == null)?"<null>":this.isGiftAllowed));
        sb.append(',');
        sb.append("viewer");
        sb.append('=');
        sb.append(((this.viewer == null)?"<null>":this.viewer));
        sb.append(',');
        sb.append("watchableUserTypeForPayment");
        sb.append('=');
        sb.append(((this.watchableUserTypeForPayment == null)?"<null>":this.watchableUserTypeForPayment));
        sb.append(',');
        sb.append("commentableUserTypeForPayment");
        sb.append('=');
        sb.append(((this.commentableUserTypeForPayment == null)?"<null>":this.commentableUserTypeForPayment));
        sb.append(',');
        sb.append("_9d091f87");
        sb.append('=');
        sb.append(((this._9d091f87 == null)?"<null>":this._9d091f87));
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
        result = ((result* 31)+((this.isNoBanner == null)? 0 :this.isNoBanner.hashCode()));
        result = ((result* 31)+((this.viewer == null)? 0 :this.viewer.hashCode()));
        result = ((result* 31)+((this.thumbnail == null)? 0 :this.thumbnail.hashCode()));
        result = ((result* 31)+((this.isGiftAllowed == null)? 0 :this.isGiftAllowed.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.rating == null)? 0 :this.rating.hashCode()));
        result = ((result* 31)+((this.registeredAt == null)? 0 :this.registeredAt.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.isPrivate == null)? 0 :this.isPrivate.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.watchableUserTypeForPayment == null)? 0 :this.watchableUserTypeForPayment.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.isEmbedPlayerAllowed == null)? 0 :this.isEmbedPlayerAllowed.hashCode()));
        result = ((result* 31)+((this.isDeleted == null)? 0 :this.isDeleted.hashCode()));
        result = ((result* 31)+((this.isAuthenticationRequired == null)? 0 :this.isAuthenticationRequired.hashCode()));
        result = ((result* 31)+((this.commentableUserTypeForPayment == null)? 0 :this.commentableUserTypeForPayment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._9d091f87 == null)? 0 :this._9d091f87 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Video__2)) {
            return false;
        }
        Video__2 rhs = ((Video__2) other);
        return (((((((((((((((((((Objects.equals(this.isNoBanner, rhs.isNoBanner))&&(Objects.equals(this.viewer, rhs.viewer)))&&(Objects.equals(this.thumbnail, rhs.thumbnail)))&&(Objects.equals(this.isGiftAllowed, rhs.isGiftAllowed)))&&(Objects.equals(this.count, rhs.count)))&&(Objects.equals(this.rating, rhs.rating)))&&(Objects.equals(this.registeredAt, rhs.registeredAt)))&&(Objects.equals(this.description, rhs.description)))&&(Objects.equals(this.isPrivate, rhs.isPrivate)))&&(Objects.equals(this.title, rhs.title)))&&(Objects.equals(this.watchableUserTypeForPayment, rhs.watchableUserTypeForPayment)))&&(Objects.equals(this.duration, rhs.duration)))&&(Objects.equals(this.isEmbedPlayerAllowed, rhs.isEmbedPlayerAllowed)))&&(Objects.equals(this.isDeleted, rhs.isDeleted)))&&(Objects.equals(this.isAuthenticationRequired, rhs.isAuthenticationRequired)))&&(Objects.equals(this.commentableUserTypeForPayment, rhs.commentableUserTypeForPayment)))&&(Objects.equals(this.id, rhs.id)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this._9d091f87, rhs._9d091f87)));
    }

}
