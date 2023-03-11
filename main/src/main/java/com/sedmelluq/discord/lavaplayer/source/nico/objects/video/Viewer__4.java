
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "nickname",
    "isPremium",
    "existence"
})

public class Viewer__4 {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("isPremium")
    private Boolean isPremium;
    @JsonProperty("existence")
    private Existence existence;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("isPremium")
    public Boolean getIsPremium() {
        return isPremium;
    }

    @JsonProperty("isPremium")
    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }

    @JsonProperty("existence")
    public Existence getExistence() {
        return existence;
    }

    @JsonProperty("existence")
    public void setExistence(Existence existence) {
        this.existence = existence;
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
        sb.append(Viewer__4 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nickname");
        sb.append('=');
        sb.append(((this.nickname == null)?"<null>":this.nickname));
        sb.append(',');
        sb.append("isPremium");
        sb.append('=');
        sb.append(((this.isPremium == null)?"<null>":this.isPremium));
        sb.append(',');
        sb.append("existence");
        sb.append('=');
        sb.append(((this.existence == null)?"<null>":this.existence));
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
        result = ((result* 31)+((this.nickname == null)? 0 :this.nickname.hashCode()));
        result = ((result* 31)+((this.existence == null)? 0 :this.existence.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.isPremium == null)? 0 :this.isPremium.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Viewer__4)) {
            return false;
        }
        Viewer__4 rhs = ((Viewer__4) other);
        return (((((Objects.equals(this.nickname, rhs.nickname))&&(Objects.equals(this.existence, rhs.existence)))&&(Objects.equals(this.id, rhs.id)))&&(Objects.equals(this.isPremium, rhs.isPremium)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
