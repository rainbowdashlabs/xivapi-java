package de.chojo.xivapi.entities.action.sub;

import com.fasterxml.jackson.annotation.JsonProperty;

public record VFXLocation(@JsonProperty("ID") int id,
                          @JsonProperty("Location") String location,
                          @JsonProperty("Location_en") String locationEn) {
}
