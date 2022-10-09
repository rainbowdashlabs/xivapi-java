package de.chojo.xivapi.entities.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ActionCategory(
        @JsonProperty("Name_ja") String nameJa,
        @JsonProperty("Name_en") String nameEn,
        @JsonProperty("ID") int id,
        @JsonProperty("Name_fr") String nameFr,
        @JsonProperty("Name_de") String nameDe,
        @JsonProperty("Name") String name
) {
}
