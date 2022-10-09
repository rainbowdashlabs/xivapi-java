package de.chojo.xivapi.routes.search;

import de.chojo.xivapi.XIVAPI;
import de.chojo.xivapi.XIVAPIImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SearchRequestTest {

    private static XIVAPI xivapi;
    @BeforeAll
    static void setUp() {
        xivapi = XIVAPI.builder().build();
    }

    @Test
    void indexes() {
        SearchResponse asphodelos = xivapi.search().term("Asphodelos").complete();
        for (SearchEntry result : asphodelos.results()) {
            Assertions.assertEquals(result.type(), "action");
        }
        asphodelos.results().get(0).getAction();
    }

    @Test
    void term() {
    }

    @Test
    void searchAlgorithm() {
    }

    @Test
    void searchColumn() {
    }

    @Test
    void page() {
    }

    @Test
    void sortField() {
    }

    @Test
    void sortOrder() {
    }

    @Test
    void limit() {
    }

    @Test
    void queue() {
    }

    @Test
    void complete() {
    }
}
