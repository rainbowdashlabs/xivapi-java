package de.chojo.xivapi.entities.item.sub;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ItemGlamour(
        @JsonProperty("Plural") String plural,
        @JsonProperty("ClassJobCategory") int classJobCategory,
        @JsonProperty("ID") int id,
        @JsonProperty("Description_en") String descriptionEn,
        @JsonProperty("Plural_ja") String pluralJa,
        @JsonProperty("ItemRepair") int itemRepair,
        @JsonProperty("LevelItem") int levelItem,
        @JsonProperty("ItemGlamour") int itemGlamour,
        @JsonProperty("ItemSpecialBonusParam") int itemSpecialBonusParam,
        @JsonProperty("SubStatCategory") int subStatCategory,
        @JsonProperty("IsDyeable") int isDyeable,
        @JsonProperty("ItemSortCategory") int itemSortCategory,
        @JsonProperty("ItemAction") int itemAction,
        @JsonProperty("Lot") int lot,
        @JsonProperty("Singular") String singular,
        @JsonProperty("MaterializeType") int materializeType,
        @JsonProperty("BaseParamSpecial5") int baseParamSpecial5,
        @JsonProperty("StartsWithVowel") int startsWithVowel,
        @JsonProperty("Desynth") int desynth,
        @JsonProperty("Description_de") String descriptionDe,
        @JsonProperty("BaseParamSpecial0") int baseParamSpecial0,
        @JsonProperty("IsIndisposable") int isIndisposable,
        @JsonProperty("Name_fr") String nameFr,
        @JsonProperty("PossessivePronoun") int possessivePronoun,
        @JsonProperty("BaseParamSpecial4") int baseParamSpecial4,
        @JsonProperty("BaseParamSpecial3") int baseParamSpecial3,
        @JsonProperty("BaseParamSpecial2") int baseParamSpecial2,
        @JsonProperty("BaseParamSpecial1") int baseParamSpecial1,
        @JsonProperty("Description") String description,
        @JsonProperty("DamagePhys") int damagePhys,
        @JsonProperty("Article") int article,
        @JsonProperty("CooldownS") int cooldownS,
        @JsonProperty("IconID") int iconID,
        @JsonProperty("Name_de") String nameDe,
        @JsonProperty("BaseParamModifier") int baseParamModifier,
        @JsonProperty("Plural_de") String pluralDe,
        @JsonProperty("DefenseMag") int defenseMag,
        @JsonProperty("IsUnique") int isUnique,
        @JsonProperty("IsPvP") int isPvP,
        @JsonProperty("IsCrestWorthy") int isCrestWorthy,
        @JsonProperty("Adjective") int adjective,
        @JsonProperty("Name_en") String nameEn,
        @JsonProperty("Singular_ja") String singularJa,
        @JsonProperty("CastTimeS") int castTimeS,
        @JsonProperty("IconHD") String iconHD,
        @JsonProperty("BaseParam5") int baseParam5,
        @JsonProperty("BaseParam4") int baseParam4,
        @JsonProperty("IsGlamourous") int isGlamourous,
        @JsonProperty("BaseParam1") int baseParam1,
        @JsonProperty("BaseParam0") int baseParam0,
        @JsonProperty("BaseParam3") int baseParam3,
        @JsonProperty("BaseParam2") int baseParam2,
        @JsonProperty("BaseParamValueSpecial2") int baseParamValueSpecial2,
        @JsonProperty("AlwaysCollectable") int alwaysCollectable,
        @JsonProperty("BaseParamValueSpecial3") int baseParamValueSpecial3,
        @JsonProperty("BaseParamValueSpecial0") int baseParamValueSpecial0,
        @JsonProperty("Singular_fr") String singularFr,
        @JsonProperty("BaseParamValueSpecial1") int baseParamValueSpecial1,
        @JsonProperty("ModelSub") String modelSub,
        @JsonProperty("ItemSearchCategory") int itemSearchCategory,
        @JsonProperty("Description_ja") String descriptionJa,
        @JsonProperty("Plural_en") String pluralEn,
        @JsonProperty("CanBeHq") int canBeHq,
        @JsonProperty("IsUntradable") int isUntradable,
        @JsonProperty("Name") String name,
        @JsonProperty("Name_ja") String nameJa,
        @JsonProperty("LevelEquip") int levelEquip,
        @JsonProperty("BlockRate") int blockRate,
        @JsonProperty("BaseParamValueSpecial4") int baseParamValueSpecial4,
        @JsonProperty("BaseParamValueSpecial5") int baseParamValueSpecial5,
        @JsonProperty("AdditionalData") int additionalData,
        @JsonProperty("DamageMag") int damageMag,
        @JsonProperty("MateriaSlotCount") int materiaSlotCount,
        @JsonProperty("ItemSpecialBonus") int itemSpecialBonus,
        @JsonProperty("ClassJobRepair") int classJobRepair,
        @JsonProperty("ItemSeries") int itemSeries,
        @JsonProperty("Rarity") int rarity,
        @JsonProperty("Block") int block,
        @JsonProperty("Icon") String icon,
        @JsonProperty("EquipSlotCategory") int equipSlotCategory,
        @JsonProperty("EquipRestriction") int equipRestriction,
        @JsonProperty("DelayMs") int delayMs,
        @JsonProperty("AetherialReduce") int aetherialReduce,
        @JsonProperty("IsCollectable") int isCollectable,
        @JsonProperty("FilterGroup") int filterGroup,
        @JsonProperty("BaseParamValue5") int baseParamValue5,
        @JsonProperty("PriceLow") int priceLow,
        @JsonProperty("GrandCompany") int grandCompany,
        @JsonProperty("Singular_de") String singularDe,
        @JsonProperty("DefensePhys") int defensePhys,
        @JsonProperty("StackSize") int stackSize,
        @JsonProperty("Singular_en") String singularEn,
        @JsonProperty("BaseParamValue2") int baseParamValue2,
        @JsonProperty("BaseParamValue1") int baseParamValue1,
        @JsonProperty("BaseParamValue4") int baseParamValue4,
        @JsonProperty("BaseParamValue3") int baseParamValue3,
        @JsonProperty("ClassJobUse") int classJobUse,
        @JsonProperty("Plural_fr") String pluralFr,
        @JsonProperty("PriceMid") int priceMid,
        @JsonProperty("Pronoun") int pronoun,
        @JsonProperty("BaseParamValue0") int baseParamValue0,
        @JsonProperty("IsAdvancedMeldingPermitted") int isAdvancedMeldingPermitted,
        @JsonProperty("ItemUICategory") int itemUICategory,
        @JsonProperty("ModelMain") String modelMain,
        @JsonProperty("Description_fr") String descriptionFr
) {
}