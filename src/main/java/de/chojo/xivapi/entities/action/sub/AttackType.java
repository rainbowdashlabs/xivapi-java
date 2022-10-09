package de.chojo.xivapi.entities.action.sub;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AttackType(@JsonProperty("ID") int id,
                         @JsonProperty("Name") String name,
                         @JsonProperty("Name_de") String nameDe,
                         @JsonProperty("Name_en") String nameEn,
                         @JsonProperty("Name_fr") String nameFr,
                         @JsonProperty("Name_ja") String nameJa
) {
}
