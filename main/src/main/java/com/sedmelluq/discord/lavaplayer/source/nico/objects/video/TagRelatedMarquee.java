
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "linkUrl",
    "linkType",
    "linkOrigin",
    "isNewWindow"
})

public class TagRelatedMarquee {

    @JsonProperty("title")
    private String title;
    @JsonProperty("linkUrl")
    private String linkUrl;
    @JsonProperty("linkType")
    private String linkType;
    @JsonProperty("linkOrigin")
    private String linkOrigin;
    @JsonProperty("isNewWindow")
    private Boolean isNewWindow;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("linkUrl")
    public String getLinkUrl() {
        return linkUrl;
    }

    @JsonProperty("linkUrl")
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    @JsonProperty("linkType")
    public String getLinkType() {
        return linkType;
    }

    @JsonProperty("linkType")
    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    @JsonProperty("linkOrigin")
    public String getLinkOrigin() {
        return linkOrigin;
    }

    @JsonProperty("linkOrigin")
    public void setLinkOrigin(String linkOrigin) {
        this.linkOrigin = linkOrigin;
    }

    @JsonProperty("isNewWindow")
    public Boolean getIsNewWindow() {
        return isNewWindow;
    }

    @JsonProperty("isNewWindow")
    public void setIsNewWindow(Boolean isNewWindow) {
        this.isNewWindow = isNewWindow;
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
        sb.append(TagRelatedMarquee.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("linkUrl");
        sb.append('=');
        sb.append(((this.linkUrl == null)?"<null>":this.linkUrl));
        sb.append(',');
        sb.append("linkType");
        sb.append('=');
        sb.append(((this.linkType == null)?"<null>":this.linkType));
        sb.append(',');
        sb.append("linkOrigin");
        sb.append('=');
        sb.append(((this.linkOrigin == null)?"<null>":this.linkOrigin));
        sb.append(',');
        sb.append("isNewWindow");
        sb.append('=');
        sb.append(((this.isNewWindow == null)?"<null>":this.isNewWindow));
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
        result = ((result* 31)+((this.isNewWindow == null)? 0 :this.isNewWindow.hashCode()));
        result = ((result* 31)+((this.linkUrl == null)? 0 :this.linkUrl.hashCode()));
        result = ((result* 31)+((this.linkType == null)? 0 :this.linkType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.linkOrigin == null)? 0 :this.linkOrigin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TagRelatedMarquee)) {
            return false;
        }
        TagRelatedMarquee rhs = ((TagRelatedMarquee) other);
        return ((((((Objects.equals(this.isNewWindow, rhs.isNewWindow))&&(Objects.equals(this.linkUrl, rhs.linkUrl)))&&(Objects.equals(this.linkType, rhs.linkType)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.title, rhs.title)))&&(Objects.equals(this.linkOrigin, rhs.linkOrigin)));
    }

}
