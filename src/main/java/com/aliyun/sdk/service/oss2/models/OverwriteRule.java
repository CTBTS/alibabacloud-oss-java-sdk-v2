package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * List of overwrite protection rules. A bucket can have a maximum of 100 rules.
 */
@JsonRootName("Rule")
public final class OverwriteRule {
    @JsonProperty("Principals")
    private OverwritePrincipals principals;

    @JsonProperty("ID")
    private String id;

    @JsonProperty("Action")
    private String action;

    @JsonProperty("Prefix")
    private String prefix;

    @JsonProperty("Suffix")
    private String suffix;

    public OverwriteRule() {
    }

    private OverwriteRule(Builder builder) {
        this.principals = builder.principals;
        this.id = builder.id;
        this.action = builder.action;
        this.prefix = builder.prefix;
        this.suffix = builder.suffix;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * A collection of authorized entities. The usage is similar to the `Principal` element in a bucket policy. You can specify an Alibaba Cloud account, a RAM user, or a RAM role. If this element is empty or not configured, overwrites are prohibited for all objects that match the prefix and suffix conditions.
     */
    public OverwritePrincipals principals() {
        return this.principals;
    }

    /**
     * The unique identifier of the rule. If you do not specify this element, a UUID is randomly generated. If you specify this element, the value must be unique. Different rules cannot have the same ID.
     */
    public String id() {
        return this.id;
    }

    /**
     * The operation type. Currently, only `forbid` (prohibit overwrites) is supported.
     */
    public String action() {
        return this.action;
    }

    /**
     * The prefix of object names to filter the objects that you want to process. The maximum length is 1,023 characters. Each rule can have at most one prefix. Prefixes and suffixes do not support regular expressions.
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * The suffix of object names to filter the objects that you want to process. The maximum length is 1,023 characters. Each rule can have at most one suffix. Prefixes and suffixes do not support regular expressions.
     */
    public String suffix() {
        return this.suffix;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private OverwritePrincipals principals;
        private String id;
        private String action;
        private String prefix;
        private String suffix;

        private Builder() {
            super();
        }

        private Builder(OverwriteRule from) {
            this.principals = from.principals;
            this.id = from.id;
            this.action = from.action;
            this.prefix = from.prefix;
            this.suffix = from.suffix;
        }

        /**
         * A collection of authorized entities. The usage is similar to the `Principal` element in a bucket policy. You can specify an Alibaba Cloud account, a RAM user, or a RAM role. If this element is empty or not configured, overwrites are prohibited for all objects that match the prefix and suffix conditions.
         */
        public Builder principals(OverwritePrincipals value) {
            requireNonNull(value);
            this.principals = value;
            return this;
        }

        /**
         * The unique identifier of the rule. If you do not specify this element, a UUID is randomly generated. If you specify this element, the value must be unique. Different rules cannot have the same ID.
         */
        public Builder id(String value) {
            requireNonNull(value);
            this.id = value;
            return this;
        }

        /**
         * The operation type. Currently, only `forbid` (prohibit overwrites) is supported.
         */
        public Builder action(String value) {
            requireNonNull(value);
            this.action = value;
            return this;
        }

        /**
         * The prefix of object names to filter the objects that you want to process. The maximum length is 1,023 characters. Each rule can have at most one prefix. Prefixes and suffixes do not support regular expressions.
         */
        public Builder prefix(String value) {
            requireNonNull(value);
            this.prefix = value;
            return this;
        }

        /**
         * The suffix of object names to filter the objects that you want to process. The maximum length is 1,023 characters. Each rule can have at most one suffix. Prefixes and suffixes do not support regular expressions.
         */
        public Builder suffix(String value) {
            requireNonNull(value);
            this.suffix = value;
            return this;
        }

        public OverwriteRule build() {
            return new OverwriteRule(this);
        }
    }
}
