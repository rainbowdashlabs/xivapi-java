package de.chojo.xivapi.entities.action.sub;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.chojo.xivapi.entities.action.sub.animationstart.Name;

public record AnimationStart(@JsonProperty("ID") int id,
                             @JsonProperty("Name") Name name,
                             @JsonProperty("NameTarget") String nameTarget,
                             @JsonProperty("NameTargetID") int nameTargetId,
                             @JsonProperty("VFX") String vfx,
                             @JsonProperty("VFXTarget") String vfxTarget,
                             @JsonProperty("VFXTargetID") int vfxTargetId) {

}
