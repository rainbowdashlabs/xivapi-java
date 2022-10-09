package de.chojo.xivapi.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.chojo.xivapi.util.Mapper;
import org.junit.jupiter.api.Test;

class PaginationTest {
    private static ObjectMapper mapper = Mapper.create();

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
        mapper.readValue(json, Pagination.class);
    }

}
