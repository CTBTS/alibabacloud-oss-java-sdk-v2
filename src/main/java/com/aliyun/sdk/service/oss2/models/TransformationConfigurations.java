package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the transformation configurations.
 */
@JsonRootName("TransformationConfigurations")
public final class TransformationConfigurations {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("TransformationConfiguration")
    private List<TransformationConfiguration> transformationConfiguration;

    public TransformationConfigurations() {}

    private TransformationConfigurations(Builder builder) {
        this.transformationConfiguration = builder.transformationConfiguration;
    }

    /**
    * The container that stores the transformation configurations.
    */
    public List<TransformationConfiguration> transformationConfiguration() {
        return this.transformationConfiguration;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<TransformationConfiguration> transformationConfiguration;
        
        /**
        * The container that stores the transformation configurations.
        */
        public Builder transformationConfiguration(List<TransformationConfiguration> value) {
            requireNonNull(value);
            this.transformationConfiguration = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(TransformationConfigurations from) {
            this.transformationConfiguration = from.transformationConfiguration;
        }

        public TransformationConfigurations build() {
            return new TransformationConfigurations(this);
        }
    }
}
