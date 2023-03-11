
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isLiked",
    "count"
})

public class Like {

    @JsonProperty("isLiked")
    private Boolean isLiked;
    @JsonProperty("count")
    private Object count;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isLiked")
    public Boolean getIsLiked() {
        return isLiked;
    }

    @JsonProperty("isLiked")
    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    @JsonProperty("count")
    public Object getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Object count) {
        this.count = count;
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
        sb.append(Like.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("isLiked");
        sb.append('=');
        sb.append(((this.isLiked == null)?"<null>":this.isLiked));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
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
        result = ((result* 31)+((this.isLiked == null)? 0 :this.isLiked.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Like)) {
            return false;
        }
        Like rhs = ((Like) other);
        return (((Objects.equals(this.isLiked, rhs.isLiked))&&(Objects.equals(this.count, rhs.count)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
