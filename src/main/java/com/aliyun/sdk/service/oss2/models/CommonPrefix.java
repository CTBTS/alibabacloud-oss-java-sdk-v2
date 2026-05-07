package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * If the delimiter parameter is specified in the request, the response contains CommonPrefixes. Objects whose names contain the same string from the prefix to the next occurrence of the delimiter are grouped as a single result element in CommonPrefixes.
 */
@JsonRootName("CommonPrefix")
public final class CommonPrefix {
    @JsonProperty("Prefix")
    private String prefix;

    public CommonPrefix() {
    }

    private CommonPrefix(Builder builder) {
        this.prefix = builder.prefix;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * The prefix contained in the names of returned objects.
     */
    public String prefix() {
        return this.prefix;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String prefix;

        private Builder() {
            super();
        }


        private Builder(CommonPrefix from) {
            this.prefix = from.prefix;
        }

        /**
         * The prefix contained in the names of returned objects.
         */
        public Builder prefix(String value) {
            requireNonNull(value);
            this.prefix = value;
            return this;
        }

        public CommonPrefix build() {
            return new CommonPrefix(this);
        }
    }
}
