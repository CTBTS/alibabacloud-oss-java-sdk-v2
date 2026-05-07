package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

/**
 * Data pipeline configuration.
 */
@JsonRootName("DataPipelineConfiguration")
public final class DataPipelineConfiguration {
    @JsonProperty("DataPipelineName")
    private String dataPipelineName;

    @JsonProperty("DataPipelineDescription")
    private String dataPipelineDescription;

    @JsonProperty("DataPipelineRole")
    private String dataPipelineRole;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("DataPipelineEmbeddingConfiguration")
    private DataPipelineEmbeddingConfiguration dataPipelineEmbeddingConfiguration;

    @JsonProperty("Destination")
    private DataPipelineDestination destination;

    @JsonProperty("DataPipelineError")
    private DataPipelineError dataPipelineError;

    @JsonProperty("CreateTime")
    private String createTime;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Sources")
    private List<DataPipelineSource> sources;

    public DataPipelineConfiguration() {
    }

    private DataPipelineConfiguration(Builder builder) {
        this.dataPipelineName = builder.dataPipelineName;
        this.dataPipelineDescription = builder.dataPipelineDescription;
        this.dataPipelineRole = builder.dataPipelineRole;
        this.status = builder.status;
        this.dataPipelineEmbeddingConfiguration = builder.dataPipelineEmbeddingConfiguration;
        this.destination = builder.destination;
        this.dataPipelineError = builder.dataPipelineError;
        this.createTime = builder.createTime;
        this.sources = builder.sources;
    }

    public String dataPipelineName() {
        return dataPipelineName;
    }

    public String dataPipelineDescription() {
        return dataPipelineDescription;
    }

    public String dataPipelineRole() {
        return dataPipelineRole;
    }

    public String status() {
        return status;
    }

    public DataPipelineEmbeddingConfiguration dataPipelineEmbeddingConfiguration() {
        return dataPipelineEmbeddingConfiguration;
    }

    public DataPipelineDestination destination() {
        return destination;
    }

    public DataPipelineError dataPipelineError() {
        return dataPipelineError;
    }

    public String createTime() {
        return createTime;
    }

    public List<DataPipelineSource> sources() {
        return sources;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String dataPipelineName;
        private String dataPipelineDescription;
        private String dataPipelineRole;
        private String status;
        private DataPipelineEmbeddingConfiguration dataPipelineEmbeddingConfiguration;
        private DataPipelineDestination destination;
        private DataPipelineError dataPipelineError;
        private String createTime;
        private List<DataPipelineSource> sources;

        public Builder dataPipelineName(String value) {
            this.dataPipelineName = value;
            return this;
        }

        public Builder dataPipelineDescription(String value) {
            this.dataPipelineDescription = value;
            return this;
        }

        public Builder dataPipelineRole(String value) {
            this.dataPipelineRole = value;
            return this;
        }

        public Builder status(String value) {
            this.status = value;
            return this;
        }

        public Builder dataPipelineEmbeddingConfiguration(DataPipelineEmbeddingConfiguration value) {
            this.dataPipelineEmbeddingConfiguration = value;
            return this;
        }

        public Builder destination(DataPipelineDestination value) {
            this.destination = value;
            return this;
        }

        public Builder dataPipelineError(DataPipelineError value) {
            this.dataPipelineError = value;
            return this;
        }

        public Builder createTime(String value) {
            this.createTime = value;
            return this;
        }

        public Builder sources(List<DataPipelineSource> value) {
            this.sources = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(DataPipelineConfiguration from) {
            this.dataPipelineName = from.dataPipelineName;
            this.dataPipelineDescription = from.dataPipelineDescription;
            this.dataPipelineRole = from.dataPipelineRole;
            this.status = from.status;
            this.dataPipelineEmbeddingConfiguration = from.dataPipelineEmbeddingConfiguration;
            this.destination = from.destination;
            this.dataPipelineError = from.dataPipelineError;
            this.createTime = from.createTime;
            this.sources = from.sources;
        }

        public DataPipelineConfiguration build() {
            return new DataPipelineConfiguration(this);
        }
    }
}
