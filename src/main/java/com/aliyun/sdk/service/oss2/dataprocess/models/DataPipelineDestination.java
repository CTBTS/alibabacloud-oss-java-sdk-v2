package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

/**
 * Destination configuration for data pipeline.
 */
@JsonRootName("Destination")
public final class DataPipelineDestination {
    @JsonProperty("VectorBucketName")
    private String vectorBucketName;

    @JsonProperty("VectorKeyPrefix")
    private String vectorKeyPrefix;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("VectorIndexNames")
    private List<String> vectorIndexNames;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("ObjectTagToMetadata")
    private List<String> objectTagToMetadata;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("UsermetaToMetadata")
    private List<String> usermetaToMetadata;

    public DataPipelineDestination() {
    }

    private DataPipelineDestination(Builder builder) {
        this.vectorBucketName = builder.vectorBucketName;
        this.vectorKeyPrefix = builder.vectorKeyPrefix;
        this.vectorIndexNames = builder.vectorIndexNames;
        this.objectTagToMetadata = builder.objectTagToMetadata;
        this.usermetaToMetadata = builder.usermetaToMetadata;
    }

    public String vectorBucketName() {
        return vectorBucketName;
    }

    public String vectorKeyPrefix() {
        return vectorKeyPrefix;
    }

    public List<String> vectorIndexNames() {
        return vectorIndexNames;
    }

    public List<String> objectTagToMetadata() {
        return objectTagToMetadata;
    }

    public List<String> usermetaToMetadata() {
        return usermetaToMetadata;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String vectorBucketName;
        private String vectorKeyPrefix;
        private List<String> vectorIndexNames;
        private List<String> objectTagToMetadata;
        private List<String> usermetaToMetadata;

        public Builder vectorBucketName(String value) {
            this.vectorBucketName = value;
            return this;
        }

        public Builder vectorKeyPrefix(String value) {
            this.vectorKeyPrefix = value;
            return this;
        }

        public Builder vectorIndexNames(List<String> value) {
            this.vectorIndexNames = value;
            return this;
        }

        public Builder objectTagToMetadata(List<String> value) {
            this.objectTagToMetadata = value;
            return this;
        }

        public Builder usermetaToMetadata(List<String> value) {
            this.usermetaToMetadata = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(DataPipelineDestination from) {
            this.vectorBucketName = from.vectorBucketName;
            this.vectorKeyPrefix = from.vectorKeyPrefix;
            this.vectorIndexNames = from.vectorIndexNames;
            this.objectTagToMetadata = from.objectTagToMetadata;
            this.usermetaToMetadata = from.usermetaToMetadata;
        }

        public DataPipelineDestination build() {
            return new DataPipelineDestination(this);
        }
    }
}
