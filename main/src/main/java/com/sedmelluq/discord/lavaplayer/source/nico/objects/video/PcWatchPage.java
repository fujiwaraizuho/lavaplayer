
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tagRelatedBanner",
    "videoEnd",
    "showOwnerMenu",
    "showOwnerThreadCoEditingLink",
    "showMymemoryEditingLink"
})

public class PcWatchPage {

    @JsonProperty("tagRelatedBanner")
    private Object tagRelatedBanner;
    @JsonProperty("videoEnd")
    private VideoEnd videoEnd;
    @JsonProperty("showOwnerMenu")
    private Boolean showOwnerMenu;
    @JsonProperty("showOwnerThreadCoEditingLink")
    private Boolean showOwnerThreadCoEditingLink;
    @JsonProperty("showMymemoryEditingLink")
    private Boolean showMymemoryEditingLink;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tagRelatedBanner")
    public Object getTagRelatedBanner() {
        return tagRelatedBanner;
    }

    @JsonProperty("tagRelatedBanner")
    public void setTagRelatedBanner(Object tagRelatedBanner) {
        this.tagRelatedBanner = tagRelatedBanner;
    }

    @JsonProperty("videoEnd")
    public VideoEnd getVideoEnd() {
        return videoEnd;
    }

    @JsonProperty("videoEnd")
    public void setVideoEnd(VideoEnd videoEnd) {
        this.videoEnd = videoEnd;
    }

    @JsonProperty("showOwnerMenu")
    public Boolean getShowOwnerMenu() {
        return showOwnerMenu;
    }

    @JsonProperty("showOwnerMenu")
    public void setShowOwnerMenu(Boolean showOwnerMenu) {
        this.showOwnerMenu = showOwnerMenu;
    }

    @JsonProperty("showOwnerThreadCoEditingLink")
    public Boolean getShowOwnerThreadCoEditingLink() {
        return showOwnerThreadCoEditingLink;
    }

    @JsonProperty("showOwnerThreadCoEditingLink")
    public void setShowOwnerThreadCoEditingLink(Boolean showOwnerThreadCoEditingLink) {
        this.showOwnerThreadCoEditingLink = showOwnerThreadCoEditingLink;
    }

    @JsonProperty("showMymemoryEditingLink")
    public Boolean getShowMymemoryEditingLink() {
        return showMymemoryEditingLink;
    }

    @JsonProperty("showMymemoryEditingLink")
    public void setShowMymemoryEditingLink(Boolean showMymemoryEditingLink) {
        this.showMymemoryEditingLink = showMymemoryEditingLink;
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
        sb.append(PcWatchPage.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("tagRelatedBanner");
        sb.append('=');
        sb.append(((this.tagRelatedBanner == null)?"<null>":this.tagRelatedBanner));
        sb.append(',');
        sb.append("videoEnd");
        sb.append('=');
        sb.append(((this.videoEnd == null)?"<null>":this.videoEnd));
        sb.append(',');
        sb.append("showOwnerMenu");
        sb.append('=');
        sb.append(((this.showOwnerMenu == null)?"<null>":this.showOwnerMenu));
        sb.append(',');
        sb.append("showOwnerThreadCoEditingLink");
        sb.append('=');
        sb.append(((this.showOwnerThreadCoEditingLink == null)?"<null>":this.showOwnerThreadCoEditingLink));
        sb.append(',');
        sb.append("showMymemoryEditingLink");
        sb.append('=');
        sb.append(((this.showMymemoryEditingLink == null)?"<null>":this.showMymemoryEditingLink));
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
        result = ((result* 31)+((this.videoEnd == null)? 0 :this.videoEnd.hashCode()));
        result = ((result* 31)+((this.tagRelatedBanner == null)? 0 :this.tagRelatedBanner.hashCode()));
        result = ((result* 31)+((this.showOwnerMenu == null)? 0 :this.showOwnerMenu.hashCode()));
        result = ((result* 31)+((this.showOwnerThreadCoEditingLink == null)? 0 :this.showOwnerThreadCoEditingLink.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.showMymemoryEditingLink == null)? 0 :this.showMymemoryEditingLink.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PcWatchPage)) {
            return false;
        }
        PcWatchPage rhs = ((PcWatchPage) other);
        return ((((((Objects.equals(this.videoEnd, rhs.videoEnd))&&(Objects.equals(this.tagRelatedBanner, rhs.tagRelatedBanner)))&&(Objects.equals(this.showOwnerMenu, rhs.showOwnerMenu)))&&(Objects.equals(this.showOwnerThreadCoEditingLink, rhs.showOwnerThreadCoEditingLink)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.showMymemoryEditingLink, rhs.showMymemoryEditingLink)));
    }

}
