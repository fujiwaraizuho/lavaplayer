
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bannerIn",
    "overlay"
})

public class VideoEnd {

    @JsonProperty("bannerIn")
    private Object bannerIn;
    @JsonProperty("overlay")
    private Object overlay;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bannerIn")
    public Object getBannerIn() {
        return bannerIn;
    }

    @JsonProperty("bannerIn")
    public void setBannerIn(Object bannerIn) {
        this.bannerIn = bannerIn;
    }

    @JsonProperty("overlay")
    public Object getOverlay() {
        return overlay;
    }

    @JsonProperty("overlay")
    public void setOverlay(Object overlay) {
        this.overlay = overlay;
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
        sb.append(VideoEnd.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("bannerIn");
        sb.append('=');
        sb.append(((this.bannerIn == null)?"<null>":this.bannerIn));
        sb.append(',');
        sb.append("overlay");
        sb.append('=');
        sb.append(((this.overlay == null)?"<null>":this.overlay));
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
        result = ((result* 31)+((this.bannerIn == null)? 0 :this.bannerIn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.overlay == null)? 0 :this.overlay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof VideoEnd)) {
            return false;
        }
        VideoEnd rhs = ((VideoEnd) other);
        return (((Objects.equals(this.bannerIn, rhs.bannerIn))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.overlay, rhs.overlay)));
    }

}
