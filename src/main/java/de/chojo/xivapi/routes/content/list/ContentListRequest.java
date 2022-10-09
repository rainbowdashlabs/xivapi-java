package de.chojo.xivapi.routes.content.list;

import de.chojo.xivapi.XIVAPIImpl;
import de.chojo.xivapi.routes.RequestBuilder;

public class ContentListRequest extends RequestBuilder<ContentListResponse> {
    public ContentListRequest(XIVAPIImpl xivapi) {
        super(xivapi, ContentListResponse.class, response -> response.inject(xivapi));
        uriBuilder().appendPath("content");
    }
}
