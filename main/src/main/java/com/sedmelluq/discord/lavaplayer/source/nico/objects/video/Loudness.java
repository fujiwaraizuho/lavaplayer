
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "integratedLoudness",
    "truePeak"
})

public class Loudness {

    @JsonProperty("integratedLoudness")
    private Double integratedLoudness;
    @JsonProperty("truePeak")
    private Double truePeak;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("integratedLoudness")
    public Double getIntegratedLoudness() {
        return integratedLoudness;
    }

    @JsonProperty("integratedLoudness")
    public void setIntegratedLoudness(Double integratedLoudness) {
        this.integratedLoudness = integratedLoudness;
    }

    @JsonProperty("truePeak")
    public Double getTruePeak() {
        return truePeak;
    }

    @JsonProperty("truePeak")
    public void setTruePeak(Double truePeak) {
        this.truePeak = truePeak;
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
        sb.append(Loudness.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("integratedLoudness");
        sb.append('=');
        sb.append(((this.integratedLoudness == null)?"<null>":this.integratedLoudness));
        sb.append(',');
        sb.append("truePeak");
        sb.append('=');
        sb.append(((this.truePeak == null)?"<null>":this.truePeak));
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
        result = ((result* 31)+((this.integratedLoudness == null)? 0 :this.integratedLoudness.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.truePeak == null)? 0 :this.truePeak.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Loudness)) {
            return false;
        }
        Loudness rhs = ((Loudness) other);
        return (((Objects.equals(this.integratedLoudness, rhs.integratedLoudness))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.truePeak, rhs.truePeak)));
    }

}
