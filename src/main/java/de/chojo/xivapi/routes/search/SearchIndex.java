package de.chojo.xivapi.routes.search;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.chojo.xivapi.response.SearchIndexDeserializer;

@JsonDeserialize(using = SearchIndexDeserializer.class)
public enum SearchIndex {
    ACHIEVEMENT("Achievement"),
    TITLE("Title"),
    ACTION("Action"),
    CRAFT_ACTION("CraftAction"),
    TRAIT("Trait"),
    PVP_ACTION("PvPAction"),
    PVP_TRAIT("PvPTrait"),
    STATUS("Status"),
    B_NPC_NAME("BNpcName"),
    E_NPC_RESIDENT("ENpcResident"),
    COMPANION("Companion"),
    MOUNT("Mount"),
    LEVE("Leve"),
    EMOTE("Emote"),
    INSTANCE_CONTENT("InstanceContent"),
    ITEM("Item"),
    RECIPE("Recipe"),
    FATE("Fate"),
    QUEST("Quest"),
    CONTENT_FINDER_CONDITION("ContentFinderCondition"),
    BALLOON("Balloon"),
    BUDDY_EQUIP("BuddyEquip"),
    ORCHESTRION("Orchestrion"),
    PLACE_NAME("PlaceName"),
    WEATHER("Weather"),
    WORLD("World"),
    MAP("Map"),
    LORE_FINDER("lore_finder");

    private final String indexName;

    SearchIndex(String indexName) {
        this.indexName = indexName;
    }

    public String indexName() {
        return indexName;
    }
}
