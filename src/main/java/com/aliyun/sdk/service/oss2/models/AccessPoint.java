package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the information about an access point.
 */
@JsonRootName("AccessPoint")
public final class AccessPoint {  
    @JsonProperty("Alias")
    private String alias;
 
    @JsonProperty("NetworkOrigin")
    private String networkOrigin;
 
    @JsonProperty("VpcConfiguration")
    private AccessPointVpcConfiguration vpcConfiguration;
 
    @JsonProperty("Status")
    private String status;
 
    @JsonProperty("Bucket")
    private String bucket;
 
    @JsonProperty("AccessPointName")
    private String accessPointName;

    public AccessPoint() {}

    private AccessPoint(Builder builder) { 
        this.alias = builder.alias; 
        this.networkOrigin = builder.networkOrigin; 
        this.vpcConfiguration = builder.vpcConfiguration; 
        this.status = builder.status; 
        this.bucket = builder.bucket; 
        this.accessPointName = builder.accessPointName; 
    }

    /**
    * The alias of the access point.
    */
    public String alias() {
        return this.alias;
    }

    /**
    * The network origin of the access point.
    */
    public String networkOrigin() {
        return this.networkOrigin;
    }

    /**
    * The container that stores the information about the VPC.
    */
    public AccessPointVpcConfiguration vpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
    * The status of the access point.
    */
    public String status() {
        return this.status;
    }

    /**
    * The name of the bucket for which the access point is configured.
    */
    public String bucket() {
        return this.bucket;
    }

    /**
    * The name of the access point.
    */
    public String accessPointName() {
        return this.accessPointName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private String alias;
        private String networkOrigin;
        private AccessPointVpcConfiguration vpcConfiguration;
        private String status;
        private String bucket;
        private String accessPointName;
        
        /**
        * The alias of the access point.
        */
        public Builder alias(String value) {
            requireNonNull(value);
            this.alias = value;
            return this;
        }
        
        /**
        * The network origin of the access point.
        */
        public Builder networkOrigin(String value) {
            requireNonNull(value);
            this.networkOrigin = value;
            return this;
        }
        
        /**
        * The container that stores the information about the VPC.
        */
        public Builder vpcConfiguration(AccessPointVpcConfiguration value) {
            requireNonNull(value);
            this.vpcConfiguration = value;
            return this;
        }
        
        /**
        * The status of the access point.
        */
        public Builder status(String value) {
            requireNonNull(value);
            this.status = value;
            return this;
        }
        
        /**
        * The name of the bucket for which the access point is configured.
        */
        public Builder bucket(String value) {
            requireNonNull(value);
            this.bucket = value;
            return this;
        }
        
        /**
        * The name of the access point.
        */
        public Builder accessPointName(String value) {
            requireNonNull(value);
            this.accessPointName = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(AccessPoint from) { 
            this.alias = from.alias; 
            this.networkOrigin = from.networkOrigin; 
            this.vpcConfiguration = from.vpcConfiguration; 
            this.status = from.status; 
            this.bucket = from.bucket; 
            this.accessPointName = from.accessPointName; 
        }

        public AccessPoint build() {
            return new AccessPoint(this);
        }
    }
}
