package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonRootName("ElementContent")
public final class ElementContent {

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Content")
    private String content;

    @JsonProperty("URL")
    private String url;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("TimeRange")
    private List<Long> timeRange;

    public ElementContent() {
    }

    private ElementContent(Builder builder) {
        this.type = builder.type;
        this.content = builder.content;
        this.url = builder.url;
        this.timeRange = builder.timeRange;
    }

    public String type() {
        return this.type;
    }

    public String content() {
        return this.content;
    }

    public String url() {
        return this.url;
    }

    public List<Long> timeRange() {
        return this.timeRange;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String type;
        private String content;
        private String url;
        private List<Long> timeRange;

        public Builder type(String value) {
            this.type = value;
            return this;
        }

        public Builder content(String value) {
            this.content = value;
            return this;
        }

        public Builder url(String value) {
            this.url = value;
            return this;
        }

        public Builder timeRange(List<Long> value) {
            this.timeRange = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(ElementContent from) {
            this.type = from.type;
            this.content = from.content;
            this.url = from.url;
            this.timeRange = from.timeRange;
        }

        public ElementContent build() {
            return new ElementContent(this);
        }
    }
}
