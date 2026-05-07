package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores lifecycle configurations. The container can contain up to 1,000 lifecycle rules.
 */
@JsonRootName("LifecycleConfiguration")
public final class LifecycleConfiguration {  
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Rule")
    private List<LifecycleRule> rules;

    public LifecycleConfiguration() {}

    private LifecycleConfiguration(Builder builder) { 
        this.rules = builder.rules; 
    }

    /**
    * The container that stores the lifecycle rules. The period of time after which objects expire must be longer than the period of time after which the storage class of the same objects is converted to Infrequent Access (IA) or Archive.
    */
    public List<LifecycleRule> rules() {
        return this.rules;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<LifecycleRule> rules;
        
        /**
        * The container that stores the lifecycle rules. The period of time after which objects expire must be longer than the period of time after which the storage class of the same objects is converted to Infrequent Access (IA) or Archive.
        */
        public Builder rules(List<LifecycleRule> value) {
            requireNonNull(value);
            this.rules = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(LifecycleConfiguration from) { 
            this.rules = from.rules; 
        }

        public LifecycleConfiguration build() {
            return new LifecycleConfiguration(this);
        }
    }
}
