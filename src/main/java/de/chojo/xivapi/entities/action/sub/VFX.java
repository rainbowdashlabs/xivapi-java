package de.chojo.xivapi.entities.action.sub;

import com.fasterxml.jackson.annotation.JsonProperty;

public record VFX(@JsonProperty("ID") int id,
                  @JsonProperty("VFX") VFXLocation vfxLocation,
                  @JsonProperty("VFXTarget") String vfxTarget,
                  @JsonProperty("VFXTargetID") int vfxTargetId) {
}
