package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("InsightsConfig")
public final class InsightsConfig {

    @JsonProperty("Language")
    private String language;

    public InsightsConfig() {
    }

    private InsightsConfig(Builder builder) {
        this.language = builder.language;
    }

    public String language() {
        return this.language;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String language;

        public Builder language(String value) {
            this.language = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(InsightsConfig from) {
            this.language = from.language;
        }

        public InsightsConfig build() {
            return new InsightsConfig(this);
        }
    }
}
