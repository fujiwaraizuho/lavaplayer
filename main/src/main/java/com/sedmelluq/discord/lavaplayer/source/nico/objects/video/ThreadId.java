
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "fork",
    "forkLabel"
})

public class ThreadId {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("fork")
    private Long fork;
    @JsonProperty("forkLabel")
    private String forkLabel;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("fork")
    public Long getFork() {
        return fork;
    }

    @JsonProperty("fork")
    public void setFork(Long fork) {
        this.fork = fork;
    }

    @JsonProperty("forkLabel")
    public String getForkLabel() {
        return forkLabel;
    }

    @JsonProperty("forkLabel")
    public void setForkLabel(String forkLabel) {
        this.forkLabel = forkLabel;
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
        sb.append(ThreadId.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("fork");
        sb.append('=');
        sb.append(((this.fork == null)?"<null>":this.fork));
        sb.append(',');
        sb.append("forkLabel");
        sb.append('=');
        sb.append(((this.forkLabel == null)?"<null>":this.forkLabel));
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
        result = ((result* 31)+((this.fork == null)? 0 :this.fork.hashCode()));
        result = ((result* 31)+((this.forkLabel == null)? 0 :this.forkLabel.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ThreadId)) {
            return false;
        }
        ThreadId rhs = ((ThreadId) other);
        return ((((Objects.equals(this.fork, rhs.fork))&&(Objects.equals(this.forkLabel, rhs.forkLabel)))&&(Objects.equals(this.id, rhs.id)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
