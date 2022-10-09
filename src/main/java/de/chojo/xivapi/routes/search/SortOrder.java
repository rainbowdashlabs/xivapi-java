package de.chojo.xivapi.routes.search;

public enum SortOrder {
    ASCENDING("asc"),
    DESCENDING("desc");

    private final String sortName;

    SortOrder(String sortName) {
        this.sortName = sortName;
    }
}
