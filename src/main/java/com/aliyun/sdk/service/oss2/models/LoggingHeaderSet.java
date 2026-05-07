package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the configurations of custom request headers.
 */
@JsonRootName("HeaderSet")
public final class LoggingHeaderSet {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("header")
    private List<String> headers;

    public LoggingHeaderSet() {}

    private LoggingHeaderSet(Builder builder) {
        this.headers = builder.headers; 
    }

    /**
    * The list of the custom request headers.
    */
    public List<String> headers() {
        return this.headers;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<String> headers;
        
        /**
        * The list of the custom request headers.
        */
        public Builder headers(List<String> value) {
            requireNonNull(value);
            this.headers = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(LoggingHeaderSet from) {
            this.headers = from.headers; 
        }

        public LoggingHeaderSet build() {
            return new LoggingHeaderSet(this);
        }
    }
}
