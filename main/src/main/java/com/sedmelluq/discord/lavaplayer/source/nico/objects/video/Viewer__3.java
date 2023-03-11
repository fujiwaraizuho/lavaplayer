
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isOwner",
    "like"
})

public class Viewer__3 {

    @JsonProperty("isOwner")
    private Boolean isOwner;
    @JsonProperty("like")
    private Like like;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isOwner")
    public Boolean getIsOwner() {
        return isOwner;
    }

    @JsonProperty("isOwner")
    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    @JsonProperty("like")
    public Like getLike() {
        return like;
    }

    @JsonProperty("like")
    public void setLike(Like like) {
        this.like = like;
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
        sb.append(Viewer__3 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("isOwner");
        sb.append('=');
        sb.append(((this.isOwner == null)?"<null>":this.isOwner));
        sb.append(',');
        sb.append("like");
        sb.append('=');
        sb.append(((this.like == null)?"<null>":this.like));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isOwner == null)? 0 :this.isOwner.hashCode()));
        result = ((result* 31)+((this.like == null)? 0 :this.like.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Viewer__3)) {
            return false;
        }
        Viewer__3 rhs = ((Viewer__3) other);
        return (((Objects.equals(this.additionalProperties, rhs.additionalProperties))&&(Objects.equals(this.isOwner, rhs.isOwner)))&&(Objects.equals(this.like, rhs.like)));
    }

}
