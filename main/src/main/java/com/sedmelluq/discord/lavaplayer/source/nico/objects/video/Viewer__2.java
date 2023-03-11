
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isEditable",
    "uneditableReason",
    "editKey"
})

public class Viewer__2 {

    @JsonProperty("isEditable")
    private Boolean isEditable;
    @JsonProperty("uneditableReason")
    private Object uneditableReason;
    @JsonProperty("editKey")
    private String editKey;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isEditable")
    public Boolean getIsEditable() {
        return isEditable;
    }

    @JsonProperty("isEditable")
    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    @JsonProperty("uneditableReason")
    public Object getUneditableReason() {
        return uneditableReason;
    }

    @JsonProperty("uneditableReason")
    public void setUneditableReason(Object uneditableReason) {
        this.uneditableReason = uneditableReason;
    }

    @JsonProperty("editKey")
    public String getEditKey() {
        return editKey;
    }

    @JsonProperty("editKey")
    public void setEditKey(String editKey) {
        this.editKey = editKey;
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
        sb.append(Viewer__2 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("isEditable");
        sb.append('=');
        sb.append(((this.isEditable == null)?"<null>":this.isEditable));
        sb.append(',');
        sb.append("uneditableReason");
        sb.append('=');
        sb.append(((this.uneditableReason == null)?"<null>":this.uneditableReason));
        sb.append(',');
        sb.append("editKey");
        sb.append('=');
        sb.append(((this.editKey == null)?"<null>":this.editKey));
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
        result = ((result* 31)+((this.editKey == null)? 0 :this.editKey.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isEditable == null)? 0 :this.isEditable.hashCode()));
        result = ((result* 31)+((this.uneditableReason == null)? 0 :this.uneditableReason.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Viewer__2)) {
            return false;
        }
        Viewer__2 rhs = ((Viewer__2) other);
        return ((((Objects.equals(this.editKey, rhs.editKey))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.isEditable, rhs.isEditable)))&&(Objects.equals(this.uneditableReason, rhs.uneditableReason)));
    }

}
