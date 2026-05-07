package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * Indicates the container used to store access logging configuration of a bucket.
 */
@JsonRootName("BucketLoggingStatus")
public final class BucketLoggingStatus {  
    @JsonProperty("LoggingEnabled")
    private LoggingEnabled loggingEnabled;

    public BucketLoggingStatus() {}

    private BucketLoggingStatus(Builder builder) { 
        this.loggingEnabled = builder.loggingEnabled; 
    }

    /**
    * Indicates the container used to store access logging information. This element is returned if it is enabled and is not returned if it is disabled.
    */
    public LoggingEnabled loggingEnabled() {
        return this.loggingEnabled;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private LoggingEnabled loggingEnabled;
        
        /**
        * Indicates the container used to store access logging information. This element is returned if it is enabled and is not returned if it is disabled.
        */
        public Builder loggingEnabled(LoggingEnabled value) {
            requireNonNull(value);
            this.loggingEnabled = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(BucketLoggingStatus from) { 
            this.loggingEnabled = from.loggingEnabled; 
        }

        public BucketLoggingStatus build() {
            return new BucketLoggingStatus(this);
        }
    }
}
