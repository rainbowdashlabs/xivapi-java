package de.chojo.xivapi.response;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import de.chojo.xivapi.routes.search.SearchIndex;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SearchIndexDeserializer extends JsonDeserializer<SearchIndex> {
    private static final Map<String, SearchIndex> mapping;

    static {
        mapping = new HashMap<>();
        for (SearchIndex value : SearchIndex.values()) {
            mapping.put(value.indexName(), value);
        }
    }

    @Override
    public SearchIndex deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        return mapping.get(p.getValueAsString());
    }
}
