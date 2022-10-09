package de.chojo.xivapi.entities.achievement;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AchievementKind(

	@JsonProperty("Name_ja")
	String nameJa,

	@JsonProperty("Order")
	int order,

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
