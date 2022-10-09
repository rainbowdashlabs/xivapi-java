package de.chojo.xivapi.entities.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ItemSortCategory(
        @JsonProperty("Param") int param,
        @JsonProperty("ID") int iD
) {
}
