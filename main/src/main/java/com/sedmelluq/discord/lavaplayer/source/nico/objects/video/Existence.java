
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "age",
    "prefecture",
    "sex"
})

public class Existence {

    @JsonProperty("age")
    private Long age;
    @JsonProperty("prefecture")
    private String prefecture;
    @JsonProperty("sex")
    private String sex;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("age")
    public Long getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Long age) {
        this.age = age;
    }

    @JsonProperty("prefecture")
    public String getPrefecture() {
        return prefecture;
    }

    @JsonProperty("prefecture")
    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
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
        sb.append(Existence.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("age");
        sb.append('=');
        sb.append(((this.age == null)?"<null>":this.age));
        sb.append(',');
        sb.append("prefecture");
        sb.append('=');
        sb.append(((this.prefecture == null)?"<null>":this.prefecture));
        sb.append(',');
        sb.append("sex");
        sb.append('=');
        sb.append(((this.sex == null)?"<null>":this.sex));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.prefecture == null)? 0 :this.prefecture.hashCode()));
        result = ((result* 31)+((this.age == null)? 0 :this.age.hashCode()));
        result = ((result* 31)+((this.sex == null)? 0 :this.sex.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Existence)) {
            return false;
        }
        Existence rhs = ((Existence) other);
        return ((((Objects.equals(this.additionalProperties, rhs.additionalProperties))&&(Objects.equals(this.prefecture, rhs.prefecture)))&&(Objects.equals(this.age, rhs.age)))&&(Objects.equals(this.sex, rhs.sex)));
    }

}
