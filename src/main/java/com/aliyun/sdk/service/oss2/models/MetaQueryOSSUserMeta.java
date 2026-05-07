package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores user metadata.
 */
@JsonRootName("OSSUserMeta")
public final class MetaQueryOSSUserMeta {  
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("UserMeta")
    private List<MetaQueryUserMeta> userMeta;

    public MetaQueryOSSUserMeta() {}

    private MetaQueryOSSUserMeta(Builder builder) { 
        this.userMeta = builder.userMeta; 
    }

    /**
    * The user metadata items.
    */
    public List<MetaQueryUserMeta> userMeta() {
        return this.userMeta;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<MetaQueryUserMeta> userMeta;
        
        /**
        * The user metadata items.
        */
        public Builder userMeta(List<MetaQueryUserMeta> value) {
            requireNonNull(value);
            this.userMeta = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(MetaQueryOSSUserMeta from) { 
            this.userMeta = from.userMeta; 
        }

        public MetaQueryOSSUserMeta build() {
            return new MetaQueryOSSUserMeta(this);
        }
    }
}