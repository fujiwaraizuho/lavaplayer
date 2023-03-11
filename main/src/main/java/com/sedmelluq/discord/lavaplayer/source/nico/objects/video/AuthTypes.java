
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "http",
    "hls"
})

public class AuthTypes {

    @JsonProperty("http")
    private String http;
    @JsonProperty("hls")
    private String hls;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("http")
    public String getHttp() {
        return http;
    }

    @JsonProperty("http")
    public void setHttp(String http) {
        this.http = http;
    }

    @JsonProperty("hls")
    public String getHls() {
        return hls;
    }

    @JsonProperty("hls")
    public void setHls(String hls) {
        this.hls = hls;
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
        sb.append(AuthTypes.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("http");
        sb.append('=');
        sb.append(((this.http == null)?"<null>":this.http));
        sb.append(',');
        sb.append("hls");
        sb.append('=');
        sb.append(((this.hls == null)?"<null>":this.hls));
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
        result = ((result* 31)+((this.http == null)? 0 :this.http.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.hls == null)? 0 :this.hls.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AuthTypes)) {
            return false;
        }
        AuthTypes rhs = ((AuthTypes) other);
        return (((Objects.equals(this.http, rhs.http))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.hls, rhs.hls)));
    }

}
