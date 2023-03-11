
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hasContentTree"
})

public class Commons {

    @JsonProperty("hasContentTree")
    private Boolean hasContentTree;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hasContentTree")
    public Boolean getHasContentTree() {
        return hasContentTree;
    }

    @JsonProperty("hasContentTree")
    public void setHasContentTree(Boolean hasContentTree) {
        this.hasContentTree = hasContentTree;
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
        sb.append(Commons.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("hasContentTree");
        sb.append('=');
        sb.append(((this.hasContentTree == null)?"<null>":this.hasContentTree));
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
        result = ((result* 31)+((this.hasContentTree == null)? 0 :this.hasContentTree.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Commons)) {
            return false;
        }
        Commons rhs = ((Commons) other);
        return ((Objects.equals(this.hasContentTree, rhs.hasContentTree))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
