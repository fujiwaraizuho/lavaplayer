
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "label",
    "isImmoral",
    "isDisabled",
    "isNotSet"
})

public class Genre {

    @JsonProperty("key")
    private String key;
    @JsonProperty("label")
    private String label;
    @JsonProperty("isImmoral")
    private Boolean isImmoral;
    @JsonProperty("isDisabled")
    private Boolean isDisabled;
    @JsonProperty("isNotSet")
    private Boolean isNotSet;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("isImmoral")
    public Boolean getIsImmoral() {
        return isImmoral;
    }

    @JsonProperty("isImmoral")
    public void setIsImmoral(Boolean isImmoral) {
        this.isImmoral = isImmoral;
    }

    @JsonProperty("isDisabled")
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    @JsonProperty("isDisabled")
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    @JsonProperty("isNotSet")
    public Boolean getIsNotSet() {
        return isNotSet;
    }

    @JsonProperty("isNotSet")
    public void setIsNotSet(Boolean isNotSet) {
        this.isNotSet = isNotSet;
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
        sb.append(Genre.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("isImmoral");
        sb.append('=');
        sb.append(((this.isImmoral == null)?"<null>":this.isImmoral));
        sb.append(',');
        sb.append("isDisabled");
        sb.append('=');
        sb.append(((this.isDisabled == null)?"<null>":this.isDisabled));
        sb.append(',');
        sb.append("isNotSet");
        sb.append('=');
        sb.append(((this.isNotSet == null)?"<null>":this.isNotSet));
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
        result = ((result* 31)+((this.isImmoral == null)? 0 :this.isImmoral.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.isDisabled == null)? 0 :this.isDisabled.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isNotSet == null)? 0 :this.isNotSet.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Genre)) {
            return false;
        }
        Genre rhs = ((Genre) other);
        return ((((((Objects.equals(this.isImmoral, rhs.isImmoral))&&(Objects.equals(this.label, rhs.label)))&&(Objects.equals(this.isDisabled, rhs.isDisabled)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.isNotSet, rhs.isNotSet)))&&(Objects.equals(this.key, rhs.key)));
    }

}
