package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * Multimedia metadata search criteria. Only used for vector retrieval.
 */
@JsonRootName("MediaTypes")
public final class MetaQueryMediaTypes {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("MediaType")
    private List<String> mediaTypes;

    public MetaQueryMediaTypes() {}

    private MetaQueryMediaTypes(Builder builder) {
        this.mediaTypes = builder.mediaTypes;
    }

    /**
     * Gets the list of media types to select for search.
     */
    public List<String> mediaTypes() {
        return this.mediaTypes;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private List<String> mediaTypes;

        /**
         * Sets the list of media types to select for search.
         */
        public Builder mediaTypes(List<String> value) {
            requireNonNull(value);
            this.mediaTypes = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(MetaQueryMediaTypes from) {
            this.mediaTypes = from.mediaTypes;
        }

        public MetaQueryMediaTypes build() {
            return new MetaQueryMediaTypes(this);
        }
    }
}