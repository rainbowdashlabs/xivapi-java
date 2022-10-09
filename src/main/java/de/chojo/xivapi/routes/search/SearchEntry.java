package de.chojo.xivapi.routes.search;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.chojo.xivapi.XIVAPIImpl;
import de.chojo.xivapi.entities.achievement.Achievement;
import de.chojo.xivapi.entities.action.Action;
import de.chojo.xivapi.entities.item.Item;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public final class SearchEntry {
    private final int id;
    private final String icon;
    private final String name;
    private final String url;
    private final SearchIndex urlType;
    private final String type;
    private final int score;
    private XIVAPIImpl xivapi;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public SearchEntry(@JsonProperty("ID") int id,
                       @JsonProperty("Icon") String icon,
                       @JsonProperty("Name") String name,
                       @JsonProperty("Url") String url,
                       @JsonProperty("UrlType") SearchIndex urlType,
                       @JsonProperty("_") String type,
                       @JsonProperty("_Score") int score) {
        this.id = id;
        this.icon = icon;
        this.name = name;
        this.url = url;
        this.urlType = urlType;
        this.type = type;
        this.score = score;
    }

    public int id() {
        return id;
    }

    public String icon() {
        return icon;
    }

    public String name() {
        return name;
    }

    public String url() {
        return url;
    }

    public SearchIndex urlType() {
        return urlType;
    }

    public String type() {
        return type;
    }

    public int score() {
        return score;
    }

    public SearchEntry inject(XIVAPIImpl xivapi) {
        this.xivapi = xivapi;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (SearchEntry) obj;
        return this.id == that.id &&
               Objects.equals(this.icon, that.icon) &&
               Objects.equals(this.name, that.name) &&
               Objects.equals(this.url, that.url) &&
               Objects.equals(this.urlType, that.urlType) &&
               Objects.equals(this.type, that.type) &&
               this.score == that.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, icon, name, url, urlType, type, score);
    }

    @Override
    public String toString() {
        return "SearchEntry[" +
               "id=" + id + ", " +
               "icon=" + icon + ", " +
               "name=" + name + ", " +
               "url=" + url + ", " +
               "urlType=" + urlType + ", " +
               "type=" + type + ", " +
               "score=" + score + ']';
    }

    public CompletableFuture<Action> retrieveAction() {
        return xivapi.getAsyncAndMap(xivapi.uri().appendPathSegments(url.substring(1)), Action.class);
    }

    public Action getAction() {
        return xivapi.getAndMap(xivapi.uri().appendPathSegments(url.substring(1)), Action.class);
    }

    public CompletableFuture<Achievement> retrieveAchievement() {
        return xivapi.getAsyncAndMap(xivapi.uri().appendPathSegments(url.substring(1)), Achievement.class);
    }

    public Achievement getAchievement() {
        return xivapi.getAndMap(xivapi.uri().appendPathSegments(url.substring(1)), Achievement.class);
    }

    public CompletableFuture<Item> retrieveitem() {
        return xivapi.getAsyncAndMap(xivapi.uri().appendPathSegments(url.substring(1)), Item.class);
    }

    public Item getItem() {
        return xivapi.getAndMap(xivapi.uri().appendPathSegments(url.substring(1)), Item.class);
    }
}
