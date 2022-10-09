package de.chojo.xivapi.entities.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AnimationStart(
        @JsonProperty("VFX") int vFX,
        @JsonProperty("ID") int id,
        @JsonProperty("Name") int name
) {
}
