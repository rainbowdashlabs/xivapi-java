package de.chojo.xivapi.entities.achievement;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Title(

	@JsonProperty("IsPrefix")
	int isPrefix,

	@JsonProperty("NameFemale_en")
	String nameFemaleEn,

	@JsonProperty("Order")
	int order,

	@JsonProperty("NameFemale_fr")
	String nameFemaleFr,

	@JsonProperty("Name_en")
	String nameEn,

	@JsonProperty("NameFemale")
	String nameFemale,

	@JsonProperty("NameFemale_ja")
	String nameFemaleJa,

	@JsonProperty("Name_de")
	String nameDe,

	@JsonProperty("Name")
	String name,

	@JsonProperty("Name_ja")
	String nameJa,

	@JsonProperty("NameFemale_de")
	String nameFemaleDe,

	@JsonProperty("ID")
	int iD,

	@JsonProperty("Icon")
	String icon,

	@JsonProperty("Name_fr")
	String nameFr
) {
}
