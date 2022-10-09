package de.chojo.xivapi;

import de.chojo.xivapi.routes.content.Content;
import de.chojo.xivapi.routes.content.list.ContentListRequest;
import de.chojo.xivapi.routes.search.SearchRequest;

import javax.annotation.CheckReturnValue;

public interface XIVAPI {
    static ApiBuilder builder() {
        return ApiBuilder.create();
    }

    static ApiBuilder builder(String token) {
        return ApiBuilder.create(token);
    }

    @CheckReturnValue
    SearchRequest search();

    @CheckReturnValue
    Content content();
}
