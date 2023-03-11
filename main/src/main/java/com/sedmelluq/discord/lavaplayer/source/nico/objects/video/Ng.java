
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ngScore",
    "channel",
    "owner",
    "viewer"
})

public class Ng {

    @JsonProperty("ngScore")
    private NgScore ngScore;
    @JsonProperty("channel")
    private List<Object> channel = null;
    @JsonProperty("owner")
    private List<Object> owner = null;
    @JsonProperty("viewer")
    private Viewer viewer;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ngScore")
    public NgScore getNgScore() {
        return ngScore;
    }

    @JsonProperty("ngScore")
    public void setNgScore(NgScore ngScore) {
        this.ngScore = ngScore;
    }

    @JsonProperty("channel")
    public List<Object> getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(List<Object> channel) {
        this.channel = channel;
    }

    @JsonProperty("owner")
    public List<Object> getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(List<Object> owner) {
        this.owner = owner;
    }

    @JsonProperty("viewer")
    public Viewer getViewer() {
        return viewer;
    }

    @JsonProperty("viewer")
    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
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
        sb.append(Ng.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("ngScore");
        sb.append('=');
        sb.append(((this.ngScore == null)?"<null>":this.ngScore));
        sb.append(',');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("viewer");
        sb.append('=');
        sb.append(((this.viewer == null)?"<null>":this.viewer));
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
        result = ((result* 31)+((this.channel == null)? 0 :this.channel.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.ngScore == null)? 0 :this.ngScore.hashCode()));
        result = ((result* 31)+((this.viewer == null)? 0 :this.viewer.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Ng)) {
            return false;
        }
        Ng rhs = ((Ng) other);
        return (((((Objects.equals(this.channel, rhs.channel))&&(Objects.equals(this.owner, rhs.owner)))&&(Objects.equals(this.ngScore, rhs.ngScore)))&&(Objects.equals(this.viewer, rhs.viewer)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
