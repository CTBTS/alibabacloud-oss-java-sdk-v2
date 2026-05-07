package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * Contains the frequency that inventory lists are exported
 */
@JsonRootName("InventorySchedule")
public final class InventorySchedule {  
    @JsonProperty("Frequency")
    private String frequency;

    public InventorySchedule() {}

    private InventorySchedule(Builder builder) { 
        this.frequency = builder.frequency; 
    }

    /**
    * The frequency at which the inventory list is exported. Valid values:- Daily: The inventory list is exported on a daily basis. - Weekly: The inventory list is exported on a weekly basis. 
    */
    public String frequency() {
        return this.frequency;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private String frequency;
        
        /**
        * The frequency at which the inventory list is exported. Valid values:- Daily: The inventory list is exported on a daily basis. - Weekly: The inventory list is exported on a weekly basis. 
        */
        public Builder frequency(String value) {
            requireNonNull(value);
            this.frequency = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(InventorySchedule from) { 
            this.frequency = from.frequency; 
        }

        public InventorySchedule build() {
            return new InventorySchedule(this);
        }
    }
}
