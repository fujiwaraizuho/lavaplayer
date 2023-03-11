
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "items",
    "hasR18Tag",
    "isPublishedNicoscript",
    "edit",
    "viewer"
})

public class Tag {

    @JsonProperty("items")
    private List<Item__1> items = null;
    @JsonProperty("hasR18Tag")
    private Boolean hasR18Tag;
    @JsonProperty("isPublishedNicoscript")
    private Boolean isPublishedNicoscript;
    @JsonProperty("edit")
    private Edit edit;
    @JsonProperty("viewer")
    private Viewer__2 viewer;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("items")
    public List<Item__1> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item__1> items) {
        this.items = items;
    }

    @JsonProperty("hasR18Tag")
    public Boolean getHasR18Tag() {
        return hasR18Tag;
    }

    @JsonProperty("hasR18Tag")
    public void setHasR18Tag(Boolean hasR18Tag) {
        this.hasR18Tag = hasR18Tag;
    }

    @JsonProperty("isPublishedNicoscript")
    public Boolean getIsPublishedNicoscript() {
        return isPublishedNicoscript;
    }

    @JsonProperty("isPublishedNicoscript")
    public void setIsPublishedNicoscript(Boolean isPublishedNicoscript) {
        this.isPublishedNicoscript = isPublishedNicoscript;
    }

    @JsonProperty("edit")
    public Edit getEdit() {
        return edit;
    }

    @JsonProperty("edit")
    public void setEdit(Edit edit) {
        this.edit = edit;
    }

    @JsonProperty("viewer")
    public Viewer__2 getViewer() {
        return viewer;
    }

    @JsonProperty("viewer")
    public void setViewer(Viewer__2 viewer) {
        this.viewer = viewer;
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
        sb.append(Tag.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
        sb.append(',');
        sb.append("hasR18Tag");
        sb.append('=');
        sb.append(((this.hasR18Tag == null)?"<null>":this.hasR18Tag));
        sb.append(',');
        sb.append("isPublishedNicoscript");
        sb.append('=');
        sb.append(((this.isPublishedNicoscript == null)?"<null>":this.isPublishedNicoscript));
        sb.append(',');
        sb.append("edit");
        sb.append('=');
        sb.append(((this.edit == null)?"<null>":this.edit));
        sb.append(',');
        sb.append("viewer");
        sb.append('=');
        sb.append(((this.viewer == null)?"<null>":this.viewer));
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
        result = ((result* 31)+((this.viewer == null)? 0 :this.viewer.hashCode()));
        result = ((result* 31)+((this.isPublishedNicoscript == null)? 0 :this.isPublishedNicoscript.hashCode()));
        result = ((result* 31)+((this.edit == null)? 0 :this.edit.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.items == null)? 0 :this.items.hashCode()));
        result = ((result* 31)+((this.hasR18Tag == null)? 0 :this.hasR18Tag.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Tag)) {
            return false;
        }
        Tag rhs = ((Tag) other);
        return ((((((Objects.equals(this.viewer, rhs.viewer))&&(Objects.equals(this.isPublishedNicoscript, rhs.isPublishedNicoscript)))&&(Objects.equals(this.edit, rhs.edit)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.items, rhs.items)))&&(Objects.equals(this.hasR18Tag, rhs.hasR18Tag)));
    }

}
