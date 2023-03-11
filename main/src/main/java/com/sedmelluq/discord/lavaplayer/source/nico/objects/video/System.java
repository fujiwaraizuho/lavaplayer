
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "serverTime",
    "isPeakTime"
})

public class System {

    @JsonProperty("serverTime")
    private String serverTime;
    @JsonProperty("isPeakTime")
    private Boolean isPeakTime;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("serverTime")
    public String getServerTime() {
        return serverTime;
    }

    @JsonProperty("serverTime")
    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }

    @JsonProperty("isPeakTime")
    public Boolean getIsPeakTime() {
        return isPeakTime;
    }

    @JsonProperty("isPeakTime")
    public void setIsPeakTime(Boolean isPeakTime) {
        this.isPeakTime = isPeakTime;
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
        sb.append(System.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("serverTime");
        sb.append('=');
        sb.append(((this.serverTime == null)?"<null>":this.serverTime));
        sb.append(',');
        sb.append("isPeakTime");
        sb.append('=');
        sb.append(((this.isPeakTime == null)?"<null>":this.isPeakTime));
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
        result = ((result* 31)+((this.serverTime == null)? 0 :this.serverTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isPeakTime == null)? 0 :this.isPeakTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof System)) {
            return false;
        }
        System rhs = ((System) other);
        return (((Objects.equals(this.serverTime, rhs.serverTime))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.isPeakTime, rhs.isPeakTime)));
    }

}
