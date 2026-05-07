package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the ACL information.
 */
@JsonRootName("AccessControlList")
public final class AccessControlList {
    @JsonProperty("Grant")
    private String grant;

    public AccessControlList() {
    }

    private AccessControlList(Builder builder) {
        this.grant = builder.grant;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * The ACL of the object. Default value: default.
     */
    public String grant() {
        return this.grant;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String grant;

        private Builder() {
            super();
        }


        private Builder(AccessControlList from) {
            this.grant = from.grant;
        }

        /**
         * The ACL of the object. Default value: default.
         */
        public Builder grant(String value) {
            requireNonNull(value);
            this.grant = value;
            return this;
        }

        public AccessControlList build() {
            return new AccessControlList(this);
        }
    }
}
