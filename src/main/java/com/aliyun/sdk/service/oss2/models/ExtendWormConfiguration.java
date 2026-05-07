package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the root node.
 */
@JsonRootName("ExtendWormConfiguration")
public final class ExtendWormConfiguration {  
    @JsonProperty("RetentionPeriodInDays")
    private Integer retentionPeriodInDays;

    public ExtendWormConfiguration() {}

    private ExtendWormConfiguration(Builder builder) { 
        this.retentionPeriodInDays = builder.retentionPeriodInDays; 
    }

    /**
    * The number of days for which objects can be retained.
    */
    public Integer retentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private Integer retentionPeriodInDays;
        
        /**
        * The number of days for which objects can be retained.
        */
        public Builder retentionPeriodInDays(Integer value) {
            requireNonNull(value);
            this.retentionPeriodInDays = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(ExtendWormConfiguration from) { 
            this.retentionPeriodInDays = from.retentionPeriodInDays; 
        }

        public ExtendWormConfiguration build() {
            return new ExtendWormConfiguration(this);
        }
    }
}
