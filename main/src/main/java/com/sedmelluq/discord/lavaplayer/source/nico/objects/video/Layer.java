
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "index",
    "isTranslucent",
    "threadIds"
})

public class Layer {

    @JsonProperty("index")
    private Long index;
    @JsonProperty("isTranslucent")
    private Boolean isTranslucent;
    @JsonProperty("threadIds")
    private List<ThreadId> threadIds = null;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("index")
    public Long getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(Long index) {
        this.index = index;
    }

    @JsonProperty("isTranslucent")
    public Boolean getIsTranslucent() {
        return isTranslucent;
    }

    @JsonProperty("isTranslucent")
    public void setIsTranslucent(Boolean isTranslucent) {
        this.isTranslucent = isTranslucent;
    }

    @JsonProperty("threadIds")
    public List<ThreadId> getThreadIds() {
        return threadIds;
    }

    @JsonProperty("threadIds")
    public void setThreadIds(List<ThreadId> threadIds) {
        this.threadIds = threadIds;
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
        sb.append(Layer.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("isTranslucent");
        sb.append('=');
        sb.append(((this.isTranslucent == null)?"<null>":this.isTranslucent));
        sb.append(',');
        sb.append("threadIds");
        sb.append('=');
        sb.append(((this.threadIds == null)?"<null>":this.threadIds));
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
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isTranslucent == null)? 0 :this.isTranslucent.hashCode()));
        result = ((result* 31)+((this.threadIds == null)? 0 :this.threadIds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Layer)) {
            return false;
        }
        Layer rhs = ((Layer) other);
        return ((((Objects.equals(this.index, rhs.index))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.isTranslucent, rhs.isTranslucent)))&&(Objects.equals(this.threadIds, rhs.threadIds)));
    }

}
