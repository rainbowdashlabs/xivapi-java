package de.chojo.xivapi;

import javax.annotation.Nullable;

public class ApiBuilder {
    private final String token;

    private ApiBuilder(@Nullable String token) {
        this.token = token;
    }

    /**
     * Create a new client ip based api.
     *
     * @return api builder
     */
    public static ApiBuilder create() {
        return new ApiBuilder(null);
    }

    public static ApiBuilder create(String token) {
        return new ApiBuilder(token);
    }

    public XIVAPI build() {
        return new XIVAPIImpl(token);
    }
}
