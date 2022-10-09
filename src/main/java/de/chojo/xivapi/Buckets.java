package de.chojo.xivapi;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;

import java.time.Duration;

public final class Buckets {
    private Buckets() {
        throw new UnsupportedOperationException("This is a utility class.");
    }

    public static Bucket newLodestoneBucket() {
        return Bucket.builder().addLimit(Bandwidth.simple(1, Duration.ofSeconds(1))).build();
    }

    public static Bucket newXIVapiBucket() {
        return Bucket.builder().addLimit(Bandwidth.simple(20, Duration.ofSeconds(1))).build();
    }
}
