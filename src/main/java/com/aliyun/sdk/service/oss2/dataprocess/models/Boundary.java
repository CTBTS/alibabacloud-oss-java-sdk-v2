package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonRootName("Boundary")
public final class Boundary {

    @JsonProperty("Width")
    private Long width;

    @JsonProperty("Height")
    private Long height;

    @JsonProperty("Left")
    private Long left;

    @JsonProperty("Top")
    private Long top;

    @JacksonXmlElementWrapper(localName = "Polygon")
    @JsonProperty("PointInt64")
    private List<PointInt64> polygon;

    public Boundary() {
    }

    private Boundary(Builder builder) {
        this.width = builder.width;
        this.height = builder.height;
        this.left = builder.left;
        this.top = builder.top;
        this.polygon = builder.polygon;
    }

    public Long width() {
        return this.width;
    }

    public Long height() {
        return this.height;
    }

    public Long left() {
        return this.left;
    }

    public Long top() {
        return this.top;
    }

    public List<PointInt64> polygon() {
        return this.polygon;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private Long width;
        private Long height;
        private Long left;
        private Long top;
        private List<PointInt64> polygon;

        public Builder width(Long value) {
            this.width = value;
            return this;
        }

        public Builder height(Long value) {
            this.height = value;
            return this;
        }

        public Builder left(Long value) {
            this.left = value;
            return this;
        }

        public Builder top(Long value) {
            this.top = value;
            return this;
        }

        public Builder polygon(List<PointInt64> value) {
            this.polygon = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(Boundary from) {
            this.width = from.width;
            this.height = from.height;
            this.left = from.left;
            this.top = from.top;
            this.polygon = from.polygon;
        }

        public Boundary build() {
            return new Boundary(this);
        }
    }
}
