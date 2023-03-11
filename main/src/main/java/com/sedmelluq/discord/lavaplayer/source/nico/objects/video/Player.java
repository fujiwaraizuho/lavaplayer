
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "initialPlayback",
    "comment",
    "layerMode"
})

public class Player {

    @JsonProperty("initialPlayback")
    private InitialPlayback initialPlayback;
    @JsonProperty("comment")
    private Comment__1 comment;
    @JsonProperty("layerMode")
    private Long layerMode;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("initialPlayback")
    public InitialPlayback getInitialPlayback() {
        return initialPlayback;
    }

    @JsonProperty("initialPlayback")
    public void setInitialPlayback(InitialPlayback initialPlayback) {
        this.initialPlayback = initialPlayback;
    }

    @JsonProperty("comment")
    public Comment__1 getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Comment__1 comment) {
        this.comment = comment;
    }

    @JsonProperty("layerMode")
    public Long getLayerMode() {
        return layerMode;
    }

    @JsonProperty("layerMode")
    public void setLayerMode(Long layerMode) {
        this.layerMode = layerMode;
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
        sb.append(Player.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("initialPlayback");
        sb.append('=');
        sb.append(((this.initialPlayback == null)?"<null>":this.initialPlayback));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("layerMode");
        sb.append('=');
        sb.append(((this.layerMode == null)?"<null>":this.layerMode));
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
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.initialPlayback == null)? 0 :this.initialPlayback.hashCode()));
        result = ((result* 31)+((this.layerMode == null)? 0 :this.layerMode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Player)) {
            return false;
        }
        Player rhs = ((Player) other);
        return ((((Objects.equals(this.comment, rhs.comment))&&(Objects.equals(this.initialPlayback, rhs.initialPlayback)))&&(Objects.equals(this.layerMode, rhs.layerMode)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
