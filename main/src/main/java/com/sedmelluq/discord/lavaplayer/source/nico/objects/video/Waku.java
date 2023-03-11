
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "information",
    "bgImages",
    "addContents",
    "addVideo",
    "tagRelatedBanner",
    "tagRelatedMarquee"
})

public class Waku {

    @JsonProperty("information")
    private Object information;
    @JsonProperty("bgImages")
    private List<Object> bgImages = null;
    @JsonProperty("addContents")
    private Object addContents;
    @JsonProperty("addVideo")
    private Object addVideo;
    @JsonProperty("tagRelatedBanner")
    private TagRelatedBanner tagRelatedBanner;
    @JsonProperty("tagRelatedMarquee")
    private TagRelatedMarquee tagRelatedMarquee;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("information")
    public Object getInformation() {
        return information;
    }

    @JsonProperty("information")
    public void setInformation(Object information) {
        this.information = information;
    }

    @JsonProperty("bgImages")
    public List<Object> getBgImages() {
        return bgImages;
    }

    @JsonProperty("bgImages")
    public void setBgImages(List<Object> bgImages) {
        this.bgImages = bgImages;
    }

    @JsonProperty("addContents")
    public Object getAddContents() {
        return addContents;
    }

    @JsonProperty("addContents")
    public void setAddContents(Object addContents) {
        this.addContents = addContents;
    }

    @JsonProperty("addVideo")
    public Object getAddVideo() {
        return addVideo;
    }

    @JsonProperty("addVideo")
    public void setAddVideo(Object addVideo) {
        this.addVideo = addVideo;
    }

    @JsonProperty("tagRelatedBanner")
    public TagRelatedBanner getTagRelatedBanner() {
        return tagRelatedBanner;
    }

    @JsonProperty("tagRelatedBanner")
    public void setTagRelatedBanner(TagRelatedBanner tagRelatedBanner) {
        this.tagRelatedBanner = tagRelatedBanner;
    }

    @JsonProperty("tagRelatedMarquee")
    public TagRelatedMarquee getTagRelatedMarquee() {
        return tagRelatedMarquee;
    }

    @JsonProperty("tagRelatedMarquee")
    public void setTagRelatedMarquee(TagRelatedMarquee tagRelatedMarquee) {
        this.tagRelatedMarquee = tagRelatedMarquee;
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
        sb.append(Waku.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("information");
        sb.append('=');
        sb.append(((this.information == null)?"<null>":this.information));
        sb.append(',');
        sb.append("bgImages");
        sb.append('=');
        sb.append(((this.bgImages == null)?"<null>":this.bgImages));
        sb.append(',');
        sb.append("addContents");
        sb.append('=');
        sb.append(((this.addContents == null)?"<null>":this.addContents));
        sb.append(',');
        sb.append("addVideo");
        sb.append('=');
        sb.append(((this.addVideo == null)?"<null>":this.addVideo));
        sb.append(',');
        sb.append("tagRelatedBanner");
        sb.append('=');
        sb.append(((this.tagRelatedBanner == null)?"<null>":this.tagRelatedBanner));
        sb.append(',');
        sb.append("tagRelatedMarquee");
        sb.append('=');
        sb.append(((this.tagRelatedMarquee == null)?"<null>":this.tagRelatedMarquee));
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
        result = ((result* 31)+((this.tagRelatedBanner == null)? 0 :this.tagRelatedBanner.hashCode()));
        result = ((result* 31)+((this.addContents == null)? 0 :this.addContents.hashCode()));
        result = ((result* 31)+((this.addVideo == null)? 0 :this.addVideo.hashCode()));
        result = ((result* 31)+((this.tagRelatedMarquee == null)? 0 :this.tagRelatedMarquee.hashCode()));
        result = ((result* 31)+((this.bgImages == null)? 0 :this.bgImages.hashCode()));
        result = ((result* 31)+((this.information == null)? 0 :this.information.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Waku)) {
            return false;
        }
        Waku rhs = ((Waku) other);
        return (((((((Objects.equals(this.tagRelatedBanner, rhs.tagRelatedBanner))&&(Objects.equals(this.addContents, rhs.addContents)))&&(Objects.equals(this.addVideo, rhs.addVideo)))&&(Objects.equals(this.tagRelatedMarquee, rhs.tagRelatedMarquee)))&&(Objects.equals(this.bgImages, rhs.bgImages)))&&(Objects.equals(this.information, rhs.information)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
