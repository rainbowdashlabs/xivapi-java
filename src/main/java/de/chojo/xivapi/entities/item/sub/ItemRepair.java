package de.chojo.xivapi.entities.item.sub;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.chojo.xivapi.entities.item.sub.itemrepair.Item;

public record ItemRepair(
        @JsonProperty("Item") Item item,
        @JsonProperty("ID") int id,
        @JsonProperty("ItemTarget") String itemTarget,
        @JsonProperty("ItemTargetID") int itemTargetID
) {
}
