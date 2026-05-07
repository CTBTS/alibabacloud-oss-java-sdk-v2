package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("HeadPose")
public final class HeadPose {

    @JsonProperty("Pitch")
    private Float pitch;

    @JsonProperty("Roll")
    private Float roll;

    @JsonProperty("Yaw")
    private Float yaw;

    public HeadPose() {
    }

    private HeadPose(Builder builder) {
        this.pitch = builder.pitch;
        this.roll = builder.roll;
        this.yaw = builder.yaw;
    }

    public Float pitch() {
        return this.pitch;
    }

    public Float roll() {
        return this.roll;
    }

    public Float yaw() {
        return this.yaw;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private Float pitch;
        private Float roll;
        private Float yaw;

        public Builder pitch(Float value) {
            this.pitch = value;
            return this;
        }

        public Builder roll(Float value) {
            this.roll = value;
            return this;
        }

        public Builder yaw(Float value) {
            this.yaw = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(HeadPose from) {
            this.pitch = from.pitch;
            this.roll = from.roll;
            this.yaw = from.yaw;
        }

        public HeadPose build() {
            return new HeadPose(this);
        }
    }
}
