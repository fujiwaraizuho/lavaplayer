
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bitrate",
    "samplingRate",
    "loudness",
    "levelIndex",
    "loudnessCollection"
})

public class Metadata {

    @JsonProperty("bitrate")
    private Long bitrate;
    @JsonProperty("samplingRate")
    private Long samplingRate;
    @JsonProperty("loudness")
    private Loudness loudness;
    @JsonProperty("levelIndex")
    private Long levelIndex;
    @JsonProperty("loudnessCollection")
    private List<LoudnessCollection> loudnessCollection = null;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bitrate")
    public Long getBitrate() {
        return bitrate;
    }

    @JsonProperty("bitrate")
    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }

    @JsonProperty("samplingRate")
    public Long getSamplingRate() {
        return samplingRate;
    }

    @JsonProperty("samplingRate")
    public void setSamplingRate(Long samplingRate) {
        this.samplingRate = samplingRate;
    }

    @JsonProperty("loudness")
    public Loudness getLoudness() {
        return loudness;
    }

    @JsonProperty("loudness")
    public void setLoudness(Loudness loudness) {
        this.loudness = loudness;
    }

    @JsonProperty("levelIndex")
    public Long getLevelIndex() {
        return levelIndex;
    }

    @JsonProperty("levelIndex")
    public void setLevelIndex(Long levelIndex) {
        this.levelIndex = levelIndex;
    }

    @JsonProperty("loudnessCollection")
    public List<LoudnessCollection> getLoudnessCollection() {
        return loudnessCollection;
    }

    @JsonProperty("loudnessCollection")
    public void setLoudnessCollection(List<LoudnessCollection> loudnessCollection) {
        this.loudnessCollection = loudnessCollection;
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
        sb.append(Metadata.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("bitrate");
        sb.append('=');
        sb.append(((this.bitrate == null)?"<null>":this.bitrate));
        sb.append(',');
        sb.append("samplingRate");
        sb.append('=');
        sb.append(((this.samplingRate == null)?"<null>":this.samplingRate));
        sb.append(',');
        sb.append("loudness");
        sb.append('=');
        sb.append(((this.loudness == null)?"<null>":this.loudness));
        sb.append(',');
        sb.append("levelIndex");
        sb.append('=');
        sb.append(((this.levelIndex == null)?"<null>":this.levelIndex));
        sb.append(',');
        sb.append("loudnessCollection");
        sb.append('=');
        sb.append(((this.loudnessCollection == null)?"<null>":this.loudnessCollection));
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
        result = ((result* 31)+((this.loudnessCollection == null)? 0 :this.loudnessCollection.hashCode()));
        result = ((result* 31)+((this.loudness == null)? 0 :this.loudness.hashCode()));
        result = ((result* 31)+((this.samplingRate == null)? 0 :this.samplingRate.hashCode()));
        result = ((result* 31)+((this.bitrate == null)? 0 :this.bitrate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Metadata)) {
            return false;
        }
        Metadata rhs = ((Metadata) other);
        return ((((((Objects.equals(this.levelIndex, rhs.levelIndex))&&(Objects.equals(this.loudnessCollection, rhs.loudnessCollection)))&&(Objects.equals(this.loudness, rhs.loudness)))&&(Objects.equals(this.samplingRate, rhs.samplingRate)))&&(Objects.equals(this.bitrate, rhs.bitrate)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
