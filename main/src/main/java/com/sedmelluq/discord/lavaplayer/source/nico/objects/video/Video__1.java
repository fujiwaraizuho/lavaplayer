
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isPpv",
    "isAdmission",
    "isContinuationBenefit",
    "isPremium",
    "watchableUserType",
    "commentableUserType"
})

public class Video__1 {

    @JsonProperty("isPpv")
    private Boolean isPpv;
    @JsonProperty("isAdmission")
    private Boolean isAdmission;
    @JsonProperty("isContinuationBenefit")
    private Boolean isContinuationBenefit;
    @JsonProperty("isPremium")
    private Boolean isPremium;
    @JsonProperty("watchableUserType")
    private String watchableUserType;
    @JsonProperty("commentableUserType")
    private String commentableUserType;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isPpv")
    public Boolean getIsPpv() {
        return isPpv;
    }

    @JsonProperty("isPpv")
    public void setIsPpv(Boolean isPpv) {
        this.isPpv = isPpv;
    }

    @JsonProperty("isAdmission")
    public Boolean getIsAdmission() {
        return isAdmission;
    }

    @JsonProperty("isAdmission")
    public void setIsAdmission(Boolean isAdmission) {
        this.isAdmission = isAdmission;
    }

    @JsonProperty("isContinuationBenefit")
    public Boolean getIsContinuationBenefit() {
        return isContinuationBenefit;
    }

    @JsonProperty("isContinuationBenefit")
    public void setIsContinuationBenefit(Boolean isContinuationBenefit) {
        this.isContinuationBenefit = isContinuationBenefit;
    }

    @JsonProperty("isPremium")
    public Boolean getIsPremium() {
        return isPremium;
    }

    @JsonProperty("isPremium")
    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }

    @JsonProperty("watchableUserType")
    public String getWatchableUserType() {
        return watchableUserType;
    }

    @JsonProperty("watchableUserType")
    public void setWatchableUserType(String watchableUserType) {
        this.watchableUserType = watchableUserType;
    }

    @JsonProperty("commentableUserType")
    public String getCommentableUserType() {
        return commentableUserType;
    }

    @JsonProperty("commentableUserType")
    public void setCommentableUserType(String commentableUserType) {
        this.commentableUserType = commentableUserType;
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
        sb.append(Video__1 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("isPpv");
        sb.append('=');
        sb.append(((this.isPpv == null)?"<null>":this.isPpv));
        sb.append(',');
        sb.append("isAdmission");
        sb.append('=');
        sb.append(((this.isAdmission == null)?"<null>":this.isAdmission));
        sb.append(',');
        sb.append("isContinuationBenefit");
        sb.append('=');
        sb.append(((this.isContinuationBenefit == null)?"<null>":this.isContinuationBenefit));
        sb.append(',');
        sb.append("isPremium");
        sb.append('=');
        sb.append(((this.isPremium == null)?"<null>":this.isPremium));
        sb.append(',');
        sb.append("watchableUserType");
        sb.append('=');
        sb.append(((this.watchableUserType == null)?"<null>":this.watchableUserType));
        sb.append(',');
        sb.append("commentableUserType");
        sb.append('=');
        sb.append(((this.commentableUserType == null)?"<null>":this.commentableUserType));
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
        result = ((result* 31)+((this.isAdmission == null)? 0 :this.isAdmission.hashCode()));
        result = ((result* 31)+((this.isPpv == null)? 0 :this.isPpv.hashCode()));
        result = ((result* 31)+((this.watchableUserType == null)? 0 :this.watchableUserType.hashCode()));
        result = ((result* 31)+((this.isPremium == null)? 0 :this.isPremium.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isContinuationBenefit == null)? 0 :this.isContinuationBenefit.hashCode()));
        result = ((result* 31)+((this.commentableUserType == null)? 0 :this.commentableUserType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Video__1)) {
            return false;
        }
        Video__1 rhs = ((Video__1) other);
        return (((((((Objects.equals(this.isAdmission, rhs.isAdmission))&&(Objects.equals(this.isPpv, rhs.isPpv)))&&(Objects.equals(this.watchableUserType, rhs.watchableUserType)))&&(Objects.equals(this.isPremium, rhs.isPremium)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.isContinuationBenefit, rhs.isContinuationBenefit)))&&(Objects.equals(this.commentableUserType, rhs.commentableUserType)));
    }

}
