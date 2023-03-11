
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "delivery",
    "deliveryLegacy"
})

public class Media {

    @JsonProperty("delivery")
    private Delivery delivery;
    @JsonProperty("deliveryLegacy")
    private Object deliveryLegacy;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("delivery")
    public Delivery getDelivery() {
        return delivery;
    }

    @JsonProperty("delivery")
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    @JsonProperty("deliveryLegacy")
    public Object getDeliveryLegacy() {
        return deliveryLegacy;
    }

    @JsonProperty("deliveryLegacy")
    public void setDeliveryLegacy(Object deliveryLegacy) {
        this.deliveryLegacy = deliveryLegacy;
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
        sb.append(Media.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("delivery");
        sb.append('=');
        sb.append(((this.delivery == null)?"<null>":this.delivery));
        sb.append(',');
        sb.append("deliveryLegacy");
        sb.append('=');
        sb.append(((this.deliveryLegacy == null)?"<null>":this.deliveryLegacy));
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
        result = ((result* 31)+((this.deliveryLegacy == null)? 0 :this.deliveryLegacy.hashCode()));
        result = ((result* 31)+((this.delivery == null)? 0 :this.delivery.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Media)) {
            return false;
        }
        Media rhs = ((Media) other);
        return (((Objects.equals(this.deliveryLegacy, rhs.deliveryLegacy))&&(Objects.equals(this.delivery, rhs.delivery)))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)));
    }

}
