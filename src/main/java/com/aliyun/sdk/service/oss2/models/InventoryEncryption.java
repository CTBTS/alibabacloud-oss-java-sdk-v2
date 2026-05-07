package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the encryption method of exported inventory lists.
 */
@JsonRootName("InventoryEncryption")
public final class InventoryEncryption {  
    @JsonProperty("SSE-OSS")
    private String sseOss;
 
    @JsonProperty("SSE-KMS")
    private SSEKMS sseKms;

    public InventoryEncryption() {}

    private InventoryEncryption(Builder builder) { 
        this.sseOss = builder.sseOss; 
        this.sseKms = builder.sseKms; 
    }

    /**
    * The container that stores information about the SSE-OSS encryption method.
    */
    public String sseOss() {
        return this.sseOss;
    }

    /**
    * The container that stores the customer master key (CMK) used for SSE-KMS encryption.
    */
    public SSEKMS sseKms() {
        return this.sseKms;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private String sseOss;
        private SSEKMS sseKms;
        
        /**
        * The container that stores information about the SSE-OSS encryption method.
        */
        public Builder sseOss(String value) {
            requireNonNull(value);
            this.sseOss = value;
            return this;
        }
        
        /**
        * The container that stores the customer master key (CMK) used for SSE-KMS encryption.
        */
        public Builder sseKms(SSEKMS value) {
            requireNonNull(value);
            this.sseKms = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(InventoryEncryption from) { 
            this.sseOss = from.sseOss; 
            this.sseKms = from.sseKms; 
        }

        public InventoryEncryption build() {
            return new InventoryEncryption(this);
        }
    }
}
