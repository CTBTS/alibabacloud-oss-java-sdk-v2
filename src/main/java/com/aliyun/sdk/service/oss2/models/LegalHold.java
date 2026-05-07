package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The container for object legal hold configuration.
 */
@JsonRootName("LegalHold")
public final class LegalHold {
    @JsonProperty("Status")
    private String status;

    public LegalHold() {}

    private LegalHold(Builder builder) {
        this.status = builder.status;
    }

    /**
     * The status of the object legal hold. Valid values: ON, OFF.
     */
    public String status() {
        return this.status;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String status;

        /**
         * The status of the object legal hold. Valid values: ON, OFF.
         */
        public Builder status(String value) {
            requireNonNull(value);
            this.status = value;
            return this;
        }

        /**
         * The status of the object legal hold. Valid values: ON, OFF.
         */
        public Builder status(ObjectLegalHoldStatusType value) {
            requireNonNull(value);
            this.status = value.toString();
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(LegalHold from) {
            this.status = from.status;
        }

        public LegalHold build() {
            return new LegalHold(this);
        }
    }
}
