package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores allowed features.
 */
@JsonRootName("AllowedFeatures")
public final class ObjectProcessAllowedFeatures {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("AllowedFeature")
    private List<String> allowedFeature;

    public ObjectProcessAllowedFeatures() {}

    private ObjectProcessAllowedFeatures(Builder builder) {
        this.allowedFeature = builder.allowedFeature;
    }

    /**
    * Specifies that Function Compute supports Range GetObject requests.
    */
    public List<String> allowedFeature() {
        return this.allowedFeature;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<String> allowedFeature;
        
        /**
        * Specifies that Function Compute supports Range GetObject requests.
        */
        public Builder allowedFeature(List<String> value) {
            requireNonNull(value);
            this.allowedFeature = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(ObjectProcessAllowedFeatures from) {
            this.allowedFeature = from.allowedFeature;
        }

        public ObjectProcessAllowedFeatures build() {
            return new ObjectProcessAllowedFeatures(this);
        }
    }
}
