package de.chojo.xivapi.entities.action.sub;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Omen(@JsonProperty("ID") int id,
                   @JsonProperty("LargeScale") int largeScale,
                   @JsonProperty("Path") String path,
                   @JsonProperty("PathAlly") String pathAlly,
                   @JsonProperty("PathAlly_en") String pathAllyEn,
                   @JsonProperty("Path_en") String pathEn,
                   @JsonProperty("RestrictYScale") int restrictYScale,
                   @JsonProperty("Type") int type) {
}
