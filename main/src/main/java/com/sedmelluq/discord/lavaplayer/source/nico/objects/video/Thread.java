
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "fork",
    "forkLabel",
    "videoId",
    "isActive",
    "isDefaultPostTarget",
    "isEasyCommentPostTarget",
    "isLeafRequired",
    "isOwnerThread",
    "isThreadkeyRequired",
    "threadkey",
    "is184Forced",
    "hasNicoscript",
    "label",
    "postkeyStatus",
    "server"
})

public class Thread {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("fork")
    private Long fork;
    @JsonProperty("forkLabel")
    private String forkLabel;
    @JsonProperty("videoId")
    private String videoId;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("isDefaultPostTarget")
    private Boolean isDefaultPostTarget;
    @JsonProperty("isEasyCommentPostTarget")
    private Boolean isEasyCommentPostTarget;
    @JsonProperty("isLeafRequired")
    private Boolean isLeafRequired;
    @JsonProperty("isOwnerThread")
    private Boolean isOwnerThread;
    @JsonProperty("isThreadkeyRequired")
    private Boolean isThreadkeyRequired;
    @JsonProperty("threadkey")
    private Object threadkey;
    @JsonProperty("is184Forced")
    private Boolean is184Forced;
    @JsonProperty("hasNicoscript")
    private Boolean hasNicoscript;
    @JsonProperty("label")
    private String label;
    @JsonProperty("postkeyStatus")
    private Long postkeyStatus;
    @JsonProperty("server")
    private String server;
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

    @JsonProperty("videoId")
    public String getVideoId() {
        return videoId;
    }

    @JsonProperty("videoId")
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("isDefaultPostTarget")
    public Boolean getIsDefaultPostTarget() {
        return isDefaultPostTarget;
    }

    @JsonProperty("isDefaultPostTarget")
    public void setIsDefaultPostTarget(Boolean isDefaultPostTarget) {
        this.isDefaultPostTarget = isDefaultPostTarget;
    }

    @JsonProperty("isEasyCommentPostTarget")
    public Boolean getIsEasyCommentPostTarget() {
        return isEasyCommentPostTarget;
    }

    @JsonProperty("isEasyCommentPostTarget")
    public void setIsEasyCommentPostTarget(Boolean isEasyCommentPostTarget) {
        this.isEasyCommentPostTarget = isEasyCommentPostTarget;
    }

    @JsonProperty("isLeafRequired")
    public Boolean getIsLeafRequired() {
        return isLeafRequired;
    }

    @JsonProperty("isLeafRequired")
    public void setIsLeafRequired(Boolean isLeafRequired) {
        this.isLeafRequired = isLeafRequired;
    }

    @JsonProperty("isOwnerThread")
    public Boolean getIsOwnerThread() {
        return isOwnerThread;
    }

    @JsonProperty("isOwnerThread")
    public void setIsOwnerThread(Boolean isOwnerThread) {
        this.isOwnerThread = isOwnerThread;
    }

    @JsonProperty("isThreadkeyRequired")
    public Boolean getIsThreadkeyRequired() {
        return isThreadkeyRequired;
    }

    @JsonProperty("isThreadkeyRequired")
    public void setIsThreadkeyRequired(Boolean isThreadkeyRequired) {
        this.isThreadkeyRequired = isThreadkeyRequired;
    }

    @JsonProperty("threadkey")
    public Object getThreadkey() {
        return threadkey;
    }

    @JsonProperty("threadkey")
    public void setThreadkey(Object threadkey) {
        this.threadkey = threadkey;
    }

    @JsonProperty("is184Forced")
    public Boolean getIs184Forced() {
        return is184Forced;
    }

    @JsonProperty("is184Forced")
    public void setIs184Forced(Boolean is184Forced) {
        this.is184Forced = is184Forced;
    }

    @JsonProperty("hasNicoscript")
    public Boolean getHasNicoscript() {
        return hasNicoscript;
    }

    @JsonProperty("hasNicoscript")
    public void setHasNicoscript(Boolean hasNicoscript) {
        this.hasNicoscript = hasNicoscript;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("postkeyStatus")
    public Long getPostkeyStatus() {
        return postkeyStatus;
    }

    @JsonProperty("postkeyStatus")
    public void setPostkeyStatus(Long postkeyStatus) {
        this.postkeyStatus = postkeyStatus;
    }

    @JsonProperty("server")
    public String getServer() {
        return server;
    }

    @JsonProperty("server")
    public void setServer(String server) {
        this.server = server;
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
        sb.append(Thread.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
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
        sb.append("videoId");
        sb.append('=');
        sb.append(((this.videoId == null)?"<null>":this.videoId));
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        sb.append("isDefaultPostTarget");
        sb.append('=');
        sb.append(((this.isDefaultPostTarget == null)?"<null>":this.isDefaultPostTarget));
        sb.append(',');
        sb.append("isEasyCommentPostTarget");
        sb.append('=');
        sb.append(((this.isEasyCommentPostTarget == null)?"<null>":this.isEasyCommentPostTarget));
        sb.append(',');
        sb.append("isLeafRequired");
        sb.append('=');
        sb.append(((this.isLeafRequired == null)?"<null>":this.isLeafRequired));
        sb.append(',');
        sb.append("isOwnerThread");
        sb.append('=');
        sb.append(((this.isOwnerThread == null)?"<null>":this.isOwnerThread));
        sb.append(',');
        sb.append("isThreadkeyRequired");
        sb.append('=');
        sb.append(((this.isThreadkeyRequired == null)?"<null>":this.isThreadkeyRequired));
        sb.append(',');
        sb.append("threadkey");
        sb.append('=');
        sb.append(((this.threadkey == null)?"<null>":this.threadkey));
        sb.append(',');
        sb.append("is184Forced");
        sb.append('=');
        sb.append(((this.is184Forced == null)?"<null>":this.is184Forced));
        sb.append(',');
        sb.append("hasNicoscript");
        sb.append('=');
        sb.append(((this.hasNicoscript == null)?"<null>":this.hasNicoscript));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("postkeyStatus");
        sb.append('=');
        sb.append(((this.postkeyStatus == null)?"<null>":this.postkeyStatus));
        sb.append(',');
        sb.append("server");
        sb.append('=');
        sb.append(((this.server == null)?"<null>":this.server));
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
        result = ((result* 31)+((this.postkeyStatus == null)? 0 :this.postkeyStatus.hashCode()));
        result = ((result* 31)+((this.isLeafRequired == null)? 0 :this.isLeafRequired.hashCode()));
        result = ((result* 31)+((this.videoId == null)? 0 :this.videoId.hashCode()));
        result = ((result* 31)+((this.hasNicoscript == null)? 0 :this.hasNicoscript.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.isActive == null)? 0 :this.isActive.hashCode()));
        result = ((result* 31)+((this.isEasyCommentPostTarget == null)? 0 :this.isEasyCommentPostTarget.hashCode()));
        result = ((result* 31)+((this.fork == null)? 0 :this.fork.hashCode()));
        result = ((result* 31)+((this.forkLabel == null)? 0 :this.forkLabel.hashCode()));
        result = ((result* 31)+((this.is184Forced == null)? 0 :this.is184Forced.hashCode()));
        result = ((result* 31)+((this.isDefaultPostTarget == null)? 0 :this.isDefaultPostTarget.hashCode()));
        result = ((result* 31)+((this.isThreadkeyRequired == null)? 0 :this.isThreadkeyRequired.hashCode()));
        result = ((result* 31)+((this.threadkey == null)? 0 :this.threadkey.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isOwnerThread == null)? 0 :this.isOwnerThread.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Thread)) {
            return false;
        }
        Thread rhs = ((Thread) other);
        return (((((((((((((((((Objects.equals(this.server, rhs.server))&&(Objects.equals(this.postkeyStatus, rhs.postkeyStatus)))&&(Objects.equals(this.isLeafRequired, rhs.isLeafRequired)))&&(Objects.equals(this.videoId, rhs.videoId)))&&(Objects.equals(this.hasNicoscript, rhs.hasNicoscript)))&&(Objects.equals(this.label, rhs.label)))&&(Objects.equals(this.isActive, rhs.isActive)))&&(Objects.equals(this.isEasyCommentPostTarget, rhs.isEasyCommentPostTarget)))&&(Objects.equals(this.fork, rhs.fork)))&&(Objects.equals(this.forkLabel, rhs.forkLabel)))&&(Objects.equals(this.is184Forced, rhs.is184Forced)))&&(Objects.equals(this.isDefaultPostTarget, rhs.isDefaultPostTarget)))&&(Objects.equals(this.isThreadkeyRequired, rhs.isThreadkeyRequired)))&&(Objects.equals(this.threadkey, rhs.threadkey)))&&(Objects.equals(this.id, rhs.id)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.isOwnerThread, rhs.isOwnerThread)));
    }

}
