package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores additional feature configurations.
 */
@JsonRootName("AdditionalFeatures")
public final class ObjectProcessAdditionalFeatures {
    @JsonProperty("CustomForwardHeaders")
    private ObjectProcessCustomForwardHeaders customForwardHeaders;

    public ObjectProcessAdditionalFeatures() {}

    private ObjectProcessAdditionalFeatures(Builder builder) {
        this.customForwardHeaders = builder.customForwardHeaders; 
    }

    /**
    * The container that stores the custom forward headers list.
    */
    public ObjectProcessCustomForwardHeaders customForwardHeaders() {
        return this.customForwardHeaders;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private ObjectProcessCustomForwardHeaders customForwardHeaders;
        
        /**
        * The container that stores the custom forward headers list.
        */
        public Builder customForwardHeaders(ObjectProcessCustomForwardHeaders value) {
            requireNonNull(value);
            this.customForwardHeaders = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(ObjectProcessAdditionalFeatures from) {
            this.customForwardHeaders = from.customForwardHeaders; 
        }

        public ObjectProcessAdditionalFeatures build() {
            return new ObjectProcessAdditionalFeatures(this);
        }
    }
}
