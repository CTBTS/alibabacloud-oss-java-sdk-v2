package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("OCRContents")
public final class OCRContents {

    @JsonProperty("Language")
    private String language;

    @JsonProperty("Contents")
    private String contents;

    @JsonProperty("Confidence")
    private Float confidence;

    @JsonProperty("Boundary")
    private Boundary boundary;

    public OCRContents() {
    }

    private OCRContents(Builder builder) {
        this.language = builder.language;
        this.contents = builder.contents;
        this.confidence = builder.confidence;
        this.boundary = builder.boundary;
    }

    public String language() {
        return this.language;
    }

    public String contents() {
        return this.contents;
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
        private String language;
        private String contents;
        private Float confidence;
        private Boundary boundary;

        public Builder language(String value) {
            this.language = value;
            return this;
        }

        public Builder contents(String value) {
            this.contents = value;
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

        private Builder(OCRContents from) {
            this.language = from.language;
            this.contents = from.contents;
            this.confidence = from.confidence;
            this.boundary = from.boundary;
        }

        public OCRContents build() {
            return new OCRContents(this);
        }
    }
}
