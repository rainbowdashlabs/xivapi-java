package de.chojo.xivapi.routes.search;

public enum SearchAlgorithm {
    /**
     * wildcard + fuzzy
     */
    custom("custom"),
    /**
     * Post wildcard, eg: Aim*
     */
    wildcard("wildcard"),
    /**
     * Post & Prefix wildcard, eg: *Aim*
     */
    wildcard_plus("wildcard_plus"),
    /**
     * Perform a fuzzy search. Fuzziness = 5
     */
    fuzzy("fuzzy"),
    /**
     * Match whole words by keyword terms.
     */
    term("term"),
    /**
     * Match a prefix, like a cheap auto-complete
     */
    prefix("prefix"),
    /**
     * Perform a match query.
     */
    match("match"),
    /**
     * Perform a match phrase query
     */
    match_phrase("match_phrase"),
    /**
     * Perform a match phrase prefix query
     */
    match_phrase_prefix("match_phrase_prefix"),
    /**
     * Match against multiple string columns, separated by a comma.
     */
    multi_match("multi_match"),
    /**
     * Perform a query string, this has lots of logic!
     */
    query_string("query_string");

    private final String algoName;

    SearchAlgorithm(String algoName) {
        this.algoName = algoName;
    }

    public String algoName() {
        return algoName;
    }
}
