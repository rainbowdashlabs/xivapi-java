package de.chojo.xivapi.entities.achievement;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AchievementCategory(

	@JsonProperty("HideCategory")
	int hideCategory,

	@JsonProperty("Name_ja")
	String nameJa,

	@JsonProperty("Order")
	int order,

	@JsonProperty("AchievementKindTargetID")
	int achievementKindTargetID,

	@JsonProperty("AchievementKind")
	AchievementKind achievementKind,

	@JsonProperty("Name_en")
	String nameEn,

	@JsonProperty("ID")
	int iD,

	@JsonProperty("Name_fr")
	String nameFr,

	@JsonProperty("Name_de")
	String nameDe,

	@JsonProperty("ShowComplete")
	int showComplete,

	@JsonProperty("AchievementKindTarget")
	String achievementKindTarget,

	@JsonProperty("Name")
	String name
) {
}
