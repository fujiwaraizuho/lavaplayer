
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isDisabled"
})

public class NgScore {

    @JsonProperty("isDisabled")
    private Boolean isDisabled;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isDisabled")
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    @JsonProperty("isDisabled")
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
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
        sb.append(NgScore.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("isDisabled");
        sb.append('=');
        sb.append(((this.isDisabled == null)?"<null>":this.isDisabled));
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
        result = ((result* 31)+((this.isDisabled == null)? 0 :this.isDisabled.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NgScore)) {
            return false;
        }
        NgScore rhs = ((NgScore) other);
        return ((Objects.equals(this.isDisabled, rhs.isDisabled))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
