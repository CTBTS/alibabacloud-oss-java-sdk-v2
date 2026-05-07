package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the configuration information about an Object FC Access Point.
 */
@JsonRootName("GetAccessPointConfigForObjectProcessResult")
public final class GetAccessPointConfigForObjectProcessResultXml {  
    @JsonProperty("ObjectProcessConfiguration")
    private ObjectProcessConfiguration objectProcessConfiguration;
 
    @JsonProperty("AllowAnonymousAccessForObjectProcess")
    private String allowAnonymousAccessForObjectProcess;
 
    @JsonProperty("PublicAccessBlockConfiguration")
    private PublicAccessBlockConfiguration publicAccessBlockConfiguration;

    public GetAccessPointConfigForObjectProcessResultXml() {}

    private GetAccessPointConfigForObjectProcessResultXml(Builder builder) { 
        this.objectProcessConfiguration = builder.objectProcessConfiguration; 
        this.allowAnonymousAccessForObjectProcess = builder.allowAnonymousAccessForObjectProcess; 
        this.publicAccessBlockConfiguration = builder.publicAccessBlockConfiguration; 
    }

    /**
    * The container that stores the processing information about the Object FC Access Point.
    */
    public ObjectProcessConfiguration objectProcessConfiguration() {
        return this.objectProcessConfiguration;
    }

    /**
    * Whether allow anonymous user to access this FC Access Points.
    */
    public String allowAnonymousAccessForObjectProcess() {
        return this.allowAnonymousAccessForObjectProcess;
    }

    /**
    * The container in which the Block Public Access configurations are stored.
    */
    public PublicAccessBlockConfiguration publicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private ObjectProcessConfiguration objectProcessConfiguration;
        private String allowAnonymousAccessForObjectProcess;
        private PublicAccessBlockConfiguration publicAccessBlockConfiguration;
        
        /**
        * The container that stores the processing information about the Object FC Access Point.
        */
        public Builder objectProcessConfiguration(ObjectProcessConfiguration value) {
            requireNonNull(value);
            this.objectProcessConfiguration = value;
            return this;
        }
        
        /**
        * Whether allow anonymous user to access this FC Access Points.
        */
        public Builder allowAnonymousAccessForObjectProcess(String value) {
            requireNonNull(value);
            this.allowAnonymousAccessForObjectProcess = value;
            return this;
        }
        
        /**
        * The container in which the Block Public Access configurations are stored.
        */
        public Builder publicAccessBlockConfiguration(PublicAccessBlockConfiguration value) {
            requireNonNull(value);
            this.publicAccessBlockConfiguration = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(GetAccessPointConfigForObjectProcessResultXml from) { 
            this.objectProcessConfiguration = from.objectProcessConfiguration; 
            this.allowAnonymousAccessForObjectProcess = from.allowAnonymousAccessForObjectProcess; 
            this.publicAccessBlockConfiguration = from.publicAccessBlockConfiguration; 
        }

        public GetAccessPointConfigForObjectProcessResultXml build() {
            return new GetAccessPointConfigForObjectProcessResultXml(this);
        }
    }
}