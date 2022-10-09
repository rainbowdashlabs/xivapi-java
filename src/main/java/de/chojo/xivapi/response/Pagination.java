package de.chojo.xivapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Pagination(@JsonProperty("Page") int page,
                         @JsonProperty("PageNext") Integer pageNext,
                         @JsonProperty("PagePrev") Integer pagePrev,
                         @JsonProperty("PageTotal") int pageTotal,
                         @JsonProperty("Results") int results,
                         @JsonProperty("ResultsPerPage") int resultsPerPage,
                         @JsonProperty("ResultsTotal") int resultsTotal) {
}
