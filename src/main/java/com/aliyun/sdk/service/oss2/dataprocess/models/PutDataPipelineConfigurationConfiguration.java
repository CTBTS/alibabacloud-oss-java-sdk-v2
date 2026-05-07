package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

/**
 * The container that stores the data pipeline configuration.
 */
@JsonRootName("DataPipelineConfiguration")
public final class PutDataPipelineConfigurationConfiguration {

    @JsonProperty("DataPipelineDescription")
    private String dataPipelineDescription;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Sources")
    private List<DataPipelineSource> sources;

    @JsonProperty("DataPipelineEmbeddingConfiguration")
    private DataPipelineEmbeddingConfiguration dataPipelineEmbeddingConfiguration;

    @JsonProperty("Destination")
    private DataPipelineDestination destination;

    @JsonProperty("DataPipelineError")
    private DataPipelineError dataPipelineError;

    public PutDataPipelineConfigurationConfiguration() {
    }

    private PutDataPipelineConfigurationConfiguration(Builder builder) {
        this.dataPipelineDescription = builder.dataPipelineDescription;
        this.sources = builder.sources;
        this.dataPipelineEmbeddingConfiguration = builder.dataPipelineEmbeddingConfiguration;
        this.destination = builder.destination;
        this.dataPipelineError = builder.dataPipelineError;
    }

    /**
     * Pipeline description
     */
    public String dataPipelineDescription() {
        return dataPipelineDescription;
    }

    /**
     * List of data sources
     */
    public List<DataPipelineSource> sources() {
        return sources;
    }

    /**
     * Embedding configuration
     */
    public DataPipelineEmbeddingConfiguration dataPipelineEmbeddingConfiguration() {
        return dataPipelineEmbeddingConfiguration;
    }

    /**
     * Destination configuration
     */
    public DataPipelineDestination destination() {
        return destination;
    }

    /**
     * Error configuration
     */
    public DataPipelineError dataPipelineError() {
        return dataPipelineError;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String dataPipelineDescription;
        private List<DataPipelineSource> sources;
        private DataPipelineEmbeddingConfiguration dataPipelineEmbeddingConfiguration;
        private DataPipelineDestination destination;
        private DataPipelineError dataPipelineError;

        /**
         * Pipeline description
         */
        public Builder dataPipelineDescription(String value) {
            this.dataPipelineDescription = value;
            return this;
        }

        /**
         * List of data sources
         */
        public Builder sources(List<DataPipelineSource> value) {
            this.sources = value;
            return this;
        }

        /**
         * Embedding configuration
         */
        public Builder dataPipelineEmbeddingConfiguration(DataPipelineEmbeddingConfiguration value) {
            this.dataPipelineEmbeddingConfiguration = value;
            return this;
        }

        /**
         * Destination configuration
         */
        public Builder destination(DataPipelineDestination value) {
            this.destination = value;
            return this;
        }

        /**
         * Error configuration
         */
        public Builder dataPipelineError(DataPipelineError value) {
            this.dataPipelineError = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(PutDataPipelineConfigurationConfiguration from) {
            this.dataPipelineDescription = from.dataPipelineDescription;
            this.sources = from.sources;
            this.dataPipelineEmbeddingConfiguration = from.dataPipelineEmbeddingConfiguration;
            this.destination = from.destination;
            this.dataPipelineError = from.dataPipelineError;
        }

        public PutDataPipelineConfigurationConfiguration build() {
            return new PutDataPipelineConfigurationConfiguration(this);
        }
    }
}
