package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.time.Instant;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the versions of objects, excluding delete markers.
 */
@JsonRootName("ObjectVersion")
public final class ObjectVersion {  
    @JsonProperty("Size")
    private Long size;
 
    @JsonProperty("Owner")
    private Owner owner;
 
    @JsonProperty("RestoreInfo")
    private String restoreInfo;
 
    @JsonProperty("TransitionTime")
    private Instant transitionTime;
 
    @JsonProperty("Key")
    private String key;
 
    @JsonProperty("IsLatest")
    private Boolean isLatest;
 
    @JsonProperty("LastModified")
    private Instant lastModified;
 
    @JsonProperty("ETag")
    private String eTag;
 
    @JsonProperty("VersionId")
    private String versionId;
 
    @JsonProperty("StorageClass")
    private String storageClass;

    public ObjectVersion() {}

    private ObjectVersion(Builder builder) { 
        this.size = builder.size; 
        this.owner = builder.owner; 
        this.restoreInfo = builder.restoreInfo; 
        this.transitionTime = builder.transitionTime; 
        this.key = builder.key; 
        this.isLatest = builder.isLatest; 
        this.lastModified = builder.lastModified; 
        this.eTag = builder.eTag; 
        this.versionId = builder.versionId; 
        this.storageClass = builder.storageClass; 
    }

    /**
    * The size of the object.
    */
    public Long size() {
        return this.size;
    }

    /**
    * The container for the information about the bucket owner.
    */
    public Owner owner() {
        return this.owner;
    }

    /**
    * The restoration status of the object version.
    */
    public String restoreInfo() {
        return this.restoreInfo;
    }

    /**
    * The time when a version of the object is converted to Cold Archive or Deep Cold Archive based on lifecycle rules.
    */
    public Instant transitionTime() {
        return this.transitionTime;
    }

    /**
    * The name of the object.
    */
    public String key() {
        return this.key;
    }

    /**
    * Indicates whether the version of the object is the current version. Valid values:*   true: The version is the current version.*   false: The version is a previous version.
    */
    public Boolean isLatest() {
        return this.isLatest;
    }

    /**
    * The time when the object was last modified.
    */
    public Instant lastModified() {
        return this.lastModified;
    }

    /**
    * The ETag that is generated when an object is created. ETags are used to identify the content of objects.*   For an object that is created by calling the PutObject operation, the ETag value of the object is the MD5 hash of its content.*   For an object that is created by using another method, the ETag value is not the MD5 hash of the object content but a unique value calculated based on a specific rule.  The ETag value of an object can be used only to check whether the content of the object is modified. We recommend that you use the MD5 hash of an object rather than the ETag of it to verify data integrity.
    */
    public String eTag() {
        return this.eTag;
    }

    /**
    * The version ID of the object.
    */
    public String versionId() {
        return this.versionId;
    }

    /**
    * The storage class of the object.
    */
    public String storageClass() {
        return this.storageClass;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private Long size;
        private Owner owner;
        private String restoreInfo;
        private Instant transitionTime;
        private String key;
        private Boolean isLatest;
        private Instant lastModified;
        private String eTag;
        private String versionId;
        private String storageClass;
        
        /**
        * The size of the object.
        */
        public Builder size(Long value) {
            requireNonNull(value);
            this.size = value;
            return this;
        }
        
        /**
        * The container for the information about the bucket owner.
        */
        public Builder owner(Owner value) {
            requireNonNull(value);
            this.owner = value;
            return this;
        }
        
        /**
        * The restoration status of the object version.
        */
        public Builder restoreInfo(String value) {
            requireNonNull(value);
            this.restoreInfo = value;
            return this;
        }
        
        /**
        * The time when a version of the object is converted to Cold Archive or Deep Cold Archive based on lifecycle rules.
        */
        public Builder transitionTime(Instant value) {
            requireNonNull(value);
            this.transitionTime = value;
            return this;
        }
        
        /**
        * The name of the object.
        */
        public Builder key(String value) {
            requireNonNull(value);
            this.key = value;
            return this;
        }
        
        /**
        * Indicates whether the version of the object is the current version. Valid values:*   true: The version is the current version.*   false: The version is a previous version.
        */
        public Builder isLatest(Boolean value) {
            requireNonNull(value);
            this.isLatest = value;
            return this;
        }
        
        /**
        * The time when the object was last modified.
        */
        public Builder lastModified(Instant value) {
            requireNonNull(value);
            this.lastModified = value;
            return this;
        }
        
        /**
        * The ETag that is generated when an object is created. ETags are used to identify the content of objects.*   For an object that is created by calling the PutObject operation, the ETag value of the object is the MD5 hash of its content.*   For an object that is created by using another method, the ETag value is not the MD5 hash of the object content but a unique value calculated based on a specific rule.  The ETag value of an object can be used only to check whether the content of the object is modified. We recommend that you use the MD5 hash of an object rather than the ETag of it to verify data integrity.
        */
        public Builder eTag(String value) {
            requireNonNull(value);
            this.eTag = value;
            return this;
        }
        
        /**
        * The version ID of the object.
        */
        public Builder versionId(String value) {
            requireNonNull(value);
            this.versionId = value;
            return this;
        }
        
        /**
        * The storage class of the object.
        */
        public Builder storageClass(String value) {
            requireNonNull(value);
            this.storageClass = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(ObjectVersion from) { 
            this.size = from.size; 
            this.owner = from.owner; 
            this.restoreInfo = from.restoreInfo; 
            this.transitionTime = from.transitionTime; 
            this.key = from.key; 
            this.isLatest = from.isLatest; 
            this.lastModified = from.lastModified; 
            this.eTag = from.eTag; 
            this.versionId = from.versionId; 
            this.storageClass = from.storageClass; 
        }

        public ObjectVersion build() {
            return new ObjectVersion(this);
        }
    }
}
