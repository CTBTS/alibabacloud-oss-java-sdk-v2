package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores information about exported inventory lists.
 */
@JsonRootName("InventoryDestination")
public final class InventoryDestination {  
    @JsonProperty("OSSBucketDestination")
    private InventoryOSSBucketDestination oSSBucketDestination;

    public InventoryDestination() {}

    private InventoryDestination(Builder builder) { 
        this.oSSBucketDestination = builder.oSSBucketDestination; 
    }

    /**
    * The container that stores information about the bucket in which exported inventory lists are stored.
    */
    public InventoryOSSBucketDestination oSSBucketDestination() {
        return this.oSSBucketDestination;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private InventoryOSSBucketDestination oSSBucketDestination;
        
        /**
        * The container that stores information about the bucket in which exported inventory lists are stored.
        */
        public Builder oSSBucketDestination(InventoryOSSBucketDestination value) {
            requireNonNull(value);
            this.oSSBucketDestination = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(InventoryDestination from) { 
            this.oSSBucketDestination = from.oSSBucketDestination; 
        }

        public InventoryDestination build() {
            return new InventoryDestination(this);
        }
    }
}
