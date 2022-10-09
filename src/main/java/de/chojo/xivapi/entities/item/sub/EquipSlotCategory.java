package de.chojo.xivapi.entities.item.sub;

import com.fasterxml.jackson.annotation.JsonProperty;

public record EquipSlotCategory(
        @JsonProperty("Legs") int legs,
        @JsonProperty("Head") int head,
        @JsonProperty("OffHand") int offHand,
        @JsonProperty("Wrists") int wrists,
        @JsonProperty("Feet") int feet,
        @JsonProperty("SoulCrystal") int soulCrystal,
        @JsonProperty("Gloves") int gloves,
        @JsonProperty("FingerR") int fingerR,
        @JsonProperty("Waist") int waist,
        @JsonProperty("ID") int id,
        @JsonProperty("Neck") int neck,
        @JsonProperty("FingerL") int fingerL,
        @JsonProperty("MainHand") int mainHand,
        @JsonProperty("Body") int body,
        @JsonProperty("Ears") int ears
) {
}
