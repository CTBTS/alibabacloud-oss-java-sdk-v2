package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The configuration list for multiple origins.
 */
@JsonRootName("MirrorMultiAlternate")
public final class MirrorMultiAlternate {  
    @JsonProperty("MirrorMultiAlternateNumber")
    private Long mirrorMultiAlternateNumber;
 
    @JsonProperty("MirrorMultiAlternateURL")
    private String mirrorMultiAlternateURL;
 
    @JsonProperty("MirrorMultiAlternateVpcId")
    private String mirrorMultiAlternateVpcId;
 
    @JsonProperty("MirrorMultiAlternateDstRegion")
    private String mirrorMultiAlternateDstRegion;

    public MirrorMultiAlternate() {}

    private MirrorMultiAlternate(Builder builder) { 
        this.mirrorMultiAlternateNumber = builder.mirrorMultiAlternateNumber; 
        this.mirrorMultiAlternateURL = builder.mirrorMultiAlternateURL; 
        this.mirrorMultiAlternateVpcId = builder.mirrorMultiAlternateVpcId; 
        this.mirrorMultiAlternateDstRegion = builder.mirrorMultiAlternateDstRegion; 
    }

    /**
    * The distinct number of a specific origin.
    */
    public Long mirrorMultiAlternateNumber() {
        return this.mirrorMultiAlternateNumber;
    }

    /**
    * The URL for a specific origin.
    */
    public String mirrorMultiAlternateURL() {
        return this.mirrorMultiAlternateURL;
    }

    /**
    * The VPC ID for a specific origin.
    */
    public String mirrorMultiAlternateVpcId() {
        return this.mirrorMultiAlternateVpcId;
    }

    /**
    * The region for a specific origin.
    */
    public String mirrorMultiAlternateDstRegion() {
        return this.mirrorMultiAlternateDstRegion;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private Long mirrorMultiAlternateNumber;
        private String mirrorMultiAlternateURL;
        private String mirrorMultiAlternateVpcId;
        private String mirrorMultiAlternateDstRegion;
        
        /**
        * The distinct number of a specific origin.
        */
        public Builder mirrorMultiAlternateNumber(Long value) {
            requireNonNull(value);
            this.mirrorMultiAlternateNumber = value;
            return this;
        }
        
        /**
        * The URL for a specific origin.
        */
        public Builder mirrorMultiAlternateURL(String value) {
            requireNonNull(value);
            this.mirrorMultiAlternateURL = value;
            return this;
        }
        
        /**
        * The VPC ID for a specific origin.
        */
        public Builder mirrorMultiAlternateVpcId(String value) {
            requireNonNull(value);
            this.mirrorMultiAlternateVpcId = value;
            return this;
        }
        
        /**
        * The region for a specific origin.
        */
        public Builder mirrorMultiAlternateDstRegion(String value) {
            requireNonNull(value);
            this.mirrorMultiAlternateDstRegion = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(MirrorMultiAlternate from) { 
            this.mirrorMultiAlternateNumber = from.mirrorMultiAlternateNumber; 
            this.mirrorMultiAlternateURL = from.mirrorMultiAlternateURL; 
            this.mirrorMultiAlternateVpcId = from.mirrorMultiAlternateVpcId; 
            this.mirrorMultiAlternateDstRegion = from.mirrorMultiAlternateDstRegion; 
        }

        public MirrorMultiAlternate build() {
            return new MirrorMultiAlternate(this);
        }
    }
}
