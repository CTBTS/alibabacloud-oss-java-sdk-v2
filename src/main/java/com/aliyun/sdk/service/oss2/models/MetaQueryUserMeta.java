package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * User-defined metadata
 */
@JsonRootName("UserMeta")
public final class MetaQueryUserMeta {  
    @JsonProperty("Key")
    private String key;
 
    @JsonProperty("Value")
    private String value;

    public MetaQueryUserMeta() {}

    private MetaQueryUserMeta(Builder builder) { 
        this.key = builder.key; 
        this.value = builder.value; 
    }

    /**
     * User-defined metadata key
     */
    public String key() {
        return this.key;
    }

    /**
     * User-defined metadata value
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
         * User-defined metadata key
         */
        public Builder key(String value) {
            requireNonNull(value);
            this.key = value;
            return this;
        }
        
        /**
         * User-defined metadata value
         */
        public Builder value(String value) {
            requireNonNull(value);
            this.value = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(MetaQueryUserMeta from) { 
            this.key = from.key; 
            this.value = from.value; 
        }

        public MetaQueryUserMeta build() {
            return new MetaQueryUserMeta(this);
        }
    }
}