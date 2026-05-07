package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.time.Instant;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the copy result.
 */
@JsonRootName("CopyPartResult")
public final class CopyPartResult {
    @JsonProperty("LastModified")
    private Instant lastModified;

    @JsonProperty("ETag")
    private String eTag;

    public CopyPartResult() {
    }

    private CopyPartResult(Builder builder) {
        this.lastModified = builder.lastModified;
        this.eTag = builder.eTag;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * The last modified time of copy source.
     */
    public Instant lastModified() {
        return this.lastModified;
    }

    /**
     * The ETag of the copied part.
     */
    public String eTag() {
        return this.eTag;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private Instant lastModified;
        private String eTag;

        private Builder() {
            super();
        }

        private Builder(CopyPartResult from) {
            this.lastModified = from.lastModified;
            this.eTag = from.eTag;
        }

        /**
         * The last modified time of copy source.
         */
        public Builder lastModified(Instant value) {
            requireNonNull(value);
            this.lastModified = value;
            return this;
        }

        /**
         * The ETag of the copied part.
         */
        public Builder eTag(String value) {
            requireNonNull(value);
            this.eTag = value;
            return this;
        }

        public CopyPartResult build() {
            return new CopyPartResult(this);
        }
    }
}
