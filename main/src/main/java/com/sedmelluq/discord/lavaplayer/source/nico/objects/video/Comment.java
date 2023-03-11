
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "server",
    "keys",
    "layers",
    "threads",
    "ng",
    "isAttentionRequired",
    "nvComment"
})

public class Comment {

    @JsonProperty("server")
    private Server server;
    @JsonProperty("keys")
    private Keys keys;
    @JsonProperty("layers")
    private List<Layer> layers = null;
    @JsonProperty("threads")
    private List<Thread> threads = null;
    @JsonProperty("ng")
    private Ng ng;
    @JsonProperty("isAttentionRequired")
    private Boolean isAttentionRequired;
    @JsonProperty("nvComment")
    private NvComment nvComment;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("server")
    public Server getServer() {
        return server;
    }

    @JsonProperty("server")
    public void setServer(Server server) {
        this.server = server;
    }

    @JsonProperty("keys")
    public Keys getKeys() {
        return keys;
    }

    @JsonProperty("keys")
    public void setKeys(Keys keys) {
        this.keys = keys;
    }

    @JsonProperty("layers")
    public List<Layer> getLayers() {
        return layers;
    }

    @JsonProperty("layers")
    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }

    @JsonProperty("threads")
    public List<Thread> getThreads() {
        return threads;
    }

    @JsonProperty("threads")
    public void setThreads(List<Thread> threads) {
        this.threads = threads;
    }

    @JsonProperty("ng")
    public Ng getNg() {
        return ng;
    }

    @JsonProperty("ng")
    public void setNg(Ng ng) {
        this.ng = ng;
    }

    @JsonProperty("isAttentionRequired")
    public Boolean getIsAttentionRequired() {
        return isAttentionRequired;
    }

    @JsonProperty("isAttentionRequired")
    public void setIsAttentionRequired(Boolean isAttentionRequired) {
        this.isAttentionRequired = isAttentionRequired;
    }

    @JsonProperty("nvComment")
    public NvComment getNvComment() {
        return nvComment;
    }

    @JsonProperty("nvComment")
    public void setNvComment(NvComment nvComment) {
        this.nvComment = nvComment;
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
        sb.append(Comment.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("server");
        sb.append('=');
        sb.append(((this.server == null)?"<null>":this.server));
        sb.append(',');
        sb.append("keys");
        sb.append('=');
        sb.append(((this.keys == null)?"<null>":this.keys));
        sb.append(',');
        sb.append("layers");
        sb.append('=');
        sb.append(((this.layers == null)?"<null>":this.layers));
        sb.append(',');
        sb.append("threads");
        sb.append('=');
        sb.append(((this.threads == null)?"<null>":this.threads));
        sb.append(',');
        sb.append("ng");
        sb.append('=');
        sb.append(((this.ng == null)?"<null>":this.ng));
        sb.append(',');
        sb.append("isAttentionRequired");
        sb.append('=');
        sb.append(((this.isAttentionRequired == null)?"<null>":this.isAttentionRequired));
        sb.append(',');
        sb.append("nvComment");
        sb.append('=');
        sb.append(((this.nvComment == null)?"<null>":this.nvComment));
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
        result = ((result* 31)+((this.server == null)? 0 :this.server.hashCode()));
        result = ((result* 31)+((this.keys == null)? 0 :this.keys.hashCode()));
        result = ((result* 31)+((this.isAttentionRequired == null)? 0 :this.isAttentionRequired.hashCode()));
        result = ((result* 31)+((this.nvComment == null)? 0 :this.nvComment.hashCode()));
        result = ((result* 31)+((this.layers == null)? 0 :this.layers.hashCode()));
        result = ((result* 31)+((this.threads == null)? 0 :this.threads.hashCode()));
        result = ((result* 31)+((this.ng == null)? 0 :this.ng.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Comment)) {
            return false;
        }
        Comment rhs = ((Comment) other);
        return ((((((((Objects.equals(this.server, rhs.server))&&(Objects.equals(this.keys, rhs.keys)))&&(Objects.equals(this.isAttentionRequired, rhs.isAttentionRequired)))&&(Objects.equals(this.nvComment, rhs.nvComment)))&&(Objects.equals(this.layers, rhs.layers)))&&(Objects.equals(this.threads, rhs.threads)))&&(Objects.equals(this.ng, rhs.ng)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
