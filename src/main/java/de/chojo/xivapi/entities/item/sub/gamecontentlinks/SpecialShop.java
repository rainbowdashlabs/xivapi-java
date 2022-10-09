package de.chojo.xivapi.entities.item.sub.gamecontentlinks;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record SpecialShop(
        @JsonProperty("ItemReceive00") List<Integer> itemReceive00
) {
}
