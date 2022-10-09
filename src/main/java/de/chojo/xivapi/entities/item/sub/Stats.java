package de.chojo.xivapi.entities.item.sub;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.chojo.xivapi.entities.item.Stat;

public record Stats(
        @JsonProperty("CriticalHit") Stat criticalHit,
        @JsonProperty("Determination") Stat determination,
        @JsonProperty("Vitality") Stat vitality,
        @JsonProperty("Strength") Stat strength
) {
}
