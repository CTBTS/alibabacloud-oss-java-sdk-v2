package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The headers that are sent to the origin. The specified headers are configured in the data returned by the origin regardless of whether the headers are contained in the request. This parameter takes effect only when the value of RedirectType is Mirror. You can specify up to 10 headers.
 */
@JsonRootName("Set")
public final class MirrorHeadersSet {
    @JsonProperty("Key")
    private String key;

    @JsonProperty("Value")
    private String value;

    public MirrorHeadersSet() {}

    private MirrorHeadersSet(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    /**
     * The header key.
     */
    public String key() {
        return this.key;
    }

    /**
     * The header value.
     */
    public String value() {
        return this.value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String key;
        private String value;

        /**
         * The header key.
         */
        public Builder key(String value) {
            requireNonNull(value);
            this.key = value;
            return this;
        }

        /**
         * The header value.
         */
        public Builder value(String value) {
            requireNonNull(value);
            this.value = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(MirrorHeadersSet from) {
            this.key = from.key;
            this.value = from.value;
        }

        public MirrorHeadersSet build() {
            return new MirrorHeadersSet(this);
        }
    }
}