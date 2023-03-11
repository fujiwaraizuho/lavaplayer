
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "recipeId",
    "encryption",
    "movie",
    "storyboard",
    "trackingId"
})

public class Delivery {

    @JsonProperty("recipeId")
    private String recipeId;
    @JsonProperty("encryption")
    private Object encryption;
    @JsonProperty("movie")
    private Movie movie;
    @JsonProperty("storyboard")
    private Storyboard storyboard;
    @JsonProperty("trackingId")
    private String trackingId;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("recipeId")
    public String getRecipeId() {
        return recipeId;
    }

    @JsonProperty("recipeId")
    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    @JsonProperty("encryption")
    public Object getEncryption() {
        return encryption;
    }

    @JsonProperty("encryption")
    public void setEncryption(Object encryption) {
        this.encryption = encryption;
    }

    @JsonProperty("movie")
    public Movie getMovie() {
        return movie;
    }

    @JsonProperty("movie")
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @JsonProperty("storyboard")
    public Storyboard getStoryboard() {
        return storyboard;
    }

    @JsonProperty("storyboard")
    public void setStoryboard(Storyboard storyboard) {
        this.storyboard = storyboard;
    }

    @JsonProperty("trackingId")
    public String getTrackingId() {
        return trackingId;
    }

    @JsonProperty("trackingId")
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
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
        sb.append(Delivery.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("recipeId");
        sb.append('=');
        sb.append(((this.recipeId == null)?"<null>":this.recipeId));
        sb.append(',');
        sb.append("encryption");
        sb.append('=');
        sb.append(((this.encryption == null)?"<null>":this.encryption));
        sb.append(',');
        sb.append("movie");
        sb.append('=');
        sb.append(((this.movie == null)?"<null>":this.movie));
        sb.append(',');
        sb.append("storyboard");
        sb.append('=');
        sb.append(((this.storyboard == null)?"<null>":this.storyboard));
        sb.append(',');
        sb.append("trackingId");
        sb.append('=');
        sb.append(((this.trackingId == null)?"<null>":this.trackingId));
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
        result = ((result* 31)+((this.encryption == null)? 0 :this.encryption.hashCode()));
        result = ((result* 31)+((this.movie == null)? 0 :this.movie.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.storyboard == null)? 0 :this.storyboard.hashCode()));
        result = ((result* 31)+((this.recipeId == null)? 0 :this.recipeId.hashCode()));
        result = ((result* 31)+((this.trackingId == null)? 0 :this.trackingId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Delivery)) {
            return false;
        }
        Delivery rhs = ((Delivery) other);
        return ((((((Objects.equals(this.encryption, rhs.encryption))&&(Objects.equals(this.movie, rhs.movie)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.storyboard, rhs.storyboard)))&&(Objects.equals(this.recipeId, rhs.recipeId)))&&(Objects.equals(this.trackingId, rhs.trackingId)));
    }

}
