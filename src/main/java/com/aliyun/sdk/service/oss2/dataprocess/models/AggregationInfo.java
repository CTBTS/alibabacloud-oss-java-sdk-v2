package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonRootName("AggregationInfo")
public final class AggregationInfo {

    @JsonProperty("Field")
    private String field;

    @JsonProperty("Operation")
    private String operation;

    @JsonProperty("Value")
    private Double value;

    @JacksonXmlElementWrapper(localName = "Groups")
    @JsonProperty("AggregationGroup")
    private List<AggregationGroup> groups;

    public AggregationInfo() {}

    private AggregationInfo(Builder builder) {
        this.field = builder.field;
        this.operation = builder.operation;
        this.value = builder.value;
        this.groups = builder.groups;
    }

    public String field() { return this.field; }
    public String operation() { return this.operation; }
    public Double value() { return this.value; }
    public List<AggregationGroup> groups() { return this.groups; }

    public static Builder newBuilder() { return new Builder(); }
    public Builder toBuilder() { return new Builder(this); }

    public static class Builder {
        private String field;
        private String operation;
        private Double value;
        private List<AggregationGroup> groups;

        public Builder field(String value) { this.field = value; return this; }
        public Builder operation(String value) { this.operation = value; return this; }
        public Builder value(Double value) { this.value = value; return this; }
        public Builder groups(List<AggregationGroup> value) { this.groups = value; return this; }

        private Builder() { super(); }

        private Builder(AggregationInfo from) {
            this.field = from.field;
            this.operation = from.operation;
            this.value = from.value;
            this.groups = from.groups;
        }

        public AggregationInfo build() { return new AggregationInfo(this); }
    }
}
