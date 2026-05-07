package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The configuration for creating an access point for object process.
 */
@JsonRootName("CreateAccessPointForObjectProcessConfiguration")
public final class CreateAccessPointForObjectProcessConfiguration {  
    @JsonProperty("AccessPointName")
    private String accessPointName;
 
    @JsonProperty("ObjectProcessConfiguration")
    private ObjectProcessConfiguration objectProcessConfiguration;
 
    @JsonProperty("AllowAnonymousAccessForObjectProcess")
    private String allowAnonymousAccessForObjectProcess;

    public CreateAccessPointForObjectProcessConfiguration() {}

    private CreateAccessPointForObjectProcessConfiguration(Builder builder) { 
        this.accessPointName = builder.accessPointName; 
        this.objectProcessConfiguration = builder.objectProcessConfiguration; 
        this.allowAnonymousAccessForObjectProcess = builder.allowAnonymousAccessForObjectProcess; 
    }

    /**
    * The name of the OSS access point.
    */
    public String accessPointName() {
        return this.accessPointName;
    }

    /**
    * The container that stores the object process configuration.
    */
    public ObjectProcessConfiguration objectProcessConfiguration() {
        return this.objectProcessConfiguration;
    }

    /**
    * Whether to allow anonymous access.
    */
    public String allowAnonymousAccessForObjectProcess() {
        return this.allowAnonymousAccessForObjectProcess;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private String accessPointName;
        private ObjectProcessConfiguration objectProcessConfiguration;
        private String allowAnonymousAccessForObjectProcess;
        
        /**
        * The name of the OSS access point.
        */
        public Builder accessPointName(String value) {
            requireNonNull(value);
            this.accessPointName = value;
            return this;
        }
        
        /**
        * The container that stores the object process configuration.
        */
        public Builder objectProcessConfiguration(ObjectProcessConfiguration value) {
            requireNonNull(value);
            this.objectProcessConfiguration = value;
            return this;
        }
        
        /**
        * Whether to allow anonymous access.
        */
        public Builder allowAnonymousAccessForObjectProcess(String value) {
            requireNonNull(value);
            this.allowAnonymousAccessForObjectProcess = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(CreateAccessPointForObjectProcessConfiguration from) { 
            this.accessPointName = from.accessPointName; 
            this.objectProcessConfiguration = from.objectProcessConfiguration; 
            this.allowAnonymousAccessForObjectProcess = from.allowAnonymousAccessForObjectProcess; 
        }

        public CreateAccessPointForObjectProcessConfiguration build() {
            return new CreateAccessPointForObjectProcessConfiguration(this);
        }
    }
}