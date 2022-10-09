package de.chojo.xivapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.chojo.xivapi.routes.content.Content;
import de.chojo.xivapi.routes.content.list.ContentListRequest;
import de.chojo.xivapi.routes.search.SearchRequest;
import de.chojo.xivapi.util.Mapper;
import io.github.bucket4j.Bucket;
import org.apache.hc.core5.net.URIBuilder;
import org.slf4j.Logger;

import javax.annotation.CheckReturnValue;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static org.slf4j.LoggerFactory.getLogger;

public class XIVAPIImpl implements XIVAPI {
    private final Bucket lodestone = Buckets.newLodestoneBucket();
    private final Bucket xivapi = Buckets.newXIVapiBucket();
    private static final Logger log = getLogger(XIVAPIImpl.class);
    private final String token;
    private final HttpClient http = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    private final ObjectMapper objectMapper;
    private final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
    private final Content content;

    protected XIVAPIImpl(String token) {
        this.token = token;
        objectMapper = Mapper.create();
        content = new Content(this);
    }

    /**
     * Request data via the search route.
     *
     * @return a new search request
     */
    @Override
    @CheckReturnValue
    public SearchRequest search() {
        return new SearchRequest(this);
    }

    @Override
    public Content content() {
        return content;
    }

    public HttpClient http() {
        return http;
    }

    public HttpRequest.Builder request(String... path) {
        return HttpRequest.newBuilder(URI.create("https://xivapi.com/%s".formatted(String.join("/", path))));
    }

    public URIBuilder uri() {
        URIBuilder https = new URIBuilder().setScheme("https").setHost("xivapi.com");
        if (token != null) {
            https.addParameter("private_key", token);
        }
        return https;
    }

    public ObjectMapper objectMapper() {
        return objectMapper;
    }

    public <T> CompletableFuture<T> getAsyncAndMap(URIBuilder uri, Class<T> result) {
        try {
            return getAsyncAndMap(uri.build(), result);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T getAndMap(URIBuilder uri, Class<T> result) {
        try {
            return getAndMap(uri.build(), result);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> CompletableFuture<T> getAsyncAndMap(URI uri, Class<T> result) {
        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
        return getAsyncAndMap(request, result);
    }

    public <T> T getAndMap(URI uri, Class<T> result) {
        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
        return getAndMap(request, result);
    }

    public <T> CompletableFuture<T> getAsyncAndMap(HttpRequest request, Class<T> result) {
        return xivapi.asScheduler().consume(1, executorService)
                     .thenApplyAsync(v -> getAndMapInternal(request, result), executorService);
    }

    public <T> T getAndMap(HttpRequest request, Class<T> result) {
        try {
            xivapi.asBlocking().consume(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return getAndMapInternal(request, result);
    }

    private <T> T getAndMapInternal(HttpRequest request, Class<T> result) {
        try {
            log.trace("Requesting {}", request.uri());
            System.out.println(request.uri().toString());
            HttpResponse<String> response = http().send(request, HttpResponse.BodyHandlers.ofString());
            log.trace("Received\n{}", response.body());
            System.out.println(response.body());
            return objectMapper().readValue(response.body(), result);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
