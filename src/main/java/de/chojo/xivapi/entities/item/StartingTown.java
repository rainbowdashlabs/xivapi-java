package de.chojo.xivapi.entities.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public record StartingTown(
        @JsonProperty("Name_ja") String nameJa,
        @JsonProperty("Name_en") String nameEn,
        @JsonProperty("ID") int id,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Name_fr") String nameFr,
        @JsonProperty("IconID") int iconID,
        @JsonProperty("IconHD") String iconHD,
        @JsonProperty("Name_de") String nameDe,
        @JsonProperty("Name") String name
) {
}
