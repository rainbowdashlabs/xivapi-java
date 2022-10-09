package de.chojo.xivapi.routes.search;

import de.chojo.xivapi.XIVAPIImpl;
import de.chojo.xivapi.routes.RequestBuilder;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SearchRequest extends RequestBuilder<SearchResponse> {

    public SearchRequest(XIVAPIImpl xivapi) {
        super(xivapi, SearchResponse.class, r -> r.inject(xivapi));
        uriBuilder().appendPath("search");
    }

    /**
     * Search a specific series of indexes.
     *
     * @param indexes One or more indexes to search in.
     * @return request builder
     */
    public SearchRequest indexes(SearchIndex... indexes) {
        // TODO: Add assertion
        String indexString = Arrays.stream(indexes).map(SearchIndex::indexName).collect(Collectors.joining(","));
        uriBuilder().addParameter("indexes", indexString);
        return this;
    }

    /**
     * The string to search for. The results for this are affected by {@link #searchColumn(String)} and {@link #searchAlgorithm(SearchAlgorithm)}.
     *
     * @param term term to search for.
     * @return request builder
     */
    public SearchRequest term(String term) {
        uriBuilder().addParameter("string", term);
        return this;
    }

    /**
     * The search algorithm to use for string matching.
     * <p>
     * Default: {@link SearchAlgorithm#wildcard}
     *
     * @param searchAlgorithm search algorithm
     * @return request builder
     */
    public SearchRequest searchAlgorithm(SearchAlgorithm searchAlgorithm) {
        uriBuilder().addParameter("string_algo", searchAlgorithm.algoName());
        return this;
    }

    /**
     * The column to use in searches.
     *
     * @param column column
     * @return request builder
     */
    public SearchRequest searchColumn(String column) {
        uriBuilder().addParameter("string_column", column);
        return this;
    }

    /**
     * Set the search results page, this controls pagination in the response
     *
     * @param page page
     * @return request builder
     */
    public SearchRequest page(int page) {
        uriBuilder().addParameter("page", String.valueOf(page));
        return this;
    }

    /**
     * Sort results by a specific field, you will lose scoring.
     *
     * @param field field name
     * @return request builder
     */
    public SearchRequest sortField(String field) {
        uriBuilder().addParameter("sort_field", field);
        return this;
    }

    /**
     * Order the {@link #sortField(String)} by a specific direction.
     *
     * @param sortOrder order
     * @return request builder
     */
    public SearchRequest sortOrder(SortOrder sortOrder) {
        uriBuilder().addParameter("sort_order", sortOrder.name());
        return this;
    }

    public SearchRequest limit(int limit) {
        //TODO: Assert 1 to 100
        uriBuilder().addParameter("limit", String.valueOf(limit));
        return this;
    }

}
