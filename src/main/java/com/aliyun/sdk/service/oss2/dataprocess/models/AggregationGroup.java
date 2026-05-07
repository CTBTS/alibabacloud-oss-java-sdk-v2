package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("AggregationGroup")
public final class AggregationGroup {

    @JsonProperty("Value")
    private String value;

    @JsonProperty("Count")
    private Long count;

    public AggregationGroup() {}

    private AggregationGroup(Builder builder) {
        this.value = builder.value;
        this.count = builder.count;
    }

    public String value() { return this.value; }
    public Long count() { return this.count; }

    public static Builder newBuilder() { return new Builder(); }
    public Builder toBuilder() { return new Builder(this); }

    public static class Builder {
        private String value;
        private Long count;

        public Builder value(String value) { this.value = value; return this; }
        public Builder count(Long value) { this.count = value; return this; }

        private Builder() { super(); }

        private Builder(AggregationGroup from) {
            this.value = from.value;
            this.count = from.count;
        }

        public AggregationGroup build() { return new AggregationGroup(this); }
    }
}
