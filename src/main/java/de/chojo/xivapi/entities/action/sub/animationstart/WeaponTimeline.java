package de.chojo.xivapi.entities.action.sub.animationstart;

import com.fasterxml.jackson.annotation.JsonProperty;

public record WeaponTimeline(@JsonProperty("File") String file,
                             @JsonProperty("File_en") String fileEn,
                             @JsonProperty("ID") int id,
                             @JsonProperty("NextWeaponTimeline") String nextWeaponTimeline) {
}
