package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores all information returned for the GetBucketStat request.
 */
@JsonRootName("BucketStat")
public final class BucketStat {
    @JsonProperty("ArchiveObjectCount")
    private Long archiveObjectCount;

    @JsonProperty("MultipartUploadCount")
    private Long multipartUploadCount;

    @JsonProperty("LiveChannelCount")
    private Long liveChannelCount;

    @JsonProperty("MultipartPartCount")
    private Long multipartPartCount;

    @JsonProperty("StandardObjectCount")
    private Long standardObjectCount;

    @JsonProperty("InfrequentAccessRealStorage")
    private Long infrequentAccessRealStorage;

    @JsonProperty("ArchiveStorage")
    private Long archiveStorage;

    @JsonProperty("DeleteMarkerCount")
    private Long deleteMarkerCount;

    @JsonProperty("StandardStorage")
    private Long standardStorage;

    @JsonProperty("InfrequentAccessStorage")
    private Long infrequentAccessStorage;

    @JsonProperty("ColdArchiveStorage")
    private Long coldArchiveStorage;

    @JsonProperty("ColdArchiveObjectCount")
    private Long coldArchiveObjectCount;

    @JsonProperty("DeepColdArchiveObjectCount")
    private Long deepColdArchiveObjectCount;

    @JsonProperty("DeepColdArchiveStorage")
    private Long deepColdArchiveStorage;

    @JsonProperty("DeepColdArchiveRealStorage")
    private Long deepColdArchiveRealStorage;

    @JsonProperty("Storage")
    private Long storage;

    @JsonProperty("ObjectCount")
    private Long objectCount;

    @JsonProperty("LastModifiedTime")
    private Long lastModifiedTime;

    @JsonProperty("InfrequentAccessObjectCount")
    private Long infrequentAccessObjectCount;

    @JsonProperty("ArchiveRealStorage")
    private Long archiveRealStorage;

    @JsonProperty("ColdArchiveRealStorage")
    private Long coldArchiveRealStorage;

    public BucketStat() {
    }

    private BucketStat(Builder builder) {
        this.archiveObjectCount = builder.archiveObjectCount;
        this.multipartUploadCount = builder.multipartUploadCount;
        this.liveChannelCount = builder.liveChannelCount;
        this.multipartPartCount = builder.multipartPartCount;
        this.standardObjectCount = builder.standardObjectCount;
        this.infrequentAccessRealStorage = builder.infrequentAccessRealStorage;
        this.archiveStorage = builder.archiveStorage;
        this.deleteMarkerCount = builder.deleteMarkerCount;
        this.standardStorage = builder.standardStorage;
        this.infrequentAccessStorage = builder.infrequentAccessStorage;
        this.coldArchiveStorage = builder.coldArchiveStorage;
        this.coldArchiveObjectCount = builder.coldArchiveObjectCount;
        this.deepColdArchiveObjectCount = builder.deepColdArchiveObjectCount;
        this.deepColdArchiveStorage = builder.deepColdArchiveStorage;
        this.deepColdArchiveRealStorage = builder.deepColdArchiveRealStorage;
        this.storage = builder.storage;
        this.objectCount = builder.objectCount;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.infrequentAccessObjectCount = builder.infrequentAccessObjectCount;
        this.archiveRealStorage = builder.archiveRealStorage;
        this.coldArchiveRealStorage = builder.coldArchiveRealStorage;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * The number of Archive objects in the bucket.
     */
    public Long archiveObjectCount() {
        return this.archiveObjectCount;
    }

    /**
     * The number of multipart upload tasks that have been initiated but are not completed or canceled.
     */
    public Long multipartUploadCount() {
        return this.multipartUploadCount;
    }

    /**
     * The number of LiveChannels in the bucket.
     */
    public Long liveChannelCount() {
        return this.liveChannelCount;
    }

    /**
     * The number of mulitpart parts in the bucket.
     */
    public Long multipartPartCount() {
        return this.multipartPartCount;
    }

    /**
     * The number of Standard objects in the bucket.
     */
    public Long standardObjectCount() {
        return this.standardObjectCount;
    }

    /**
     * The actual storage usage of IA objects in the bucket. Unit: bytes.
     */
    public Long infrequentAccessRealStorage() {
        return this.infrequentAccessRealStorage;
    }

    /**
     * The billed storage usage of Archive objects in the bucket. Unit: bytes.
     */
    public Long archiveStorage() {
        return this.archiveStorage;
    }

    /**
     * The number of deletemarker in the bucket.
     */
    public Long deleteMarkerCount() {
        return this.deleteMarkerCount;
    }

    /**
     * The storage usage of Standard objects in the bucket. Unit: bytes.
     */
    public Long standardStorage() {
        return this.standardStorage;
    }

    /**
     * The billed storage usage of IA objects in the bucket. Unit: bytes.
     */
    public Long infrequentAccessStorage() {
        return this.infrequentAccessStorage;
    }

    /**
     * The billed storage usage of Cold Archive objects in the bucket. Unit: bytes.
     */
    public Long coldArchiveStorage() {
        return this.coldArchiveStorage;
    }

    /**
     * The number of Cold Archive objects in the bucket.
     */
    public Long coldArchiveObjectCount() {
        return this.coldArchiveObjectCount;
    }

    /**
     * The number of Deep Cold Archive objects in the bucket.
     */
    public Long deepColdArchiveObjectCount() {
        return this.deepColdArchiveObjectCount;
    }

    /**
     * The billed storage usage of Deep Cold Archive objects in the bucket. Unit: bytes.
     */
    public Long deepColdArchiveStorage() {
        return this.deepColdArchiveStorage;
    }

    /**
     * The actual storage usage of Deep Cold Archive objects in the bucket. Unit: bytes.
     */
    public Long deepColdArchiveRealStorage() {
        return this.deepColdArchiveRealStorage;
    }

    /**
     * The storage usage of the bucket. Unit: bytes.
     */
    public Long storage() {
        return this.storage;
    }

    /**
     * The total number of objects in the bucket.
     */
    public Long objectCount() {
        return this.objectCount;
    }

    /**
     * The time when the obtained information was last modified. The value of this parameter is a UNIX timestamp. Unit: seconds.
     */
    public Long lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * The number of IA objects in the bucket.
     */
    public Long infrequentAccessObjectCount() {
        return this.infrequentAccessObjectCount;
    }

    /**
     * The actual storage usage of Archive objects in the bucket. Unit: bytes.
     */
    public Long archiveRealStorage() {
        return this.archiveRealStorage;
    }

    /**
     * The actual storage usage of Cold Archive objects in the bucket. Unit: bytes.
     */
    public Long coldArchiveRealStorage() {
        return this.coldArchiveRealStorage;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private Long archiveObjectCount;
        private Long multipartUploadCount;
        private Long liveChannelCount;
        private Long multipartPartCount;
        private Long standardObjectCount;
        private Long infrequentAccessRealStorage;
        private Long archiveStorage;
        private Long deleteMarkerCount;
        private Long standardStorage;
        private Long infrequentAccessStorage;
        private Long coldArchiveStorage;
        private Long coldArchiveObjectCount;
        private Long deepColdArchiveObjectCount;
        private Long deepColdArchiveStorage;
        private Long deepColdArchiveRealStorage;
        private Long storage;
        private Long objectCount;
        private Long lastModifiedTime;
        private Long infrequentAccessObjectCount;
        private Long archiveRealStorage;
        private Long coldArchiveRealStorage;

        private Builder() {
            super();
        }

        private Builder(BucketStat from) {
            this.archiveObjectCount = from.archiveObjectCount;
            this.multipartUploadCount = from.multipartUploadCount;
            this.liveChannelCount = from.liveChannelCount;
            this.multipartPartCount = from.multipartPartCount;
            this.standardObjectCount = from.standardObjectCount;
            this.infrequentAccessRealStorage = from.infrequentAccessRealStorage;
            this.archiveStorage = from.archiveStorage;
            this.deleteMarkerCount = from.deleteMarkerCount;
            this.standardStorage = from.standardStorage;
            this.infrequentAccessStorage = from.infrequentAccessStorage;
            this.coldArchiveStorage = from.coldArchiveStorage;
            this.coldArchiveObjectCount = from.coldArchiveObjectCount;
            this.deepColdArchiveObjectCount = from.deepColdArchiveObjectCount;
            this.deepColdArchiveStorage = from.deepColdArchiveStorage;
            this.deepColdArchiveRealStorage = from.deepColdArchiveRealStorage;
            this.storage = from.storage;
            this.objectCount = from.objectCount;
            this.lastModifiedTime = from.lastModifiedTime;
            this.infrequentAccessObjectCount = from.infrequentAccessObjectCount;
            this.archiveRealStorage = from.archiveRealStorage;
            this.coldArchiveRealStorage = from.coldArchiveRealStorage;
        }

        /**
         * The number of Archive objects in the bucket.
         */
        public Builder archiveObjectCount(Long value) {
            requireNonNull(value);
            this.archiveObjectCount = value;
            return this;
        }

        /**
         * The number of multipart upload tasks that have been initiated but are not completed or canceled.
         */
        public Builder multipartUploadCount(Long value) {
            requireNonNull(value);
            this.multipartUploadCount = value;
            return this;
        }

        /**
         * The number of LiveChannels in the bucket.
         */
        public Builder liveChannelCount(Long value) {
            requireNonNull(value);
            this.liveChannelCount = value;
            return this;
        }

        /**
         * The number of mulitpart parts in the bucket.
         */
        public Builder multipartPartCount(Long value) {
            requireNonNull(value);
            this.multipartPartCount = value;
            return this;
        }

        /**
         * The number of Standard objects in the bucket.
         */
        public Builder standardObjectCount(Long value) {
            requireNonNull(value);
            this.standardObjectCount = value;
            return this;
        }

        /**
         * The actual storage usage of IA objects in the bucket. Unit: bytes.
         */
        public Builder infrequentAccessRealStorage(Long value) {
            requireNonNull(value);
            this.infrequentAccessRealStorage = value;
            return this;
        }

        /**
         * The billed storage usage of Archive objects in the bucket. Unit: bytes.
         */
        public Builder archiveStorage(Long value) {
            requireNonNull(value);
            this.archiveStorage = value;
            return this;
        }

        /**
         * The number of deletemarker in the bucket.
         */
        public Builder deleteMarkerCount(Long value) {
            requireNonNull(value);
            this.deleteMarkerCount = value;
            return this;
        }

        /**
         * The storage usage of Standard objects in the bucket. Unit: bytes.
         */
        public Builder standardStorage(Long value) {
            requireNonNull(value);
            this.standardStorage = value;
            return this;
        }

        /**
         * The billed storage usage of IA objects in the bucket. Unit: bytes.
         */
        public Builder infrequentAccessStorage(Long value) {
            requireNonNull(value);
            this.infrequentAccessStorage = value;
            return this;
        }

        /**
         * The billed storage usage of Cold Archive objects in the bucket. Unit: bytes.
         */
        public Builder coldArchiveStorage(Long value) {
            requireNonNull(value);
            this.coldArchiveStorage = value;
            return this;
        }

        /**
         * The number of Cold Archive objects in the bucket.
         */
        public Builder coldArchiveObjectCount(Long value) {
            requireNonNull(value);
            this.coldArchiveObjectCount = value;
            return this;
        }

        /**
         * The number of Deep Cold Archive objects in the bucket.
         */
        public Builder deepColdArchiveObjectCount(Long value) {
            requireNonNull(value);
            this.deepColdArchiveObjectCount = value;
            return this;
        }

        /**
         * The billed storage usage of Deep Cold Archive objects in the bucket. Unit: bytes.
         */
        public Builder deepColdArchiveStorage(Long value) {
            requireNonNull(value);
            this.deepColdArchiveStorage = value;
            return this;
        }

        /**
         * The actual storage usage of Deep Cold Archive objects in the bucket. Unit: bytes.
         */
        public Builder deepColdArchiveRealStorage(Long value) {
            requireNonNull(value);
            this.deepColdArchiveRealStorage = value;
            return this;
        }

        /**
         * The storage usage of the bucket. Unit: bytes.
         */
        public Builder storage(Long value) {
            requireNonNull(value);
            this.storage = value;
            return this;
        }

        /**
         * The total number of objects in the bucket.
         */
        public Builder objectCount(Long value) {
            requireNonNull(value);
            this.objectCount = value;
            return this;
        }

        /**
         * The time when the obtained information was last modified. The value of this parameter is a UNIX timestamp. Unit: seconds.
         */
        public Builder lastModifiedTime(Long value) {
            requireNonNull(value);
            this.lastModifiedTime = value;
            return this;
        }

        /**
         * The number of IA objects in the bucket.
         */
        public Builder infrequentAccessObjectCount(Long value) {
            requireNonNull(value);
            this.infrequentAccessObjectCount = value;
            return this;
        }

        /**
         * The actual storage usage of Archive objects in the bucket. Unit: bytes.
         */
        public Builder archiveRealStorage(Long value) {
            requireNonNull(value);
            this.archiveRealStorage = value;
            return this;
        }

        /**
         * The actual storage usage of Cold Archive objects in the bucket. Unit: bytes.
         */
        public Builder coldArchiveRealStorage(Long value) {
            requireNonNull(value);
            this.coldArchiveRealStorage = value;
            return this;
        }

        public BucketStat build() {
            return new BucketStat(this);
        }
    }
}
