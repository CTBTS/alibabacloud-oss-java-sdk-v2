package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("ImageInsight")
public final class ImageInsight {

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    public ImageInsight() {}

    private ImageInsight(Builder builder) {
        this.caption = builder.caption;
        this.description = builder.description;
    }

    public String caption() { return this.caption; }
    public String description() { return this.description; }

    public static Builder newBuilder() { return new Builder(); }
    public Builder toBuilder() { return new Builder(this); }

    public static class Builder {
        private String caption;
        private String description;

        public Builder caption(String value) { this.caption = value; return this; }
        public Builder description(String value) { this.description = value; return this; }

        private Builder() { super(); }

        private Builder(ImageInsight from) {
            this.caption = from.caption;
            this.description = from.description;
        }

        public ImageInsight build() { return new ImageInsight(this); }
    }
}
