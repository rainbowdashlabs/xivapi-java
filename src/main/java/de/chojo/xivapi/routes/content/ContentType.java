package de.chojo.xivapi.routes.content;

import de.chojo.xivapi.XIVAPIImpl;

public class ContentType {
    private final String id;
    private XIVAPIImpl xivapi;

    public ContentType(String id) {
        this.id = id;
    }

    public ContentType inject(XIVAPIImpl xivapi) {
        this.xivapi = xivapi;
        return this;
    }

    public ContentPageRequest pageRequest(){
        return new ContentPageRequest(xivapi, this);
    }

    public String id() {
        return id;
    }
}
