package de.chojo.xivapi.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import de.chojo.xivapi.response.ContentListResponseDeserializer;
import de.chojo.xivapi.response.EmptyStringDeserializer;
import de.chojo.xivapi.routes.content.list.ContentListResponse;

public final class Mapper {
    public static ObjectMapper create() {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(String.class, new EmptyStringDeserializer())
                .addDeserializer(ContentListResponse.class, new ContentListResponseDeserializer());
        return new JsonMapper()
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.NONE)
                .configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .registerModule(module);
    }
}
