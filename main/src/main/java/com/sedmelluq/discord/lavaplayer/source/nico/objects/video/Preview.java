
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ppv",
    "admission",
    "continuationBenefit",
    "premium"
})

public class Preview {

    @JsonProperty("ppv")
    private Ppv ppv;
    @JsonProperty("admission")
    private Admission admission;
    @JsonProperty("continuationBenefit")
    private ContinuationBenefit continuationBenefit;
    @JsonProperty("premium")
    private Premium premium;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ppv")
    public Ppv getPpv() {
        return ppv;
    }

    @JsonProperty("ppv")
    public void setPpv(Ppv ppv) {
        this.ppv = ppv;
    }

    @JsonProperty("admission")
    public Admission getAdmission() {
        return admission;
    }

    @JsonProperty("admission")
    public void setAdmission(Admission admission) {
        this.admission = admission;
    }

    @JsonProperty("continuationBenefit")
    public ContinuationBenefit getContinuationBenefit() {
        return continuationBenefit;
    }

    @JsonProperty("continuationBenefit")
    public void setContinuationBenefit(ContinuationBenefit continuationBenefit) {
        this.continuationBenefit = continuationBenefit;
    }

    @JsonProperty("premium")
    public Premium getPremium() {
        return premium;
    }

    @JsonProperty("premium")
    public void setPremium(Premium premium) {
        this.premium = premium;
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
        sb.append(Preview.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("ppv");
        sb.append('=');
        sb.append(((this.ppv == null)?"<null>":this.ppv));
        sb.append(',');
        sb.append("admission");
        sb.append('=');
        sb.append(((this.admission == null)?"<null>":this.admission));
        sb.append(',');
        sb.append("continuationBenefit");
        sb.append('=');
        sb.append(((this.continuationBenefit == null)?"<null>":this.continuationBenefit));
        sb.append(',');
        sb.append("premium");
        sb.append('=');
        sb.append(((this.premium == null)?"<null>":this.premium));
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
        result = ((result* 31)+((this.admission == null)? 0 :this.admission.hashCode()));
        result = ((result* 31)+((this.premium == null)? 0 :this.premium.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ppv == null)? 0 :this.ppv.hashCode()));
        result = ((result* 31)+((this.continuationBenefit == null)? 0 :this.continuationBenefit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Preview)) {
            return false;
        }
        Preview rhs = ((Preview) other);
        return (((((Objects.equals(this.admission, rhs.admission))&&(Objects.equals(this.premium, rhs.premium)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.ppv, rhs.ppv)))&&(Objects.equals(this.continuationBenefit, rhs.continuationBenefit)));
    }

}
