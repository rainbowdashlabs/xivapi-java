package de.chojo.xivapi.routes;

import de.chojo.xivapi.XIVAPIImpl;
import de.chojo.xivapi.routes.search.SearchRequest;
import org.apache.hc.core5.net.URIBuilder;
import org.slf4j.Logger;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import static org.slf4j.LoggerFactory.getLogger;

public class RequestBuilder<T> {
    private static final Logger log = getLogger(SearchRequest.class);
    protected final XIVAPIImpl xivapi;
    private final URIBuilder uriBuilder;
    private final Class<T> result;
    private final Consumer<T> postRetrievalHook;

    public RequestBuilder(XIVAPIImpl xivapi, Class<T> result) {
        this(xivapi, result, r -> {});
    }

    public RequestBuilder(XIVAPIImpl xivapi, Class<T> result, Consumer<T> postRetrievalHook) {
        this.xivapi = xivapi;
        uriBuilder = xivapi.uri();
        this.result = result;
        this.postRetrievalHook = postRetrievalHook;
    }

    public URIBuilder uriBuilder() {
        return uriBuilder;
    }

    protected URI uri() {
        try {
            return uriBuilder.build();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<T> queue() {
        return xivapi.getAsyncAndMap(uri(), this.result)
                .thenApply(res -> {
                    postRetrievalHook.accept(res);
                    return res;
                });
    }

    public T complete() {
        T result = xivapi.getAndMap(uri(), this.result);
        postRetrievalHook.accept(result);
        return result;
    }
}
