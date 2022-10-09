package de.chojo.xivapi.entities.item.sub;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ItemUICategory(
        @JsonProperty("Name_ja") String nameJa,
        @JsonProperty("OrderMinor") int orderMinor,
        @JsonProperty("Name_en") String nameEn,
        @JsonProperty("OrderMajor") int orderMajor,
        @JsonProperty("ID") int id,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Name_fr") String nameFr,
        @JsonProperty("IconID") int iconID,
        @JsonProperty("IconHD") String iconHD,
        @JsonProperty("Name_de") String nameDe,
        @JsonProperty("Name") String name
) {
}
