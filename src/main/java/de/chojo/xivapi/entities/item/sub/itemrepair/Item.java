package de.chojo.xivapi.entities.item.sub.itemrepair;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.chojo.xivapi.entities.item.ItemSearchCategory;
import de.chojo.xivapi.entities.item.ItemSortCategory;
import de.chojo.xivapi.entities.item.ItemSpecialBonus;
import de.chojo.xivapi.entities.item.sub.BaseParam;
import de.chojo.xivapi.entities.item.sub.ClassJobCategory;
import de.chojo.xivapi.entities.item.sub.ClassJobRepair;
import de.chojo.xivapi.entities.item.sub.ClassJobUse;
import de.chojo.xivapi.entities.item.sub.EquipSlotCategory;
import de.chojo.xivapi.entities.item.sub.GrandCompany;
import de.chojo.xivapi.entities.item.sub.ItemGlamour;
import de.chojo.xivapi.entities.item.sub.ItemRepair;
import de.chojo.xivapi.entities.item.sub.ItemUICategory;

public record Item(

	@JsonProperty("Plural")
	String plural,

	@JsonProperty("ClassJobCategory")
    ClassJobCategory classJobCategory,

	@JsonProperty("BaseParam3TargetID")
	int baseParam3TargetID,

	@JsonProperty("ItemRepairTarget")
	String itemRepairTarget,

	@JsonProperty("ID")
	int iD,

	@JsonProperty("BaseParamSpecial4Target")
	String baseParamSpecial4Target,

	@JsonProperty("Description_en")
	String descriptionEn,

	@JsonProperty("Plural_ja")
	String pluralJa,

	@JsonProperty("BaseParamSpecial1Target")
	String baseParamSpecial1Target,

	@JsonProperty("ItemRepair")
    ItemRepair itemRepair,

	@JsonProperty("LevelItem")
	int levelItem,

	@JsonProperty("ItemGlamour")
    ItemGlamour itemGlamour,

	@JsonProperty("ItemSpecialBonusParam")
	int itemSpecialBonusParam,

	@JsonProperty("SubStatCategory")
	int subStatCategory,

	@JsonProperty("IsDyeable")
	int isDyeable,

	@JsonProperty("ItemSortCategory")
    ItemSortCategory itemSortCategory,

    //TODO unkown
	@JsonProperty("ItemAction")
	Object itemAction,

	@JsonProperty("BaseParam4Target")
	String baseParam4Target,

	@JsonProperty("Lot")
	int lot,

	@JsonProperty("Singular")
	String singular,

	@JsonProperty("MaterializeType")
	int materializeType,

	@JsonProperty("BaseParam1Target")
	String baseParam1Target,

	@JsonProperty("BaseParamSpecial5")
    BaseParam baseParamSpecial5,

	@JsonProperty("StartsWithVowel")
	int startsWithVowel,

	@JsonProperty("BaseParamSpecial5TargetID")
	int baseParamSpecial5TargetID,

	@JsonProperty("Desynth")
	int desynth,

	@JsonProperty("ClassJobCategoryTarget")
	String classJobCategoryTarget,

	@JsonProperty("Description_de")
	String descriptionDe,

	@JsonProperty("BaseParamSpecial0")
    BaseParam baseParamSpecial0,

	@JsonProperty("ItemSpecialBonusTargetID")
	int itemSpecialBonusTargetID,

	@JsonProperty("IsIndisposable")
	int isIndisposable,

	@JsonProperty("Name_fr")
	String nameFr,

	@JsonProperty("PossessivePronoun")
	int possessivePronoun,

	@JsonProperty("BaseParamSpecial4")
    BaseParam baseParamSpecial4,

	@JsonProperty("BaseParamSpecial3")
    BaseParam baseParamSpecial3,

	@JsonProperty("BaseParamSpecial2")
    BaseParam baseParamSpecial2,

	@JsonProperty("BaseParamSpecial1")
    BaseParam baseParamSpecial1,

	@JsonProperty("ItemActionTargetID")
	int itemActionTargetID,

	@JsonProperty("Description")
	String description,

	@JsonProperty("DamagePhys")
	int damagePhys,

	@JsonProperty("BaseParam0TargetID")
	int baseParam0TargetID,

	@JsonProperty("Article")
	int article,

	@JsonProperty("CooldownS")
	int cooldownS,

	@JsonProperty("ClassJobCategoryTargetID")
	int classJobCategoryTargetID,

	@JsonProperty("BaseParamSpecial2Target")
	String baseParamSpecial2Target,

	@JsonProperty("IconID")
	int iconID,

	@JsonProperty("Name_de")
	String nameDe,

	@JsonProperty("BaseParamModifier")
	int baseParamModifier,

	@JsonProperty("Plural_de")
	String pluralDe,

	@JsonProperty("ItemSeriesTargetID")
	int itemSeriesTargetID,

	@JsonProperty("BaseParam4TargetID")
	int baseParam4TargetID,

	@JsonProperty("DefenseMag")
	int defenseMag,

	@JsonProperty("GrandCompanyTargetID")
	int grandCompanyTargetID,

	@JsonProperty("IsUnique")
	int isUnique,

	@JsonProperty("IsPvP")
	int isPvP,

	@JsonProperty("BaseParam2Target")
	String baseParam2Target,

	@JsonProperty("BaseParamSpecial1TargetID")
	int baseParamSpecial1TargetID,

	@JsonProperty("ItemSearchCategoryTarget")
	String itemSearchCategoryTarget,

	@JsonProperty("IsCrestWorthy")
	int isCrestWorthy,

	@JsonProperty("GrandCompanyTarget")
	String grandCompanyTarget,

	@JsonProperty("Adjective")
	int adjective,

	@JsonProperty("ItemGlamourTarget")
	String itemGlamourTarget,

	@JsonProperty("Name_en")
	String nameEn,

	@JsonProperty("Singular_ja")
	String singularJa,

	@JsonProperty("CastTimeS")
	int castTimeS,

	@JsonProperty("ClassJobRepairTarget")
	String classJobRepairTarget,

	@JsonProperty("IconHD")
	String iconHD,

	@JsonProperty("BaseParamSpecial4TargetID")
	int baseParamSpecial4TargetID,

	@JsonProperty("BaseParam5")
    BaseParam baseParam5,

	@JsonProperty("BaseParam4")
    BaseParam baseParam4,

	@JsonProperty("ItemSpecialBonusTarget")
	String itemSpecialBonusTarget,

	@JsonProperty("BaseParamSpecial3Target")
	String baseParamSpecial3Target,

	@JsonProperty("IsGlamourous")
	int isGlamourous,

	@JsonProperty("ClassJobUseTargetID")
	int classJobUseTargetID,

	@JsonProperty("BaseParam1")
    BaseParam baseParam1,

	@JsonProperty("BaseParam0")
    BaseParam baseParam0,

	@JsonProperty("BaseParam3")
    BaseParam baseParam3,

	@JsonProperty("BaseParam2")
    BaseParam baseParam2,

	@JsonProperty("BaseParamValueSpecial2")
	int baseParamValueSpecial2,

	@JsonProperty("AlwaysCollectable")
	int alwaysCollectable,

	@JsonProperty("BaseParamValueSpecial3")
	int baseParamValueSpecial3,

	@JsonProperty("BaseParamValueSpecial0")
	int baseParamValueSpecial0,

	@JsonProperty("Singular_fr")
	String singularFr,

	@JsonProperty("BaseParamValueSpecial1")
	int baseParamValueSpecial1,

	@JsonProperty("ModelSub")
	String modelSub,

	@JsonProperty("EquipSlotCategoryTarget")
	String equipSlotCategoryTarget,

	@JsonProperty("ItemSearchCategory")
    ItemSearchCategory itemSearchCategory,

	@JsonProperty("BaseParam3Target")
	String baseParam3Target,

	@JsonProperty("Description_ja")
	String descriptionJa,

	@JsonProperty("Plural_en")
	String pluralEn,

	@JsonProperty("CanBeHq")
	int canBeHq,

	@JsonProperty("BaseParam0Target")
	String baseParam0Target,

	@JsonProperty("BaseParam1TargetID")
	int baseParam1TargetID,

	@JsonProperty("IsUntradable")
	int isUntradable,

	@JsonProperty("ItemGlamourTargetID")
	int itemGlamourTargetID,

	@JsonProperty("Name")
	String name,

	@JsonProperty("Name_ja")
	String nameJa,

	@JsonProperty("LevelEquip")
	int levelEquip,

	@JsonProperty("BlockRate")
	int blockRate,

	@JsonProperty("ItemActionTarget")
	String itemActionTarget,

	@JsonProperty("BaseParam5TargetID")
	int baseParam5TargetID,

	@JsonProperty("BaseParamValueSpecial4")
	int baseParamValueSpecial4,

	@JsonProperty("BaseParamValueSpecial5")
	int baseParamValueSpecial5,

	@JsonProperty("AdditionalData")
	int additionalData,

	@JsonProperty("DamageMag")
	int damageMag,

	@JsonProperty("BaseParamSpecial0TargetID")
	int baseParamSpecial0TargetID,

	@JsonProperty("MateriaSlotCount")
	int materiaSlotCount,

	@JsonProperty("ItemSpecialBonus")
    ItemSpecialBonus itemSpecialBonus,

	@JsonProperty("ClassJobRepair")
    ClassJobRepair classJobRepair,

	@JsonProperty("BaseParamSpecial3TargetID")
	int baseParamSpecial3TargetID,

	@JsonProperty("ItemSeries")
	Object itemSeries,

	@JsonProperty("Rarity")
	int rarity,

	@JsonProperty("BaseParamSpecial5Target")
	String baseParamSpecial5Target,

	@JsonProperty("EquipSlotCategoryTargetID")
	int equipSlotCategoryTargetID,

	@JsonProperty("ItemSeriesTarget")
	String itemSeriesTarget,

	@JsonProperty("Block")
	int block,

	@JsonProperty("Icon")
	String icon,

	@JsonProperty("ClassJobRepairTargetID")
	int classJobRepairTargetID,

	@JsonProperty("EquipSlotCategory")
    EquipSlotCategory equipSlotCategory,

	@JsonProperty("BaseParam5Target")
	String baseParam5Target,

	@JsonProperty("EquipRestriction")
	int equipRestriction,

	@JsonProperty("DelayMs")
	int delayMs,

	@JsonProperty("ItemSortCategoryTarget")
	String itemSortCategoryTarget,

	@JsonProperty("AetherialReduce")
	int aetherialReduce,

	@JsonProperty("IsCollectable")
	int isCollectable,

	@JsonProperty("BaseParam2TargetID")
	int baseParam2TargetID,

	@JsonProperty("FilterGroup")
	int filterGroup,

	@JsonProperty("ItemUICategoryTarget")
	String itemUICategoryTarget,

	@JsonProperty("ItemSortCategoryTargetID")
	int itemSortCategoryTargetID,

	@JsonProperty("BaseParamValue5")
	int baseParamValue5,

	@JsonProperty("PriceLow")
	int priceLow,

	@JsonProperty("ItemUICategoryTargetID")
	int itemUICategoryTargetID,

    //TODO unkown
	@JsonProperty("GrandCompany")
    GrandCompany grandCompany,

	@JsonProperty("Singular_de")
	String singularDe,

	@JsonProperty("BaseParamSpecial2TargetID")
	int baseParamSpecial2TargetID,

	@JsonProperty("DefensePhys")
	int defensePhys,

	@JsonProperty("StackSize")
	int stackSize,

	@JsonProperty("Singular_en")
	String singularEn,

	@JsonProperty("BaseParamValue2")
	int baseParamValue2,

	@JsonProperty("BaseParamValue1")
	int baseParamValue1,

	@JsonProperty("BaseParamValue4")
	int baseParamValue4,

	@JsonProperty("BaseParamValue3")
	int baseParamValue3,

	@JsonProperty("ClassJobUse")
    ClassJobUse classJobUse,

	@JsonProperty("ClassJobUseTarget")
	String classJobUseTarget,

	@JsonProperty("Plural_fr")
	String pluralFr,

	@JsonProperty("PriceMid")
	int priceMid,

	@JsonProperty("Pronoun")
	int pronoun,

	@JsonProperty("BaseParamValue0")
	int baseParamValue0,

	@JsonProperty("IsAdvancedMeldingPermitted")
	int isAdvancedMeldingPermitted,

	@JsonProperty("ItemRepairTargetID")
	int itemRepairTargetID,

	@JsonProperty("ItemUICategory")
    ItemUICategory itemUICategory,

	@JsonProperty("ModelMain")
	String modelMain,

	@JsonProperty("ItemSearchCategoryTargetID")
	int itemSearchCategoryTargetID,

	@JsonProperty("BaseParamSpecial0Target")
	String baseParamSpecial0Target,

	@JsonProperty("Description_fr")
	String descriptionFr
) {
}
