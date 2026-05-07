package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * Configuration container for incremental inventory
 */
@JsonRootName("IncrementalInventory")
public final class IncrementalInventory {  
    @JsonProperty("IsEnabled")
    private Boolean isEnabled;
 
    @JsonProperty("Schedule")
    private IncrementInventorySchedule schedule;
 
    @JsonProperty("OptionalFields")
    private OptionalFields optionalFields;

    public IncrementalInventory() {}

    private IncrementalInventory(Builder builder) { 
        this.isEnabled = builder.isEnabled; 
        this.schedule = builder.schedule; 
        this.optionalFields = builder.optionalFields; 
    }

    /**
    * Specifies whether incremental inventory is enabled
    */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
    * Container for incremental inventory export cycle
    */
    public IncrementInventorySchedule schedule() {
        return this.schedule;
    }

    /**
    * Configuration container for incremental inventory file attributes
    */
    public OptionalFields optionalFields() {
        return this.optionalFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private Boolean isEnabled;
        private IncrementInventorySchedule schedule;
        private OptionalFields optionalFields;
        
        /**
        * Specifies whether incremental inventory is enabled
        */
        public Builder isEnabled(Boolean value) {
            requireNonNull(value);
            this.isEnabled = value;
            return this;
        }
        
        /**
        * Container for incremental inventory export cycle
        */
        public Builder schedule(IncrementInventorySchedule value) {
            requireNonNull(value);
            this.schedule = value;
            return this;
        }
        
        /**
        * Configuration container for incremental inventory file attributes
        */
        public Builder optionalFields(OptionalFields value) {
            requireNonNull(value);
            this.optionalFields = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(IncrementalInventory from) { 
            this.isEnabled = from.isEnabled; 
            this.schedule = from.schedule; 
            this.optionalFields = from.optionalFields; 
        }

        public IncrementalInventory build() {
            return new IncrementalInventory(this);
        }
    }
}