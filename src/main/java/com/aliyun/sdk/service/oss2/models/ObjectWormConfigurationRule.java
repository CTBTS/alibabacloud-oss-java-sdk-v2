package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * The container that stores the object-level retention policy.
 */
@JsonRootName("Rule")
public final class ObjectWormConfigurationRule {
    @JsonProperty("DefaultRetention")
    private ObjectWormConfigurationDefaultRetention defaultRetention;

    public ObjectWormConfigurationRule() {}

    private ObjectWormConfigurationRule(Builder builder) {
        this.defaultRetention = builder.defaultRetention;
    }

    /**
     * The container that stores the default retention settings.
     */
    public ObjectWormConfigurationDefaultRetention defaultRetention() {
        return this.defaultRetention;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private ObjectWormConfigurationDefaultRetention defaultRetention;

        /**
         * The container that stores the default retention settings.
         */
        public Builder defaultRetention(ObjectWormConfigurationDefaultRetention value) {
            this.defaultRetention = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(ObjectWormConfigurationRule from) {
            this.defaultRetention = from.defaultRetention;
        }

        public ObjectWormConfigurationRule build() {
            return new ObjectWormConfigurationRule(this);
        }
    }
}
