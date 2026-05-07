package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * Container for Object information.
 */
@JsonRootName("Files")
public final class MetaQueryFiles {  
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("File")
    private List<MetaQueryFile> file;

    public MetaQueryFiles() {}

    private MetaQueryFiles(Builder builder) { 
        this.file = builder.file; 
    }

    /**
    * Container for Object information.
    */
    public List<MetaQueryFile> file() {
        return this.file;
    }

    /**
    * Alias for file() method.
    */
    public List<MetaQueryFile> fileList() {
        return this.file;
    }


    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<MetaQueryFile> file;
        
        /**
        * Container for individual Object information.
        * Contains a list of files that meet the query criteria.
        */
        public Builder file(List<MetaQueryFile> value) {
            requireNonNull(value);
            this.file = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(MetaQueryFiles from) { 
            this.file = from.file; 
        }

        public MetaQueryFiles build() {
            return new MetaQueryFiles(this);
        }
    }
}