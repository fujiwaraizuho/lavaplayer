
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "isWellKnownPort",
    "isSsl"
})

public class Url__1 {

    @JsonProperty("url")
    private String url;
    @JsonProperty("isWellKnownPort")
    private Boolean isWellKnownPort;
    @JsonProperty("isSsl")
    private Boolean isSsl;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("isWellKnownPort")
    public Boolean getIsWellKnownPort() {
        return isWellKnownPort;
    }

    @JsonProperty("isWellKnownPort")
    public void setIsWellKnownPort(Boolean isWellKnownPort) {
        this.isWellKnownPort = isWellKnownPort;
    }

    @JsonProperty("isSsl")
    public Boolean getIsSsl() {
        return isSsl;
    }

    @JsonProperty("isSsl")
    public void setIsSsl(Boolean isSsl) {
        this.isSsl = isSsl;
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
        sb.append(Url__1 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("isWellKnownPort");
        sb.append('=');
        sb.append(((this.isWellKnownPort == null)?"<null>":this.isWellKnownPort));
        sb.append(',');
        sb.append("isSsl");
        sb.append('=');
        sb.append(((this.isSsl == null)?"<null>":this.isSsl));
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
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.isWellKnownPort == null)? 0 :this.isWellKnownPort.hashCode()));
        result = ((result* 31)+((this.isSsl == null)? 0 :this.isSsl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Url__1)) {
            return false;
        }
        Url__1 rhs = ((Url__1) other);
        return ((((Objects.equals(this.additionalProperties, rhs.additionalProperties))&&(Objects.equals(this.url, rhs.url)))&&(Objects.equals(this.isWellKnownPort, rhs.isWellKnownPort)))&&(Objects.equals(this.isSsl, rhs.isSsl)));
    }

}
