package de.chojo.xivapi.response;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;

import java.io.IOException;

public class EmptyStringDeserializer extends JsonDeserializer<String> {
    @Override
    public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        String deserialize = StringDeserializer.instance.deserialize(p, ctxt);
        if (deserialize == null || deserialize.isBlank()) {
            return null;
        }
        return deserialize;
    }
}
