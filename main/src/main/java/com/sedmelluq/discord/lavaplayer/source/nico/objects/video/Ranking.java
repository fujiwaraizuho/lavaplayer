
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "genre",
    "popularTag"
})

public class Ranking {

    @JsonProperty("genre")
    private Genre__1 genre;
    @JsonProperty("popularTag")
    private List<PopularTag> popularTag = null;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("genre")
    public Genre__1 getGenre() {
        return genre;
    }

    @JsonProperty("genre")
    public void setGenre(Genre__1 genre) {
        this.genre = genre;
    }

    @JsonProperty("popularTag")
    public List<PopularTag> getPopularTag() {
        return popularTag;
    }

    @JsonProperty("popularTag")
    public void setPopularTag(List<PopularTag> popularTag) {
        this.popularTag = popularTag;
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
        sb.append(Ranking.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("genre");
        sb.append('=');
        sb.append(((this.genre == null)?"<null>":this.genre));
        sb.append(',');
        sb.append("popularTag");
        sb.append('=');
        sb.append(((this.popularTag == null)?"<null>":this.popularTag));
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
        result = ((result* 31)+((this.genre == null)? 0 :this.genre.hashCode()));
        result = ((result* 31)+((this.popularTag == null)? 0 :this.popularTag.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Ranking)) {
            return false;
        }
        Ranking rhs = ((Ranking) other);
        return (((Objects.equals(this.genre, rhs.genre))&&(Objects.equals(this.popularTag, rhs.popularTag)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
