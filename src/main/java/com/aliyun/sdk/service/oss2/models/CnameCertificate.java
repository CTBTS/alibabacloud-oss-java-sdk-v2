package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The information about the certificate.
 */
@JsonRootName("CnameCertificate")
public final class CnameCertificate {  
    @JsonProperty("Type")
    private String type;
 
    @JsonProperty("CertId")
    private String certId;
 
    @JsonProperty("Status")
    private String status;
 
    @JsonProperty("CreationDate")
    private String creationDate;
 
    @JsonProperty("Fingerprint")
    private String fingerprint;
 
    @JsonProperty("ValidStartDate")
    private String validStartDate;
 
    @JsonProperty("ValidEndDate")
    private String validEndDate;

    public CnameCertificate() {}

    private CnameCertificate(Builder builder) { 
        this.type = builder.type; 
        this.certId = builder.certId; 
        this.status = builder.status; 
        this.creationDate = builder.creationDate; 
        this.fingerprint = builder.fingerprint; 
        this.validStartDate = builder.validStartDate; 
        this.validEndDate = builder.validEndDate; 
    }

    /**
    * The source of the certificate.Valid values:*   CAS            *   Upload            
    */
    public String type() {
        return this.type;
    }

    /**
    * The ID of the certificate.
    */
    public String certId() {
        return this.certId;
    }

    /**
    * The status of the certificate.Valid values:*   Enabled            *   Disabled            
    */
    public String status() {
        return this.status;
    }

    /**
    * The time when the certificate was bound.
    */
    public String creationDate() {
        return this.creationDate;
    }

    /**
    * The signature of the certificate.
    */
    public String fingerprint() {
        return this.fingerprint;
    }

    /**
    * The time when the certificate takes effect.
    */
    public String validStartDate() {
        return this.validStartDate;
    }

    /**
    * The time when the certificate expires.
    */
    public String validEndDate() {
        return this.validEndDate;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private String type;
        private String certId;
        private String status;
        private String creationDate;
        private String fingerprint;
        private String validStartDate;
        private String validEndDate;
        
        /**
        * The source of the certificate.Valid values:*   CAS            *   Upload            
        */
        public Builder type(String value) {
            requireNonNull(value);
            this.type = value;
            return this;
        }
        
        /**
        * The ID of the certificate.
        */
        public Builder certId(String value) {
            requireNonNull(value);
            this.certId = value;
            return this;
        }
        
        /**
        * The status of the certificate.Valid values:*   Enabled            *   Disabled            
        */
        public Builder status(String value) {
            requireNonNull(value);
            this.status = value;
            return this;
        }
        
        /**
        * The time when the certificate was bound.
        */
        public Builder creationDate(String value) {
            requireNonNull(value);
            this.creationDate = value;
            return this;
        }
        
        /**
        * The signature of the certificate.
        */
        public Builder fingerprint(String value) {
            requireNonNull(value);
            this.fingerprint = value;
            return this;
        }
        
        /**
        * The time when the certificate takes effect.
        */
        public Builder validStartDate(String value) {
            requireNonNull(value);
            this.validStartDate = value;
            return this;
        }
        
        /**
        * The time when the certificate expires.
        */
        public Builder validEndDate(String value) {
            requireNonNull(value);
            this.validEndDate = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(CnameCertificate from) { 
            this.type = from.type; 
            this.certId = from.certId; 
            this.status = from.status; 
            this.creationDate = from.creationDate; 
            this.fingerprint = from.fingerprint; 
            this.validStartDate = from.validStartDate; 
            this.validEndDate = from.validEndDate; 
        }

        public CnameCertificate build() {
            return new CnameCertificate(this);
        }
    }
}
