
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "isCategory",
    "isCategoryCandidate",
    "isNicodicArticleExists",
    "isLocked"
})

public class Item__1 {

    @JsonProperty("name")
    private String name;
    @JsonProperty("isCategory")
    private Boolean isCategory;
    @JsonProperty("isCategoryCandidate")
    private Boolean isCategoryCandidate;
    @JsonProperty("isNicodicArticleExists")
    private Boolean isNicodicArticleExists;
    @JsonProperty("isLocked")
    private Boolean isLocked;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("isCategory")
    public Boolean getIsCategory() {
        return isCategory;
    }

    @JsonProperty("isCategory")
    public void setIsCategory(Boolean isCategory) {
        this.isCategory = isCategory;
    }

    @JsonProperty("isCategoryCandidate")
    public Boolean getIsCategoryCandidate() {
        return isCategoryCandidate;
    }

    @JsonProperty("isCategoryCandidate")
    public void setIsCategoryCandidate(Boolean isCategoryCandidate) {
        this.isCategoryCandidate = isCategoryCandidate;
    }

    @JsonProperty("isNicodicArticleExists")
    public Boolean getIsNicodicArticleExists() {
        return isNicodicArticleExists;
    }

    @JsonProperty("isNicodicArticleExists")
    public void setIsNicodicArticleExists(Boolean isNicodicArticleExists) {
        this.isNicodicArticleExists = isNicodicArticleExists;
    }

    @JsonProperty("isLocked")
    public Boolean getIsLocked() {
        return isLocked;
    }

    @JsonProperty("isLocked")
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
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
        sb.append(Item__1 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("isCategory");
        sb.append('=');
        sb.append(((this.isCategory == null)?"<null>":this.isCategory));
        sb.append(',');
        sb.append("isCategoryCandidate");
        sb.append('=');
        sb.append(((this.isCategoryCandidate == null)?"<null>":this.isCategoryCandidate));
        sb.append(',');
        sb.append("isNicodicArticleExists");
        sb.append('=');
        sb.append(((this.isNicodicArticleExists == null)?"<null>":this.isNicodicArticleExists));
        sb.append(',');
        sb.append("isLocked");
        sb.append('=');
        sb.append(((this.isLocked == null)?"<null>":this.isLocked));
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
        result = ((result* 31)+((this.isCategory == null)? 0 :this.isCategory.hashCode()));
        result = ((result* 31)+((this.isNicodicArticleExists == null)? 0 :this.isNicodicArticleExists.hashCode()));
        result = ((result* 31)+((this.isLocked == null)? 0 :this.isLocked.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.isCategoryCandidate == null)? 0 :this.isCategoryCandidate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Item__1)) {
            return false;
        }
        Item__1 rhs = ((Item__1) other);
        return ((((((Objects.equals(this.isCategory, rhs.isCategory))&&(Objects.equals(this.isNicodicArticleExists, rhs.isNicodicArticleExists)))&&(Objects.equals(this.isLocked, rhs.isLocked)))&&(Objects.equals(this.name, rhs.name)))&&(Objects.equals(this.isCategoryCandidate, rhs.isCategoryCandidate)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
