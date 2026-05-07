package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores access monitor configuration.
 */
@JsonRootName("AccessMonitorConfiguration")
public final class AccessMonitorConfiguration {  
    @JsonProperty("Status")
    private String status;

    @JsonProperty("AllowCopy")
    private Boolean allowCopy;

    public AccessMonitorConfiguration() {}

    private AccessMonitorConfiguration(Builder builder) { 
        this.status = builder.status; 
        this.allowCopy = builder.allowCopy;
    }

    /**
    * The access tracking status of the bucket. Valid values:- Enabled: Access tracking is enabled.- Disabled: Access tracking is disabled.
    */
    public String status() {
        return this.status;
    }

    /**
     * Whether to allow copying data.
     */
    public Boolean allowCopy() {
        return this.allowCopy;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private String status;
        private Boolean allowCopy;
        
        /**
        * The access tracking status of the bucket. Valid values:- Enabled: Access tracking is enabled.- Disabled: Access tracking is disabled.
        */
        public Builder status(String value) {
            requireNonNull(value);
            this.status = value;
            return this;
        }
        
        /**
        * Set the access tracking status of the bucket using AccessMonitorStatusType enum.
        */
        public Builder status(AccessMonitorStatusType value) {
            requireNonNull(value);
            this.status = value.toString();
            return this;
        }
        
        /**
         * Set whether to allow copying data.
         */
        public Builder allowCopy(Boolean value) {
            this.allowCopy = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(AccessMonitorConfiguration from) { 
            this.status = from.status; 
            this.allowCopy = from.allowCopy;
        }

        public AccessMonitorConfiguration build() {
            return new AccessMonitorConfiguration(this);
        }
    }
}