
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isDisabled",
    "tagRelatedLead"
})

public class Marquee {

    @JsonProperty("isDisabled")
    private Boolean isDisabled;
    @JsonProperty("tagRelatedLead")
    private Object tagRelatedLead;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isDisabled")
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    @JsonProperty("isDisabled")
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    @JsonProperty("tagRelatedLead")
    public Object getTagRelatedLead() {
        return tagRelatedLead;
    }

    @JsonProperty("tagRelatedLead")
    public void setTagRelatedLead(Object tagRelatedLead) {
        this.tagRelatedLead = tagRelatedLead;
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
        sb.append(Marquee.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("isDisabled");
        sb.append('=');
        sb.append(((this.isDisabled == null)?"<null>":this.isDisabled));
        sb.append(',');
        sb.append("tagRelatedLead");
        sb.append('=');
        sb.append(((this.tagRelatedLead == null)?"<null>":this.tagRelatedLead));
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
        result = ((result* 31)+((this.isDisabled == null)? 0 :this.isDisabled.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tagRelatedLead == null)? 0 :this.tagRelatedLead.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Marquee)) {
            return false;
        }
        Marquee rhs = ((Marquee) other);
        return (((Objects.equals(this.isDisabled, rhs.isDisabled))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.tagRelatedLead, rhs.tagRelatedLead)));
    }

}
