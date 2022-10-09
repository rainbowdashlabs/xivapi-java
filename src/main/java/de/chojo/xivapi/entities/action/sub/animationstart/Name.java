package de.chojo.xivapi.entities.action.sub.animationstart;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Name(@JsonProperty("ActionTimelineIDMode") int actionTimelineIdMode,
                   @JsonProperty("ID") int id,
                   @JsonProperty("IsLoop") int isLoop,
                   @JsonProperty("IsMotionCanceledByMoving") int isMotionCanceledByMoving,
                   @JsonProperty("Key") String key,
                   @JsonProperty("Key_en") String keyEn,
                   @JsonProperty("KillUpper") int killUpper,
                   @JsonProperty("LoadType") int loadType,
                   @JsonProperty("LookAtMode") int lookAtMode,
                   @JsonProperty("Pause") int pause,
                   @JsonProperty("Priority") int priority,
                   @JsonProperty("Resident") int resident,
                   @JsonProperty("ResidentPap") int residentPap,
                   @JsonProperty("Slot") int slot,
                   @JsonProperty("Stance") int stance,
                   @JsonProperty("StartAttach") int startAttach,
                   @JsonProperty("Type") int type,
                   @JsonProperty("WeaponTimeline") WeaponTimeline weaponTimeline,
                   @JsonProperty("WeaponTimelineTarget") String weaponTimelineTarget,
                   @JsonProperty("WeaponTimelineTargetID") int weaponTimelineTargetId
) {
}
