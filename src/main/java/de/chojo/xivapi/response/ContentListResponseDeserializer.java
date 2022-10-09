package de.chojo.xivapi.response;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import de.chojo.xivapi.routes.content.ContentType;
import de.chojo.xivapi.routes.content.list.ContentListResponse;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ContentListResponseDeserializer extends JsonDeserializer<ContentListResponse> {
    @Override
    public ContentListResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        List<String> contentType = ctxt.readValue(p, ctxt.getTypeFactory().constructCollectionType(List.class, String.class));
        return new ContentListResponse(contentType.stream().map(ContentType::new).collect(Collectors.toList()));
    }
}
