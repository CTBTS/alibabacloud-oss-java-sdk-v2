package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.time.Instant;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores delete markers.
 */
@JsonRootName("DeleteMarkerEntry")
public final class DeleteMarkerEntry {  
    @JsonProperty("Key")
    private String key;
 
    @JsonProperty("VersionId")
    private String versionId;
 
    @JsonProperty("IsLatest")
    private Boolean isLatest;
 
    @JsonProperty("LastModified")
    private Instant lastModified;
 
    @JsonProperty("Owner")
    private Owner owner;

    public DeleteMarkerEntry() {}

    private DeleteMarkerEntry(Builder builder) { 
        this.key = builder.key; 
        this.versionId = builder.versionId; 
        this.isLatest = builder.isLatest; 
        this.lastModified = builder.lastModified; 
        this.owner = builder.owner; 
    }

    /**
    * The name of the object.
    */
    public String key() {
        return this.key;
    }

    /**
    * The version ID of the object.
    */
    public String versionId() {
        return this.versionId;
    }

    /**
    * Indicates whether the version is the current version. Valid values:*   true: The version is the current version.*   false: The version is a previous version.
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
    * The container that stores the information about the bucket owner.
    */
    public Owner owner() {
        return this.owner;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private String key;
        private String versionId;
        private Boolean isLatest;
        private Instant lastModified;
        private Owner owner;
        
        /**
        * The name of the object.
        */
        public Builder key(String value) {
            requireNonNull(value);
            this.key = value;
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
        * Indicates whether the version is the current version. Valid values:*   true: The version is the current version.*   false: The version is a previous version.
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
        * The container that stores the information about the bucket owner.
        */
        public Builder owner(Owner value) {
            requireNonNull(value);
            this.owner = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(DeleteMarkerEntry from) { 
            this.key = from.key; 
            this.versionId = from.versionId; 
            this.isLatest = from.isLatest; 
            this.lastModified = from.lastModified; 
            this.owner = from.owner; 
        }

        public DeleteMarkerEntry build() {
            return new DeleteMarkerEntry(this);
        }
    }
}
