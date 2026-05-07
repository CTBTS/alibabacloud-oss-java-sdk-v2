package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container for tags.
 */
@JsonRootName("TagSet")
public final class TagSet {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Tag")
    private List<Tag> tags;

    public TagSet() {
    }

    private TagSet(Builder builder) {
        this.tags = builder.tags;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * The tags.
     */
    public List<Tag> tags() {
        return this.tags;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private List<Tag> tags;

        private Builder() {
            super();
        }


        private Builder(TagSet from) {
            this.tags = from.tags;
        }

        /**
         * The tags.
         */
        public Builder tags(List<Tag> value) {
            requireNonNull(value);
            this.tags = value;
            return this;
        }

        public TagSet build() {
            return new TagSet(this);
        }
    }
}
