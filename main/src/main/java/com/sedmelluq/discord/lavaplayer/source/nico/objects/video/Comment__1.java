
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isDefaultInvisible"
})

public class Comment__1 {

    @JsonProperty("isDefaultInvisible")
    private Boolean isDefaultInvisible;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isDefaultInvisible")
    public Boolean getIsDefaultInvisible() {
        return isDefaultInvisible;
    }

    @JsonProperty("isDefaultInvisible")
    public void setIsDefaultInvisible(Boolean isDefaultInvisible) {
        this.isDefaultInvisible = isDefaultInvisible;
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
        sb.append(Comment__1 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("isDefaultInvisible");
        sb.append('=');
        sb.append(((this.isDefaultInvisible == null)?"<null>":this.isDefaultInvisible));
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
        result = ((result* 31)+((this.isDefaultInvisible == null)? 0 :this.isDefaultInvisible.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Comment__1)) {
            return false;
        }
        Comment__1 rhs = ((Comment__1) other);
        return ((Objects.equals(this.isDefaultInvisible, rhs.isDefaultInvisible))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
