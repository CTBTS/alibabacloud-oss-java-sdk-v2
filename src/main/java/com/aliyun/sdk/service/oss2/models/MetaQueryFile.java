package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * Single Object information in data indexing retrieval results
 */
@JsonRootName("File")
public final class MetaQueryFile {
    @JsonProperty("URI")
    private String uri;

    @JsonProperty("Filename")
    private String filename;

    @JsonProperty("Size")
    private Long size;

    @JsonProperty("ObjectACL")
    private String objectACL;

    @JsonProperty("FileModifiedTime")
    private String fileModifiedTime;

    @JsonProperty("ServerSideEncryption")
    private String serverSideEncryption;

    @JsonProperty("ServerSideEncryptionCustomerAlgorithm")
    private String serverSideEncryptionCustomerAlgorithm;

    @JsonProperty("ETag")
    private String eTag;

    @JsonProperty("OSSCRC64")
    private String ossCRC64;

    @JsonProperty("ProduceTime")
    private String produceTime;

    @JsonProperty("ContentType")
    private String contentType;

    @JsonProperty("MediaType")
    private String mediaType;

    @JsonProperty("LatLong")
    private String latLong;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("OSSExpiration")
    private String ossExpiration;

    @JsonProperty("AccessControlAllowOrigin")
    private String accessControlAllowOrigin;

    @JsonProperty("AccessControlRequestMethod")
    private String accessControlRequestMethod;

    @JsonProperty("ServerSideDataEncryption")
    private String serverSideDataEncryption;

    @JsonProperty("ServerSideEncryptionKeyId")
    private String serverSideEncryptionKeyId;

    @JsonProperty("CacheControl")
    private String cacheControl;

    @JsonProperty("ContentDisposition")
    private String contentDisposition;

    @JsonProperty("ContentEncoding")
    private String contentEncoding;

    @JsonProperty("ContentLanguage")
    private String contentLanguage;

    @JsonProperty("ImageHeight")
    private Long imageHeight;

    @JsonProperty("ImageWidth")
    private Long imageWidth;

    @JsonProperty("VideoWidth")
    private Long videoWidth;

    @JsonProperty("VideoHeight")
    private Long videoHeight;

    @JsonProperty("VideoStreams")
    private MetaQueryVideoStreams videoStreams;

    @JsonProperty("AudioStreams")
    private MetaQueryAudioStreams audioStreams;

    @JsonProperty("Subtitles")
    private MetaQuerySubtitles subtitles;

    @JsonProperty("Bitrate")
    private Long bitrate;

    @JsonProperty("Artist")
    private String artist;

    @JsonProperty("AlbumArtist")
    private String albumArtist;

    @JsonProperty("Composer")
    private String composer;

    @JsonProperty("Performer")
    private String performer;

    @JsonProperty("Album")
    private String album;

    @JsonProperty("Duration")
    private Double duration;

    @JsonProperty("Addresses")
    private MetaQueryAddresses addresses;

    @JsonProperty("OSSObjectType")
    private String ossObjectType;

    @JsonProperty("OSSStorageClass")
    private String ossStorageClass;

    @JsonProperty("OSSTaggingCount")
    private Long ossTaggingCount;

    @JsonProperty("OSSTagging")
    private MetaQueryOSSTagging ossTagging;

    @JsonProperty("OSSUserMeta")
    private MetaQueryOSSUserMeta ossUserMeta;

    @JsonProperty("Insights")
    private MetaQueryRespFileInsights insights;

    public MetaQueryFile() {}

    private MetaQueryFile(Builder builder) {
        this.uri = builder.uri;
        this.filename = builder.filename;
        this.size = builder.size;
        this.objectACL = builder.objectACL;
        this.fileModifiedTime = builder.fileModifiedTime;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.serverSideEncryptionCustomerAlgorithm = builder.serverSideEncryptionCustomerAlgorithm;
        this.eTag = builder.eTag;
        this.ossCRC64 = builder.ossCRC64;
        this.produceTime = builder.produceTime;
        this.contentType = builder.contentType;
        this.mediaType = builder.mediaType;
        this.latLong = builder.latLong;
        this.title = builder.title;
        this.ossExpiration = builder.ossExpiration;
        this.accessControlAllowOrigin = builder.accessControlAllowOrigin;
        this.accessControlRequestMethod = builder.accessControlRequestMethod;
        this.serverSideDataEncryption = builder.serverSideDataEncryption;
        this.serverSideEncryptionKeyId = builder.serverSideEncryptionKeyId;
        this.cacheControl = builder.cacheControl;
        this.contentDisposition = builder.contentDisposition;
        this.contentEncoding = builder.contentEncoding;
        this.contentLanguage = builder.contentLanguage;
        this.imageHeight = builder.imageHeight;
        this.imageWidth = builder.imageWidth;
        this.videoWidth = builder.videoWidth;
        this.videoHeight = builder.videoHeight;
        this.videoStreams = builder.videoStreams;
        this.audioStreams = builder.audioStreams;
        this.subtitles = builder.subtitles;
        this.bitrate = builder.bitrate;
        this.artist = builder.artist;
        this.albumArtist = builder.albumArtist;
        this.composer = builder.composer;
        this.performer = builder.performer;
        this.album = builder.album;
        this.duration = builder.duration;
        this.addresses = builder.addresses;
        this.ossObjectType = builder.ossObjectType;
        this.ossStorageClass = builder.ossStorageClass;
        this.ossTaggingCount = builder.ossTaggingCount;
        this.ossTagging = builder.ossTagging;
        this.ossUserMeta = builder.ossUserMeta;
        this.insights = builder.insights;
    }

    /**
     * Object full path
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Object name
     */
    public String filename() {
        return this.filename;
    }

    /**
     * Object size in bytes
     */
    public Long size() {
        return this.size;
    }

    /**
     * Object access permissions
     */
    public String objectACL() {
        return this.objectACL;
    }

    /**
     * Last modification time, following RFC 3339 standard format
     */
    public String fileModifiedTime() {
        return this.fileModifiedTime;
    }

    /**
     * Server-side encryption key when creating object
     */
    public String serverSideEncryption() {
        return this.serverSideEncryption;
    }

    /**
     * Server-side encryption algorithm when creating object
     */
    public String serverSideEncryptionCustomerAlgorithm() {
        return this.serverSideEncryptionCustomerAlgorithm;
    }

    /**
     * Object ETAG
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Object CRC64 checksum value
     */
    public String ossCRC64() {
        return this.ossCRC64;
    }

    /**
     * Shooting time of photo or video recorded by device
     */
    public String produceTime() {
        return this.produceTime;
    }

    /**
     * MIME type
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Media type
     */
    public String mediaType() {
        return this.mediaType;
    }

    /**
     * Latitude and longitude information
     */
    public String latLong() {
        return this.latLong;
    }

    /**
     * File title
     */
    public String title() {
        return this.title;
    }

    /**
     * File expiration time
     */
    public String ossExpiration() {
        return this.ossExpiration;
    }

    /**
     * Allowed origin of cross-domain request
     */
    public String accessControlAllowOrigin() {
        return this.accessControlAllowOrigin;
    }

    /**
     * Method used in cross-domain request
     */
    public String accessControlRequestMethod() {
        return this.accessControlRequestMethod;
    }

    /**
     * Object encryption algorithm
     */
    public String serverSideDataEncryption() {
        return this.serverSideDataEncryption;
    }

    /**
     * KMS managed customer master key
     */
    public String serverSideEncryptionKeyId() {
        return this.serverSideEncryptionKeyId;
    }

    /**
     * Web caching behavior when object is downloaded
     */
    public String cacheControl() {
        return this.cacheControl;
    }

    /**
     * Name of object when downloaded
     */
    public String contentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Content encoding format when object is downloaded
     */
    public String contentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Language used in object content
     */
    public String contentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Image height in pixels (px)
     */
    public Long imageHeight() {
        return this.imageHeight;
    }

    /**
     * Image width in pixels (px)
     */
    public Long imageWidth() {
        return this.imageWidth;
    }

    /**
     * Video width in pixels (px)
     */
    public Long videoWidth() {
        return this.videoWidth;
    }

    /**
     * Video height in pixels (px)
     */
    public Long videoHeight() {
        return this.videoHeight;
    }

    /**
     * Video streams information in the vector retrieval results of data indexing
     */
    public MetaQueryVideoStreams videoStreams() {
        return this.videoStreams;
    }

    // Add alias method for accessing the videoStream list directly
    public List<MetaQueryVideoStream> getVideoStream() {
        return this.videoStreams != null ? this.videoStreams.videoStream() : null;
    }

    /**
     * Audio streams information in the vector retrieval results of data indexing
     */
    public MetaQueryAudioStreams audioStreams() {
        return this.audioStreams;
    }

    // Add alias method for accessing the audioStream list directly
    public List<MetaQueryAudioStream> getAudioStream() {
        return this.audioStreams != null ? this.audioStreams.audioStream() : null;
    }

    /**
     * Subtitles information in the vector retrieval results of data indexing
     */
    public MetaQuerySubtitles subtitles() {
        return this.subtitles;
    }

    // Add alias method for accessing the subtitle list directly
    public List<MetaQuerySubtitle> getSubtitle() {
        return this.subtitles != null ? this.subtitles.subtitle() : null;
    }

    /**
     * Bit rate, in bits per second (bit/s)
     */
    public Long bitrate() {
        return this.bitrate;
    }

    /**
     * Artist name
     */
    public String artist() {
        return this.artist;
    }

    /**
     * Album artist name
     */
    public String albumArtist() {
        return this.albumArtist;
    }

    /**
     * Composer name
     */
    public String composer() {
        return this.composer;
    }

    /**
     * Performer name
     */
    public String performer() {
        return this.performer;
    }

    /**
     * Album name
     */
    public String album() {
        return this.album;
    }

    /**
     * Duration in seconds (s)
     */
    public Double duration() {
        return this.duration;
    }

    /**
     * Addresses information in the vector retrieval results of data indexing
     */
    public MetaQueryAddresses addresses() {
        return this.addresses;
    }

    // Add alias method for accessing the address list directly
    public List<MetaQueryAddress> getAddress() {
        return this.addresses != null ? this.addresses.address() : null;
    }

    /**
     * Object type
     */
    public String ossObjectType() {
        return this.ossObjectType;
    }

    /**
     * Object storage class
     */
    public String ossStorageClass() {
        return this.ossStorageClass;
    }

    /**
     * Number of object tags
     */
    public Long ossTaggingCount() {
        return this.ossTaggingCount;
    }

    /**
     * Object tagging list
     */
    public MetaQueryOSSTagging ossTagging() {
        return this.ossTagging;
    }

    // Add alias method for accessing the tagging list directly
    public List<MetaQueryTagging> getTagging() {
        return this.ossTagging != null ? this.ossTagging.tagging() : null;
    }

    /**
     * Object custom metadata list
     */
    public MetaQueryOSSUserMeta ossUserMeta() {
        return this.ossUserMeta;
    }

    /**
     * File insights information, containing descriptive information about the file
     */
    public MetaQueryRespFileInsights insights() {
        return this.insights;
    }

    // Add alias method for accessing the userMeta list directly
    public List<MetaQueryUserMeta> getUserMeta() {
        return this.ossUserMeta != null ? this.ossUserMeta.userMeta() : null;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String uri;
        private String filename;
        private Long size;
        private String objectACL;
        private String fileModifiedTime;
        private String serverSideEncryption;
        private String serverSideEncryptionCustomerAlgorithm;
        private String eTag;
        private String ossCRC64;
        private String produceTime;
        private String contentType;
        private String mediaType;
        private String latLong;
        private String title;
        private String ossExpiration;
        private String accessControlAllowOrigin;
        private String accessControlRequestMethod;
        private String serverSideDataEncryption;
        private String serverSideEncryptionKeyId;
        private String cacheControl;
        private String contentDisposition;
        private String contentEncoding;
        private String contentLanguage;
        private Long imageHeight;
        private Long imageWidth;
        private Long videoWidth;
        private Long videoHeight;
        private MetaQueryVideoStreams videoStreams;
        private MetaQueryAudioStreams audioStreams;
        private MetaQuerySubtitles subtitles;
        private Long bitrate;
        private String artist;
        private String albumArtist;
        private String composer;
        private String performer;
        private String album;
        private Double duration;
        private MetaQueryAddresses addresses;
        private String ossObjectType;
        private String ossStorageClass;
        private Long ossTaggingCount;
        private MetaQueryOSSTagging ossTagging;
        private MetaQueryOSSUserMeta ossUserMeta;
        private MetaQueryRespFileInsights insights;

        /**
         * Sets the object full path
         */
        public Builder uri(String value) {
            requireNonNull(value);
            this.uri = value;
            return this;
        }

        /**
         * Sets the object name
         */
        public Builder filename(String value) {
            requireNonNull(value);
            this.filename = value;
            return this;
        }

        /**
         * Sets the object size in bytes
         */
        public Builder size(Long value) {
            requireNonNull(value);
            this.size = value;
            return this;
        }

        /**
         * Sets the object access permissions
         */
        public Builder objectACL(String value) {
            requireNonNull(value);
            this.objectACL = value;
            return this;
        }

        /**
         * Sets the last modification time, following RFC 3339 standard format
         */
        public Builder fileModifiedTime(String value) {
            requireNonNull(value);
            this.fileModifiedTime = value;
            return this;
        }

        /**
         * Sets the server-side encryption key when creating object
         */
        public Builder serverSideEncryption(String value) {
            requireNonNull(value);
            this.serverSideEncryption = value;
            return this;
        }

        /**
         * Sets the server-side encryption algorithm when creating object
         */
        public Builder serverSideEncryptionCustomerAlgorithm(String value) {
            requireNonNull(value);
            this.serverSideEncryptionCustomerAlgorithm = value;
            return this;
        }

        /**
         * Sets the object ETAG
         */
        public Builder eTag(String value) {
            requireNonNull(value);
            this.eTag = value;
            return this;
        }

        /**
         * Sets the object CRC64 checksum value
         */
        public Builder ossCRC64(String value) {
            requireNonNull(value);
            this.ossCRC64 = value;
            return this;
        }

        /**
         * Sets the shooting time of photo or video recorded by device
         */
        public Builder produceTime(String value) {
            requireNonNull(value);
            this.produceTime = value;
            return this;
        }

        /**
         * Sets the MIME type
         */
        public Builder contentType(String value) {
            requireNonNull(value);
            this.contentType = value;
            return this;
        }

        /**
         * Sets the media type
         */
        public Builder mediaType(String value) {
            requireNonNull(value);
            this.mediaType = value;
            return this;
        }

        /**
         * Sets the latitude and longitude information
         */
        public Builder latLong(String value) {
            requireNonNull(value);
            this.latLong = value;
            return this;
        }

        /**
         * Sets the file title
         */
        public Builder title(String value) {
            requireNonNull(value);
            this.title = value;
            return this;
        }

        /**
         * Sets the file expiration time
         */
        public Builder ossExpiration(String value) {
            requireNonNull(value);
            this.ossExpiration = value;
            return this;
        }

        /**
         * Sets the allowed origin of cross-domain request
         */
        public Builder accessControlAllowOrigin(String value) {
            requireNonNull(value);
            this.accessControlAllowOrigin = value;
            return this;
        }

        /**
         * Sets the method used in cross-domain request
         */
        public Builder accessControlRequestMethod(String value) {
            requireNonNull(value);
            this.accessControlRequestMethod = value;
            return this;
        }

        /**
         * Sets the object encryption algorithm
         */
        public Builder serverSideDataEncryption(String value) {
            requireNonNull(value);
            this.serverSideDataEncryption = value;
            return this;
        }

        /**
         * Sets the KMS managed customer master key
         */
        public Builder serverSideEncryptionKeyId(String value) {
            requireNonNull(value);
            this.serverSideEncryptionKeyId = value;
            return this;
        }

        /**
         * Sets the web caching behavior when object is downloaded
         */
        public Builder cacheControl(String value) {
            requireNonNull(value);
            this.cacheControl = value;
            return this;
        }

        /**
         * Sets the name of object when downloaded
         */
        public Builder contentDisposition(String value) {
            requireNonNull(value);
            this.contentDisposition = value;
            return this;
        }

        /**
         * Sets the content encoding format when object is downloaded
         */
        public Builder contentEncoding(String value) {
            requireNonNull(value);
            this.contentEncoding = value;
            return this;
        }

        /**
         * Sets the language used in object content
         */
        public Builder contentLanguage(String value) {
            requireNonNull(value);
            this.contentLanguage = value;
            return this;
        }

        /**
         * Sets the image height in pixels (px)
         */
        public Builder imageHeight(Long value) {
            requireNonNull(value);
            this.imageHeight = value;
            return this;
        }

        /**
         * Sets the image width in pixels (px)
         */
        public Builder imageWidth(Long value) {
            requireNonNull(value);
            this.imageWidth = value;
            return this;
        }

        /**
         * Sets the video width in pixels (px)
         */
        public Builder videoWidth(Long value) {
            requireNonNull(value);
            this.videoWidth = value;
            return this;
        }

        /**
         * Sets the video height in pixels (px)
         */
        public Builder videoHeight(Long value) {
            requireNonNull(value);
            this.videoHeight = value;
            return this;
        }

        /**
         * Sets the video streams information in the vector retrieval results of data indexing
         */
        public Builder videoStreams(MetaQueryVideoStreams value) {
            requireNonNull(value);
            this.videoStreams = value;
            return this;
        }

        /**
         * Sets the audio streams information in the vector retrieval results of data indexing
         */
        public Builder audioStreams(MetaQueryAudioStreams value) {
            requireNonNull(value);
            this.audioStreams = value;
            return this;
        }

        /**
         * Sets the subtitles information in the vector retrieval results of data indexing
         */
        public Builder subtitles(MetaQuerySubtitles value) {
            requireNonNull(value);
            this.subtitles = value;
            return this;
        }

        /**
         * Sets the bit rate, in bits per second (bit/s)
         */
        public Builder bitrate(Long value) {
            requireNonNull(value);
            this.bitrate = value;
            return this;
        }

        /**
         * Sets the artist name
         */
        public Builder artist(String value) {
            requireNonNull(value);
            this.artist = value;
            return this;
        }

        /**
         * Sets the album artist name
         */
        public Builder albumArtist(String value) {
            requireNonNull(value);
            this.albumArtist = value;
            return this;
        }

        /**
         * Sets the composer name
         */
        public Builder composer(String value) {
            requireNonNull(value);
            this.composer = value;
            return this;
        }

        /**
         * Sets the performer name
         */
        public Builder performer(String value) {
            requireNonNull(value);
            this.performer = value;
            return this;
        }

        /**
         * Sets the album name
         */
        public Builder album(String value) {
            requireNonNull(value);
            this.album = value;
            return this;
        }

        /**
         * Sets the duration in seconds (s)
         */
        public Builder duration(Double value) {
            requireNonNull(value);
            this.duration = value;
            return this;
        }

        /**
         * Sets the addresses information in the vector retrieval results of data indexing
         */
        public Builder addresses(MetaQueryAddresses value) {
            requireNonNull(value);
            this.addresses = value;
            return this;
        }

        /**
         * Sets the object type
         */
        public Builder ossObjectType(String value) {
            requireNonNull(value);
            this.ossObjectType = value;
            return this;
        }

        /**
         * Sets the object storage class
         */
        public Builder ossStorageClass(String value) {
            requireNonNull(value);
            this.ossStorageClass = value;
            return this;
        }

        /**
         * Sets the number of object tags
         */
        public Builder ossTaggingCount(Long value) {
            requireNonNull(value);
            this.ossTaggingCount = value;
            return this;
        }

        /**
         * Sets the object tagging list
         */
        public Builder ossTagging(MetaQueryOSSTagging value) {
            requireNonNull(value);
            this.ossTagging = value;
            return this;
        }

        /**
         * Sets the object custom metadata list
         */
        public Builder ossUserMeta(MetaQueryOSSUserMeta value) {
            requireNonNull(value);
            this.ossUserMeta = value;
            return this;
        }

        /**
         * Sets the file insights information, containing descriptive information about the file
         */
        public Builder insights(MetaQueryRespFileInsights value) {
            requireNonNull(value);
            this.insights = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(MetaQueryFile from) {
            this.uri = from.uri;
            this.filename = from.filename;
            this.size = from.size;
            this.objectACL = from.objectACL;
            this.fileModifiedTime = from.fileModifiedTime;
            this.serverSideEncryption = from.serverSideEncryption;
            this.serverSideEncryptionCustomerAlgorithm = from.serverSideEncryptionCustomerAlgorithm;
            this.eTag = from.eTag;
            this.ossCRC64 = from.ossCRC64;
            this.produceTime = from.produceTime;
            this.contentType = from.contentType;
            this.mediaType = from.mediaType;
            this.latLong = from.latLong;
            this.title = from.title;
            this.ossExpiration = from.ossExpiration;
            this.accessControlAllowOrigin = from.accessControlAllowOrigin;
            this.accessControlRequestMethod = from.accessControlRequestMethod;
            this.serverSideDataEncryption = from.serverSideDataEncryption;
            this.serverSideEncryptionKeyId = from.serverSideEncryptionKeyId;
            this.cacheControl = from.cacheControl;
            this.contentDisposition = from.contentDisposition;
            this.contentEncoding = from.contentEncoding;
            this.contentLanguage = from.contentLanguage;
            this.imageHeight = from.imageHeight;
            this.imageWidth = from.imageWidth;
            this.videoWidth = from.videoWidth;
            this.videoHeight = from.videoHeight;
            this.videoStreams = from.videoStreams;
            this.audioStreams = from.audioStreams;
            this.subtitles = from.subtitles;
            this.bitrate = from.bitrate;
            this.artist = from.artist;
            this.albumArtist = from.albumArtist;
            this.composer = from.composer;
            this.performer = from.performer;
            this.album = from.album;
            this.duration = from.duration;
            this.addresses = from.addresses;
            this.ossObjectType = from.ossObjectType;
            this.ossStorageClass = from.ossStorageClass;
            this.ossTaggingCount = from.ossTaggingCount;
            this.ossTagging = from.ossTagging;
            this.ossUserMeta = from.ossUserMeta;
            this.insights = from.insights;
        }

        public MetaQueryFile build() {
            return new MetaQueryFile(this);
        }
    }
}