package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the configurations of custom URL parameters.
 */
@JsonRootName("ParamSet")
public final class LoggingParamSet {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("parameter")
    private List<String> parameters;

    public LoggingParamSet() {}

    private LoggingParamSet(Builder builder) {
        this.parameters = builder.parameters; 
    }

    /**
    * The list of the custom URL parameters.
    */
    public List<String> parameters() {
        return this.parameters;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<String> parameters;
        
        /**
        * The list of the custom URL parameters.
        */
        public Builder parameters(List<String> value) {
            requireNonNull(value);
            this.parameters = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(LoggingParamSet from) {
            this.parameters = from.parameters; 
        }

        public LoggingParamSet build() {
            return new LoggingParamSet(this);
        }
    }
}
