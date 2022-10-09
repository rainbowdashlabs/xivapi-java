package de.chojo.xivapi.entities.achievement;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AchievementTarget(

	@JsonProperty("Type")
	int type,

	@JsonProperty("Value")
	int value,

	@JsonProperty("ID")
	int iD
) {
}
