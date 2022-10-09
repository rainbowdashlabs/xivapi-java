package de.chojo.xivapi.entities.achievement;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AchievementRef(

	@JsonProperty("Data6")
	int data6,

	@JsonProperty("Data7")
	int data7,

	@JsonProperty("Description")
	String description,

	@JsonProperty("Data2")
	int data2,

	@JsonProperty("Data3")
	int data3,

	@JsonProperty("Data4")
	int data4,

	@JsonProperty("Data5")
	int data5,

	@JsonProperty("Description_ja")
	String descriptionJa,

	@JsonProperty("Data0")
	int data0,

	@JsonProperty("Data1")
	int data1,

	@JsonProperty("IconID")
	int iconID,

	@JsonProperty("Name_de")
	String nameDe,

	@JsonProperty("Name")
	String name,

	@JsonProperty("Name_ja")
	String nameJa,

	@JsonProperty("Item")
	int item,

	@JsonProperty("Points")
	int points,

	@JsonProperty("ID")
	int iD,

	@JsonProperty("Description_en")
	String descriptionEn,

	@JsonProperty("Order")
	int order,

	@JsonProperty("AchievementCategory")
	int achievementCategory,

	@JsonProperty("Name_en")
	String nameEn,

	@JsonProperty("Title")
	int title,

	@JsonProperty("IconHD")
	String iconHD,

	@JsonProperty("AchievementTarget")
	int achievementTarget,

	@JsonProperty("Type")
	int type,

	@JsonProperty("Description_de")
	String descriptionDe,

	@JsonProperty("AchievementHideCondition")
	int achievementHideCondition,

	@JsonProperty("Icon")
	String icon,

	@JsonProperty("Name_fr")
	String nameFr,

	@JsonProperty("Description_fr")
	String descriptionFr,

	@JsonProperty("Key")
	int key
) {
}
