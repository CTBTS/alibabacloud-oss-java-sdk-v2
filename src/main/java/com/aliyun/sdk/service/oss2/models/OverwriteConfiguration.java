package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The structure for the overwrite protection configuration.
 */
@JsonRootName("OverwriteConfiguration")
public final class OverwriteConfiguration {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Rule")
    private List<OverwriteRule> rules;

    public OverwriteConfiguration() {
    }

    private OverwriteConfiguration(Builder builder) {
        this.rules = builder.rules;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * List of overwrite protection rules. A bucket can have a maximum of 100 rules.
     */
    public List<OverwriteRule> rules() {
        return this.rules;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private List<OverwriteRule> rules;

        private Builder() {
            super();
        }


        private Builder(OverwriteConfiguration from) {
            this.rules = from.rules;
        }

        /**
         * List of overwrite protection rules. A bucket can have a maximum of 100 rules.
         */
        public Builder rules(List<OverwriteRule> value) {
            requireNonNull(value);
            this.rules = value;
            return this;
        }

        public OverwriteConfiguration build() {
            return new OverwriteConfiguration(this);
        }
    }
}
