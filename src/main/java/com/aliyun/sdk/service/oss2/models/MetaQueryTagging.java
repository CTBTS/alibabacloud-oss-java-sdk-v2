package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * Object tagging
 */
@JsonRootName("Tagging")
public final class MetaQueryTagging {  
    @JsonProperty("Key")
    private String key;
 
    @JsonProperty("Value")
    private String value;

    public MetaQueryTagging() {}

    private MetaQueryTagging(Builder builder) { 
        this.key = builder.key; 
        this.value = builder.value; 
    }

    /**
     * Object tag key
     */
    public String key() {
        return this.key;
    }

    /**
     * Object tag value
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
         * Object tag key
         */
        public Builder key(String value) {
            requireNonNull(value);
            this.key = value;
            return this;
        }
        
        /**
         * Object tag value
         */
        public Builder value(String value) {
            requireNonNull(value);
            this.value = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(MetaQueryTagging from) { 
            this.key = from.key; 
            this.value = from.value; 
        }

        public MetaQueryTagging build() {
            return new MetaQueryTagging(this);
        }
    }
}