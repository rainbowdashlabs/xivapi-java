package de.chojo.xivapi.entities.action;

import de.chojo.xivapi.XIVAPI;
import de.chojo.xivapi.XIVAPIImpl;
import de.chojo.xivapi.routes.search.SearchIndex;
import org.junit.jupiter.api.Test;

class AchievementTest {

    XIVAPI xivapi = XIVAPI.builder().build();

    @Test
    void testRetrieval() {
        xivapi.search().term("War").indexes(SearchIndex.ACHIEVEMENT).complete().results().get(0).getAchievement();
    }

}
