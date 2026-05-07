package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the information about access log collection.
 */
@JsonRootName("LoggingEnabled")
public final class LoggingEnabled {  
    @JsonProperty("TargetBucket")
    private String targetBucket;
 
    @JsonProperty("TargetPrefix")
    private String targetPrefix;

    
    @JsonProperty("LoggingRole")
    private String loggingRole;
    
    public LoggingEnabled() {}

    private LoggingEnabled(Builder builder) { 
        this.targetBucket = builder.targetBucket; 
        this.targetPrefix = builder.targetPrefix; 
        this.loggingRole = builder.loggingRole;
    }

    /**
    * The bucket that stores access logs.
    */
    public String targetBucket() {
        return this.targetBucket;
    }

    /**
    * The prefix of the log objects. This parameter can be left empty.
    */
    public String targetPrefix() {
        return this.targetPrefix;
    }


    /**
    * The logging role.
    */
    public String loggingRole() {
        return this.loggingRole;
    }
    
    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private String targetBucket;
        private String targetPrefix;
        private String loggingRole;

        /**
        * The bucket that stores access logs.
        */
        public Builder targetBucket(String value) {
            requireNonNull(value);
            this.targetBucket = value;
            return this;
        }
        
        /**
        * The prefix of the log objects. This parameter can be left empty.
        */
        public Builder targetPrefix(String value) {
            requireNonNull(value);
            this.targetPrefix = value;
            return this;
        }

        /**
        * The logging role.
        */
        public Builder loggingRole(String value) {
            requireNonNull(value);
            this.loggingRole = value;
            return this;
        }
        
        private Builder() {
            super();
        }

        private Builder(LoggingEnabled from) { 
            this.targetBucket = from.targetBucket; 
            this.targetPrefix = from.targetPrefix; 
            this.loggingRole = from.loggingRole;
        }

        public LoggingEnabled build() {
            return new LoggingEnabled(this);
        }
    }
}