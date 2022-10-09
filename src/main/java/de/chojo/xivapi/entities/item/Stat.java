package de.chojo.xivapi.entities.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Stat(
        @JsonProperty("NQ") int nQ,
        @JsonProperty("ID") int iD
) {
}
