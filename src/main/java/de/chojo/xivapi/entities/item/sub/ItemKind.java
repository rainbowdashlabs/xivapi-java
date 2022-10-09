package de.chojo.xivapi.entities.item.sub;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ItemKind(
        @JsonProperty("Name_ja") String nameJa,
        @JsonProperty("Name_kr") String nameKr,
        @JsonProperty("Name_cn") String nameCn,
        @JsonProperty("Name_en") String nameEn,
        @JsonProperty("ID") int id,
        @JsonProperty("Name_fr") String nameFr,
        @JsonProperty("Name_de") String nameDe,
        @JsonProperty("Name") String name
) {
}
