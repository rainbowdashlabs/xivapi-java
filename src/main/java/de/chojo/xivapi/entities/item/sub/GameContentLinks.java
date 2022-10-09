package de.chojo.xivapi.entities.item.sub;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.chojo.xivapi.entities.item.sub.gamecontentlinks.SpecialShop;

public record GameContentLinks(
        @JsonProperty("SpecialShop") SpecialShop specialShop
) {
}
