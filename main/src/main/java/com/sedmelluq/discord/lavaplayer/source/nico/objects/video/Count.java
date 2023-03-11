
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "view",
    "comment",
    "mylist",
    "like"
})

public class Count {

    @JsonProperty("view")
    private Long view;
    @JsonProperty("comment")
    private Long comment;
    @JsonProperty("mylist")
    private Long mylist;
    @JsonProperty("like")
    private Long like;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("view")
    public Long getView() {
        return view;
    }

    @JsonProperty("view")
    public void setView(Long view) {
        this.view = view;
    }

    @JsonProperty("comment")
    public Long getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Long comment) {
        this.comment = comment;
    }

    @JsonProperty("mylist")
    public Long getMylist() {
        return mylist;
    }

    @JsonProperty("mylist")
    public void setMylist(Long mylist) {
        this.mylist = mylist;
    }

    @JsonProperty("like")
    public Long getLike() {
        return like;
    }

    @JsonProperty("like")
    public void setLike(Long like) {
        this.like = like;
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
        sb.append(Count.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("view");
        sb.append('=');
        sb.append(((this.view == null)?"<null>":this.view));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("mylist");
        sb.append('=');
        sb.append(((this.mylist == null)?"<null>":this.mylist));
        sb.append(',');
        sb.append("like");
        sb.append('=');
        sb.append(((this.like == null)?"<null>":this.like));
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
        result = ((result* 31)+((this.view == null)? 0 :this.view.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.like == null)? 0 :this.like.hashCode()));
        result = ((result* 31)+((this.mylist == null)? 0 :this.mylist.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Count)) {
            return false;
        }
        Count rhs = ((Count) other);
        return (((((Objects.equals(this.view, rhs.view))&&(Objects.equals(this.comment, rhs.comment)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.like, rhs.like)))&&(Objects.equals(this.mylist, rhs.mylist)));
    }

}
