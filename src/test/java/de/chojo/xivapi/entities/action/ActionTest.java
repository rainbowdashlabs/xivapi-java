package de.chojo.xivapi.entities.action;

import de.chojo.xivapi.XIVAPI;
import de.chojo.xivapi.XIVAPIImpl;
import de.chojo.xivapi.routes.search.SearchIndex;
import org.junit.jupiter.api.Test;

class ActionTest {

    XIVAPI xivapi = XIVAPI.builder().build();

    @Test
    void testRetrieval() {
        xivapi.search().term("Asphodelos").indexes(SearchIndex.ACTION).complete().results().get(0).getAction();
    }
}
