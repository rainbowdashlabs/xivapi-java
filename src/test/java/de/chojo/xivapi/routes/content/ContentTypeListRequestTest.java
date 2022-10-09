package de.chojo.xivapi.routes.content;

import de.chojo.xivapi.XIVAPI;
import de.chojo.xivapi.routes.content.list.ContentListResponse;
import org.junit.jupiter.api.Test;

class ContentTypeListRequestTest {

    XIVAPI xivapi = XIVAPI.builder().build();

    @Test
    public void testRequest() {
        ContentListResponse complete = xivapi.content().complete();
        System.out.println(complete);
    }
}
