package de.chojo.xivapi.entities.item.sub.classjobuse.itemstartingweapon;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ItemRepairRef(

	@JsonProperty("Item")
	int item,

	@JsonProperty("ID")
	int iD
) {
}
