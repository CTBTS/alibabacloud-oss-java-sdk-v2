package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("DatasetConfig")
public final class DatasetConfig {

    @JsonProperty("Insights")
    private InsightsConfig insights;

    public DatasetConfig() {
    }

    private DatasetConfig(Builder builder) {
        this.insights = builder.insights;
    }

    public InsightsConfig insights() {
        return this.insights;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private InsightsConfig insights;

        public Builder insights(InsightsConfig value) {
            this.insights = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(DatasetConfig from) {
            this.insights = from.insights;
        }

        public DatasetConfig build() {
            return new DatasetConfig(this);
        }
    }
}
