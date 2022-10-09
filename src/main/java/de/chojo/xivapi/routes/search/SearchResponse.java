package de.chojo.xivapi.routes.search;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.chojo.xivapi.XIVAPIImpl;
import de.chojo.xivapi.response.Pagination;

import java.util.List;

public record SearchResponse(@JsonProperty("Pagination") Pagination pagination,
                             @JsonProperty("Results") List<SearchEntry> results,
                             @JsonProperty("SpeedMs") int speedMs) {
    @JsonIgnore
    public SearchResponse inject(XIVAPIImpl xivapi) {
        for (SearchEntry result : results) {
            result.inject(xivapi);
        }
        return this;
    }
}
