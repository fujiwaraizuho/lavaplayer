
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isFollowing"
})

public class Viewer__1 {

    @JsonProperty("isFollowing")
    private Boolean isFollowing;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isFollowing")
    public Boolean getIsFollowing() {
        return isFollowing;
    }

    @JsonProperty("isFollowing")
    public void setIsFollowing(Boolean isFollowing) {
        this.isFollowing = isFollowing;
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
        sb.append(Viewer__1 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("isFollowing");
        sb.append('=');
        sb.append(((this.isFollowing == null)?"<null>":this.isFollowing));
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
        result = ((result* 31)+((this.isFollowing == null)? 0 :this.isFollowing.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Viewer__1)) {
            return false;
        }
        Viewer__1 rhs = ((Viewer__1) other);
        return ((Objects.equals(this.isFollowing, rhs.isFollowing))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
