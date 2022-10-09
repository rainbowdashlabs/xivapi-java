package de.chojo.xivapi.entities.item.sub;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ItemSeries(

	@JsonProperty("Name_ja")
	String nameJa,

	@JsonProperty("Name_en")
	String nameEn,

	@JsonProperty("ID")
	int iD,

	@JsonProperty("Name_fr")
	String nameFr,

	@JsonProperty("Name_de")
	String nameDe,

	@JsonProperty("Name")
	String name
) {
}
