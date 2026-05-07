package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The list of object tags.
 */
@JsonRootName("OSSTagging")
public final class MetaQueryOSSTagging {  
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Tagging")
    private List<MetaQueryTagging> tagging;

    public MetaQueryOSSTagging() {}

    private MetaQueryOSSTagging(Builder builder) { 
        this.tagging = builder.tagging; 
    }

    /**
    * The tags.
    */
    public List<MetaQueryTagging> tagging() {
        return this.tagging;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<MetaQueryTagging> tagging;
        
        /**
        * The tags.
        */
        public Builder tagging(List<MetaQueryTagging> value) {
            requireNonNull(value);
            this.tagging = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(MetaQueryOSSTagging from) { 
            this.tagging = from.tagging; 
        }

        public MetaQueryOSSTagging build() {
            return new MetaQueryOSSTagging(this);
        }
    }
}