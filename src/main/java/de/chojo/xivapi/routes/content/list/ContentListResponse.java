package de.chojo.xivapi.routes.content.list;

import de.chojo.xivapi.XIVAPIImpl;
import de.chojo.xivapi.routes.content.ContentType;

import java.util.List;

public record ContentListResponse(List<ContentType> contentType) {
    public void inject(XIVAPIImpl xivapi) {
        for (ContentType contentType : contentType) {
            contentType.inject(xivapi);
        }
    }
}
