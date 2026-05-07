package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("CroppingSuggestion")
public final class CroppingSuggestion {

    @JsonProperty("AspectRatio")
    private String aspectRatio;

    @JsonProperty("Confidence")
    private Float confidence;

    @JsonProperty("Boundary")
    private Boundary boundary;

    public CroppingSuggestion() {
    }

    private CroppingSuggestion(Builder builder) {
        this.aspectRatio = builder.aspectRatio;
        this.confidence = builder.confidence;
        this.boundary = builder.boundary;
    }

    public String aspectRatio() {
        return this.aspectRatio;
    }

    public Float confidence() {
        return this.confidence;
    }

    public Boundary boundary() {
        return this.boundary;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String aspectRatio;
        private Float confidence;
        private Boundary boundary;

        public Builder aspectRatio(String value) {
            this.aspectRatio = value;
            return this;
        }

        public Builder confidence(Float value) {
            this.confidence = value;
            return this;
        }

        public Builder boundary(Boundary value) {
            this.boundary = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(CroppingSuggestion from) {
            this.aspectRatio = from.aspectRatio;
            this.confidence = from.confidence;
            this.boundary = from.boundary;
        }

        public CroppingSuggestion build() {
            return new CroppingSuggestion(this);
        }
    }
}
