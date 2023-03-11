
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "label",
    "bitrate",
    "resolution",
    "levelIndex",
    "recommendedHighestAudioLevelIndex"
})

public class Metadata__1 {

    @JsonProperty("label")
    private String label;
    @JsonProperty("bitrate")
    private Long bitrate;
    @JsonProperty("resolution")
    private Resolution resolution;
    @JsonProperty("levelIndex")
    private Long levelIndex;
    @JsonProperty("recommendedHighestAudioLevelIndex")
    private Long recommendedHighestAudioLevelIndex;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("bitrate")
    public Long getBitrate() {
        return bitrate;
    }

    @JsonProperty("bitrate")
    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }

    @JsonProperty("resolution")
    public Resolution getResolution() {
        return resolution;
    }

    @JsonProperty("resolution")
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @JsonProperty("levelIndex")
    public Long getLevelIndex() {
        return levelIndex;
    }

    @JsonProperty("levelIndex")
    public void setLevelIndex(Long levelIndex) {
        this.levelIndex = levelIndex;
    }

    @JsonProperty("recommendedHighestAudioLevelIndex")
    public Long getRecommendedHighestAudioLevelIndex() {
        return recommendedHighestAudioLevelIndex;
    }

    @JsonProperty("recommendedHighestAudioLevelIndex")
    public void setRecommendedHighestAudioLevelIndex(Long recommendedHighestAudioLevelIndex) {
        this.recommendedHighestAudioLevelIndex = recommendedHighestAudioLevelIndex;
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
        sb.append(Metadata__1 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("bitrate");
        sb.append('=');
        sb.append(((this.bitrate == null)?"<null>":this.bitrate));
        sb.append(',');
        sb.append("resolution");
        sb.append('=');
        sb.append(((this.resolution == null)?"<null>":this.resolution));
        sb.append(',');
        sb.append("levelIndex");
        sb.append('=');
        sb.append(((this.levelIndex == null)?"<null>":this.levelIndex));
        sb.append(',');
        sb.append("recommendedHighestAudioLevelIndex");
        sb.append('=');
        sb.append(((this.recommendedHighestAudioLevelIndex == null)?"<null>":this.recommendedHighestAudioLevelIndex));
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
        result = ((result* 31)+((this.levelIndex == null)? 0 :this.levelIndex.hashCode()));
        result = ((result* 31)+((this.recommendedHighestAudioLevelIndex == null)? 0 :this.recommendedHighestAudioLevelIndex.hashCode()));
        result = ((result* 31)+((this.bitrate == null)? 0 :this.bitrate.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resolution == null)? 0 :this.resolution.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Metadata__1)) {
            return false;
        }
        Metadata__1 rhs = ((Metadata__1) other);
        return ((((((Objects.equals(this.levelIndex, rhs.levelIndex))&&(Objects.equals(this.recommendedHighestAudioLevelIndex, rhs.recommendedHighestAudioLevelIndex)))&&(Objects.equals(this.bitrate, rhs.bitrate)))&&(Objects.equals(this.label, rhs.label)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.resolution, rhs.resolution)));
    }

}
