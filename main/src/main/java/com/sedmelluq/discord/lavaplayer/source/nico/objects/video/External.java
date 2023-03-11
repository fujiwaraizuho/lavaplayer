
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "commons",
    "ichiba"
})

public class External {

    @JsonProperty("commons")
    private Commons commons;
    @JsonProperty("ichiba")
    private Ichiba ichiba;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("commons")
    public Commons getCommons() {
        return commons;
    }

    @JsonProperty("commons")
    public void setCommons(Commons commons) {
        this.commons = commons;
    }

    @JsonProperty("ichiba")
    public Ichiba getIchiba() {
        return ichiba;
    }

    @JsonProperty("ichiba")
    public void setIchiba(Ichiba ichiba) {
        this.ichiba = ichiba;
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
        sb.append(External.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("commons");
        sb.append('=');
        sb.append(((this.commons == null)?"<null>":this.commons));
        sb.append(',');
        sb.append("ichiba");
        sb.append('=');
        sb.append(((this.ichiba == null)?"<null>":this.ichiba));
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
        result = ((result* 31)+((this.ichiba == null)? 0 :this.ichiba.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.commons == null)? 0 :this.commons.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof External)) {
            return false;
        }
        External rhs = ((External) other);
        return (((Objects.equals(this.ichiba, rhs.ichiba))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.commons, rhs.commons)));
    }

}
