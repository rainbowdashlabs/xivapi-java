package de.chojo.xivapi.routes.content;

import de.chojo.xivapi.XIVAPIImpl;
import de.chojo.xivapi.routes.content.list.ContentListRequest;

public class Content {
    private final XIVAPIImpl xivapi;

    public Content(XIVAPIImpl xivapi) {
        this.xivapi = xivapi;
    }

    public ContentListRequest list() {
        return new ContentListRequest(xivapi);
    }

    public ContentPageRequest pageForType(ContentType type) {
        return new ContentPageRequest(xivapi, type);
    }

    public ContentPageRequest pageForType(String type) {
        return new ContentPageRequest(xivapi, new ContentType(type).inject(xivapi));
    }
}
