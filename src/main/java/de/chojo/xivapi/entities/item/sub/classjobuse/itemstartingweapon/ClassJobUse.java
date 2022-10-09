package de.chojo.xivapi.entities.item.sub.classjobuse.itemstartingweapon;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ClassJobUse(
	@JsonProperty("Abbreviation")
	String abbreviation,
	@JsonProperty("Abbreviation_ja")
	String abbreviationJa,
	@JsonProperty("MonsterNote")
	int monsterNote,
	@JsonProperty("NameEnglish_de")
	String nameEnglishDe,
	@JsonProperty("Name")
	String name,
	@JsonProperty("ClassJobCategory")
	int classJobCategory,
	@JsonProperty("Name_ja")
	String nameJa,
	@JsonProperty("UIPriority")
	int uIPriority,
	@JsonProperty("UnlockQuest")
	int unlockQuest,
	@JsonProperty("Abbreviation_fr")
	String abbreviationFr,
	@JsonProperty("StartingTown")
	int startingTown,
	@JsonProperty("ID")
	int iD,
	@JsonProperty("ModifierPiety")
	int modifierPiety,
	@JsonProperty("DohDolJobIndex")
	String dohDolJobIndex,
	@JsonProperty("BattleClassIndex")
	int battleClassIndex,
	@JsonProperty("ModifierDexterity")
	int modifierDexterity,
	@JsonProperty("ModifierMind")
	int modifierMind,
	@JsonProperty("ExpArrayIndex")
	int expArrayIndex,
	@JsonProperty("NameEnglish_fr")
	String nameEnglishFr,
	@JsonProperty("Role")
	int role,
	@JsonProperty("Abbreviation_en")
	String abbreviationEn,
	@JsonProperty("PartyBonus")
	int partyBonus,
	@JsonProperty("ClassJobParent")
	int classJobParent,
	@JsonProperty("Icon")
	String icon,
	@JsonProperty("Name_fr")
	String nameFr,
	@JsonProperty("ModifierManaPoints")
	int modifierManaPoints,
	@JsonProperty("Prerequisite")
	int prerequisite,
	@JsonProperty("RelicQuest")
	int relicQuest,
	@JsonProperty("ItemSoulCrystal")
	int itemSoulCrystal,
	@JsonProperty("ModifierVitality")
	int modifierVitality,
	@JsonProperty("PvPActionSortRow")
	int pvPActionSortRow,
	@JsonProperty("NameEnglish_ja")
	String nameEnglishJa,
	@JsonProperty("StartingLevel")
	int startingLevel,
	@JsonProperty("Name_de")
	String nameDe,
	@JsonProperty("ModifierStrength")
	int modifierStrength,
	@JsonProperty("NameEnglish_en")
	String nameEnglishEn,
	@JsonProperty("NameEnglish")
	String nameEnglish,
	@JsonProperty("Abbreviation_de")
	String abbreviationDe,
	@JsonProperty("ModifierHitPoints")
	int modifierHitPoints,
	@JsonProperty("ModifierIntelligence")
	int modifierIntelligence,
	@JsonProperty("CanQueueForDuty")
	int canQueueForDuty,
	@JsonProperty("LimitBreak3")
	int limitBreak3,
	@JsonProperty("LimitBreak2")
	int limitBreak2,
	@JsonProperty("PrimaryStat")
	int primaryStat,
	@JsonProperty("LimitBreak1")
	int limitBreak1,
	@JsonProperty("Name_en")
	String nameEn,
	@JsonProperty("ItemStartingWeapon")
	int itemStartingWeapon,
	@JsonProperty("JobIndex")
	int jobIndex,
	@JsonProperty("IsLimitedJob")
	int isLimitedJob){
}
