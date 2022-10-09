package de.chojo.xivapi.routes.search;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import de.chojo.xivapi.util.Mapper;
import org.junit.jupiter.api.Test;

import java.util.List;

class SearchEntryTest {
    private static ObjectMapper objectMapper = Mapper.create();

    @Test
    public void testDeserialization() throws JsonProcessingException {
        var json = """
                       {
                       "ID": 26352,
                           "Icon": "/i/000000/000405.png",
                           "Name": "Firestorms of Asphodelos",
                           "Url": "/Action/26352",
                           "UrlType": "Action",
                           "_": "action",
                           "_Score": 1
                   }
                   """;
        objectMapper.readValue(json, SearchEntry.class);

        json = "[%s, %s]".formatted(json, json);

        CollectionType type = objectMapper.getTypeFactory()
                                          .constructCollectionType(List.class, SearchEntry.class);


        List<SearchEntry> o = objectMapper.readValue(json, type);
    }

}
