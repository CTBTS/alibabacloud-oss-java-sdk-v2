package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * Container for the group aggregation results list
 */
@JsonRootName("Groups")
public final class MetaQueryGroups {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Group")
    private List<MetaQueryGroup> group;

    public MetaQueryGroups() {}

    private MetaQueryGroups(Builder builder) {
        this.group = builder.group;
    }

    /**
     * Group aggregation results list
     */
    public List<MetaQueryGroup> group() {
        return group;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private List<MetaQueryGroup> group;

        /**
         * Sets the group aggregation results list
         *
         * @param value the group
         * @return the builder instance
         */
        public Builder group(List<MetaQueryGroup> value) {
            requireNonNull(value);
            this.group = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(MetaQueryGroups from) {
            this.group = from.group;
        }

        public MetaQueryGroups build() {
            return new MetaQueryGroups(this);
        }
    }
}