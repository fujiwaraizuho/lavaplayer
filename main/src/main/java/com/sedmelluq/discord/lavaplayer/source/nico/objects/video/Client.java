
package com.sedmelluq.discord.lavaplayer.source.nico.objects.video;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nicosid",
    "watchId",
    "watchTrackId"
})

public class Client {

    @JsonProperty("nicosid")
    private String nicosid;
    @JsonProperty("watchId")
    private String watchId;
    @JsonProperty("watchTrackId")
    private String watchTrackId;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nicosid")
    public String getNicosid() {
        return nicosid;
    }

    @JsonProperty("nicosid")
    public void setNicosid(String nicosid) {
        this.nicosid = nicosid;
    }

    @JsonProperty("watchId")
    public String getWatchId() {
        return watchId;
    }

    @JsonProperty("watchId")
    public void setWatchId(String watchId) {
        this.watchId = watchId;
    }

    @JsonProperty("watchTrackId")
    public String getWatchTrackId() {
        return watchTrackId;
    }

    @JsonProperty("watchTrackId")
    public void setWatchTrackId(String watchTrackId) {
        this.watchTrackId = watchTrackId;
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
        sb.append(Client.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("nicosid");
        sb.append('=');
        sb.append(((this.nicosid == null)?"<null>":this.nicosid));
        sb.append(',');
        sb.append("watchId");
        sb.append('=');
        sb.append(((this.watchId == null)?"<null>":this.watchId));
        sb.append(',');
        sb.append("watchTrackId");
        sb.append('=');
        sb.append(((this.watchTrackId == null)?"<null>":this.watchTrackId));
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
        result = ((result* 31)+((this.watchTrackId == null)? 0 :this.watchTrackId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nicosid == null)? 0 :this.nicosid.hashCode()));
        result = ((result* 31)+((this.watchId == null)? 0 :this.watchId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Client)) {
            return false;
        }
        Client rhs = ((Client) other);
        return ((((Objects.equals(this.watchTrackId, rhs.watchTrackId))&&(Objects.equals(this.additionalProperties, rhs.additionalProperties)))&&(Objects.equals(this.nicosid, rhs.nicosid)))&&(Objects.equals(this.watchId, rhs.watchId)));
    }

}
