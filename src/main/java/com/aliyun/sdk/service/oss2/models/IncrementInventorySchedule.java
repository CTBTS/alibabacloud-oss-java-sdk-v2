package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * Container for incremental inventory export cycle information
 */
@JsonRootName("IncrementInventorySchedule")
public final class IncrementInventorySchedule {  
    @JsonProperty("Frequency")
    private Long frequency;

    public IncrementInventorySchedule() {}

    private IncrementInventorySchedule(Builder builder) { 
        this.frequency = builder.frequency; 
    }

    /**
    * Describes the frequency at which incremental inventory files are exported, in seconds, currently fixed at 10 minutes.
    */
    public Long frequency() {
        return this.frequency;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private Long frequency;
        
        /**
        * Describes the frequency at which incremental inventory files are exported, in seconds, currently fixed at 10 minutes.
        */
        public Builder frequency(Long value) {
            requireNonNull(value);
            this.frequency = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(IncrementInventorySchedule from) { 
            this.frequency = from.frequency; 
        }

        public IncrementInventorySchedule build() {
            return new IncrementInventorySchedule(this);
        }
    }
}