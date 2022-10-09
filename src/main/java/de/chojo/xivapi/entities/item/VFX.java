package de.chojo.xivapi.entities.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public record VFX(
        @JsonProperty("VFX") int vFX,
        @JsonProperty("ID") int iD
) {
}
