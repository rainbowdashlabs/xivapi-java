package de.chojo.xivapi.entities.achievement;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.chojo.xivapi.entities.item.Item;
import de.chojo.xivapi.entities.item.sub.GameContentLinks;
import de.chojo.xivapi.entities.shared.GamePatch;

public record Achievement(

	@JsonProperty("Description_ja")
	String descriptionJa,

	@JsonProperty("TitleTarget")
	String titleTarget,

	@JsonProperty("Name")
	String name,

	@JsonProperty("ItemTarget")
	String itemTarget,

	@JsonProperty("Name_ja")
	String nameJa,

	@JsonProperty("Item")
    Item item,

	@JsonProperty("GamePatch")
    GamePatch gamePatch,

	@JsonProperty("QuestRequirementsAll")
	boolean questRequirementsAll,

	@JsonProperty("ID")
	int iD,

	@JsonProperty("Description_en")
	String descriptionEn,

	@JsonProperty("Order")
	int order,

	@JsonProperty("ClassJobRequirements")
	List<Object> classJobRequirements,

	@JsonProperty("AchievementTarget")
	AchievementTarget achievementTarget,

	@JsonProperty("PostAchievements")
	List<AchievementRef> postAchievements,

	@JsonProperty("Description_de")
	String descriptionDe,

	@JsonProperty("Icon")
	String icon,

	@JsonProperty("Name_fr")
	String nameFr,

	@JsonProperty("Patch")
	int patch,

	@JsonProperty("Key")
	int key,

	@JsonProperty("PreAchievements")
	List<AchievementRef> preAchievements,

	@JsonProperty("TitleTargetID")
	int titleTargetID,

	@JsonProperty("Data6")
	int data6,

	@JsonProperty("AchievementTargetTargetID")
	int achievementTargetTargetID,

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

	@JsonProperty("Data0")
	int data0,

	@JsonProperty("Data1")
	int data1,

	@JsonProperty("QuestRequirements")
	List<Object> questRequirements,

	@JsonProperty("IconID")
	int iconID,

	@JsonProperty("Name_de")
	String nameDe,

	@JsonProperty("Url")
	String url,

	@JsonProperty("AchievementTargetTarget")
	String achievementTargetTarget,

	@JsonProperty("Points")
	int points,

	@JsonProperty("AchievementCategoryTargetID")
	int achievementCategoryTargetID,

	@JsonProperty("ItemTargetID")
	int itemTargetID,

	@JsonProperty("AchievementHideConditionTarget")
	String achievementHideConditionTarget,

	@JsonProperty("AchievementCategory")
	AchievementCategory achievementCategory,

	@JsonProperty("Name_en")
	String nameEn,

	@JsonProperty("Title")
	Title title,

	@JsonProperty("IconHD")
	String iconHD,

	@JsonProperty("AchievementHideConditionTargetID")
	int achievementHideConditionTargetID,

	@JsonProperty("Type")
	int type,

	@JsonProperty("GameContentLinks")
    GameContentLinks gameContentLinks,

	@JsonProperty("AchievementHideCondition")
	Object achievementHideCondition,

	@JsonProperty("Description_fr")
	String descriptionFr,

	@JsonProperty("AchievementCategoryTarget")
	String achievementCategoryTarget
) {
}
