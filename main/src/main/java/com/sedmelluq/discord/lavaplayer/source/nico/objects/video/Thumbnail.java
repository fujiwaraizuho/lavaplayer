
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "middleUrl",
    "largeUrl",
    "player",
    "ogp"
})

public class Thumbnail {

    @JsonProperty("url")
    private String url;
    @JsonProperty("middleUrl")
    private String middleUrl;
    @JsonProperty("largeUrl")
    private String largeUrl;
    @JsonProperty("player")
    private String player;
    @JsonProperty("ogp")
    private String ogp;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("middleUrl")
    public String getMiddleUrl() {
        return middleUrl;
    }

    @JsonProperty("middleUrl")
    public void setMiddleUrl(String middleUrl) {
        this.middleUrl = middleUrl;
    }

    @JsonProperty("largeUrl")
    public String getLargeUrl() {
        return largeUrl;
    }

    @JsonProperty("largeUrl")
    public void setLargeUrl(String largeUrl) {
        this.largeUrl = largeUrl;
    }

    @JsonProperty("player")
    public String getPlayer() {
        return player;
    }

    @JsonProperty("player")
    public void setPlayer(String player) {
        this.player = player;
    }

    @JsonProperty("ogp")
    public String getOgp() {
        return ogp;
    }

    @JsonProperty("ogp")
    public void setOgp(String ogp) {
        this.ogp = ogp;
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
        sb.append(Thumbnail.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("middleUrl");
        sb.append('=');
        sb.append(((this.middleUrl == null)?"<null>":this.middleUrl));
        sb.append(',');
        sb.append("largeUrl");
        sb.append('=');
        sb.append(((this.largeUrl == null)?"<null>":this.largeUrl));
        sb.append(',');
        sb.append("player");
        sb.append('=');
        sb.append(((this.player == null)?"<null>":this.player));
        sb.append(',');
        sb.append("ogp");
        sb.append('=');
        sb.append(((this.ogp == null)?"<null>":this.ogp));
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
        result = ((result* 31)+((this.middleUrl == null)? 0 :this.middleUrl.hashCode()));
        result = ((result* 31)+((this.ogp == null)? 0 :this.ogp.hashCode()));
        result = ((result* 31)+((this.largeUrl == null)? 0 :this.largeUrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.player == null)? 0 :this.player.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Thumbnail)) {
            return false;
        }
        Thumbnail rhs = ((Thumbnail) other);
        return ((((((Objects.equals(this.middleUrl, rhs.middleUrl))&&(Objects.equals(this.ogp, rhs.ogp)))&&(Objects.equals(this.largeUrl, rhs.largeUrl)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.url, rhs.url)))&&(Objects.equals(this.player, rhs.player)));
    }

}
