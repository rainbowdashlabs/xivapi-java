package de.chojo.xivapi.entities.action;

import de.chojo.xivapi.XIVAPI;
import de.chojo.xivapi.XIVAPIImpl;
import de.chojo.xivapi.routes.search.SearchIndex;
import org.junit.jupiter.api.Test;

class ItemTest {

    XIVAPI xivapi = XIVAPI.builder().build();

    @Test
    void testRetrieval() {
        xivapi.search().term("Menphina").indexes(SearchIndex.ITEM).complete().results().get(0).getItem();
    }

}
