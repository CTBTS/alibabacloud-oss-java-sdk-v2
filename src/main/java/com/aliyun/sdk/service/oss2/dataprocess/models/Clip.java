package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonRootName("Clip")
public final class Clip {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("TimeRange")
    private List<Long> timeRange;

    public Clip() {
    }

    private Clip(Builder builder) {
        this.timeRange = builder.timeRange;
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
        private List<Long> timeRange;

        public Builder timeRange(List<Long> value) {
            this.timeRange = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(Clip from) {
            this.timeRange = from.timeRange;
        }

        public Clip build() {
            return new Clip(this);
        }
    }
}
