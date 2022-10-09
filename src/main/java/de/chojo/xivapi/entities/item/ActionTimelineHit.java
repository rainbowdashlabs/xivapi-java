package de.chojo.xivapi.entities.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ActionTimelineHit(
        @JsonProperty("Stance") int stance,
        @JsonProperty("Pause") int pause,
        @JsonProperty("IsLoop") int isLoop,
        @JsonProperty("Priority") int priority,
        @JsonProperty("Key_en") String keyEn,
        @JsonProperty("ResidentPap") int residentPap,
        @JsonProperty("StartAttach") int startAttach,
        @JsonProperty("KillUpper") int killUpper,
        @JsonProperty("Type") int type,
        @JsonProperty("ActionTimelineIDMode") int actionTimelineIDMode,
        @JsonProperty("Resident") int resident,
        @JsonProperty("Slot") int slot,
        @JsonProperty("ID") int id,
        @JsonProperty("IsMotionCanceledByMoving") int isMotionCanceledByMoving,
        @JsonProperty("LoadType") int loadType,
        @JsonProperty("LookAtMode") int lookAtMode,
        @JsonProperty("WeaponTimeline") int weaponTimeline,
        @JsonProperty("Key") String key
) {
}
