package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The condition that is matched by objects to which the lifecycle rule does not apply.
 */
@JsonRootName("Not")
public final class LifecycleRuleNot {  
    @JsonProperty("Prefix")
    private String prefix;
 
    @JsonProperty("Tag")
    private Tag tag;

    public LifecycleRuleNot() {}

    private LifecycleRuleNot(Builder builder) { 
        this.prefix = builder.prefix; 
        this.tag = builder.tag; 
    }

    /**
    * The prefix in the names of the objects to which the lifecycle rule does not apply.
    */
    public String prefix() {
        return this.prefix;
    }

    /**
    * The tag of the objects to which the lifecycle rule does not apply.
    */
    public Tag tag() {
        return this.tag;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private String prefix;
        private Tag tag;
        
        /**
        * The prefix in the names of the objects to which the lifecycle rule does not apply.
        */
        public Builder prefix(String value) {
            requireNonNull(value);
            this.prefix = value;
            return this;
        }
        
        /**
        * The tag of the objects to which the lifecycle rule does not apply.
        */
        public Builder tag(Tag value) {
            requireNonNull(value);
            this.tag = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(LifecycleRuleNot from) { 
            this.prefix = from.prefix; 
            this.tag = from.tag; 
        }

        public LifecycleRuleNot build() {
            return new LifecycleRuleNot(this);
        }
    }
}