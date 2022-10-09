package de.chojo.xivapi.routes.content;

import de.chojo.xivapi.XIVAPIImpl;
import de.chojo.xivapi.routes.RequestBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class ContentPageRequest extends RequestBuilder {
    public ContentPageRequest(XIVAPIImpl xivapi, ContentType type) {
        super(xivapi, ContentPageResponse.class);
        uriBuilder().appendPath(type.id());
    }

    /**
     * Limit the number of items returned by the API.
     * <p>
     * Default: 100
     * <p>
     * Max: 3000
     *
     * @param limit limit
     * @return builder instance
     */
    public ContentPageRequest limit(int limit) {
        uriBuilder().addParameter("limit", String.valueOf(limit));
        return this;
    }

    /**
     * Filter the ids down if you want data for a specific series of items.
     *
     * @param ids ids
     * @return builder instance
     */
    public ContentPageRequest ids(List<Integer> ids) {
        uriBuilder().addParameter("ids", ids.stream().map(String::valueOf).collect(Collectors.joining(",")));
        return this;
    }
}
