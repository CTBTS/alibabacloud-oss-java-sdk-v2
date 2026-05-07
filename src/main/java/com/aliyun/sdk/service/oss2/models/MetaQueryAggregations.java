package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * Aggregations information in the vector retrieval results of data indexing
 */
@JsonRootName("Aggregations")
public final class MetaQueryAggregations {  
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Aggregation")
    private List<MetaQueryAggregation> aggregation;

    public MetaQueryAggregations() {}

    private MetaQueryAggregations(Builder builder) { 
        this.aggregation = builder.aggregation; 
    }

    /**
     * Aggregation information in the vector retrieval results of data indexing
     */
    public List<MetaQueryAggregation> aggregation() {
        return this.aggregation;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<MetaQueryAggregation> aggregation;
        
        /**
         * Aggregation information in the vector retrieval results of data indexing
         */
        public Builder aggregation(List<MetaQueryAggregation> value) {
            requireNonNull(value);
            this.aggregation = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(MetaQueryAggregations from) { 
            this.aggregation = from.aggregation; 
        }

        public MetaQueryAggregations build() {
            return new MetaQueryAggregations(this);
        }
    }
}