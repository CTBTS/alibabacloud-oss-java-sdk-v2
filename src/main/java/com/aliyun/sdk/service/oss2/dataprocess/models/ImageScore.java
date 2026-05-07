package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("ImageScore")
public final class ImageScore {

    @JsonProperty("OverallQualityScore")
    private Float overallQualityScore;

    public ImageScore() {
    }

    private ImageScore(Builder builder) {
        this.overallQualityScore = builder.overallQualityScore;
    }

    public Float overallQualityScore() {
        return this.overallQualityScore;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private Float overallQualityScore;

        public Builder overallQualityScore(Float value) {
            this.overallQualityScore = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(ImageScore from) {
            this.overallQualityScore = from.overallQualityScore;
        }

        public ImageScore build() {
            return new ImageScore(this);
        }
    }
}
