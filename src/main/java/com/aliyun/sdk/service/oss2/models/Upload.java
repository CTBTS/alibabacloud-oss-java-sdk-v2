package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.time.Instant;

/**
 * The container that stores the information about multipart upload tasks.
 */
@JsonRootName("Upload")
public final class Upload {
    @JsonProperty("UploadId")
    private String uploadId;

    @JsonProperty("Initiated")
    private Instant initiated;

    @JsonProperty("Key")
    private String key;

    public Upload() {
    }

    private Upload(Builder builder) {
        this.uploadId = builder.uploadId;
        this.initiated = builder.initiated;
        this.key = builder.key;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * The ID of the multipart upload task.
     */
    public String uploadId() {
        return this.uploadId;
    }

    /**
     * The time when the multipart upload task was initiated.
     */
    public Instant initiated() {
        return this.initiated;
    }

    /**
     * The name of the object for which a multipart upload task was initiated.  The results returned by OSS are listed in ascending alphabetical order of object names. Multiple multipart upload tasks that are initiated to upload the same object are listed in ascending order of upload IDs.
     */
    public String key() {
        return this.key;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String uploadId;
        private Instant initiated;
        private String key;

        private Builder() {
            super();
        }

        private Builder(Upload from) {
            this.uploadId = from.uploadId;
            this.initiated = from.initiated;
            this.key = from.key;
        }

        /**
         * The ID of the multipart upload task.
         */
        public Builder uploadId(String value) {
            //requireNonNull(value);
            this.uploadId = value;
            return this;
        }

        /**
         * The time when the multipart upload task was initiated.
         */
        public Builder initiated(Instant value) {
            //requireNonNull(value);
            this.initiated = value;
            return this;
        }

        /**
         * The name of the object for which a multipart upload task was initiated.  The results returned by OSS are listed in ascending alphabetical order of object names. Multiple multipart upload tasks that are initiated to upload the same object are listed in ascending order of upload IDs.
         */
        public Builder key(String value) {
            //requireNonNull(value);
            this.key = value;
            return this;
        }

        public Upload build() {
            return new Upload(this);
        }
    }
}
