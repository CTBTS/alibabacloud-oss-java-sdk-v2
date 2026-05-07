package com.aliyun.sdk.service.oss2.models.internal;

import com.aliyun.sdk.service.oss2.models.CommonPrefix;
import com.aliyun.sdk.service.oss2.models.DeleteMarkerEntry;
import com.aliyun.sdk.service.oss2.models.ObjectVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.ArrayList;
import java.util.List;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

/**
 * The container that stores the results of the ListObjectVersions (GetBucketVersions) request.
 */
@JsonRootName("ListVersionsResult")
public final class ListVersionsResultXml {

    public List<ObjectVersion> versions;

    public List<DeleteMarkerEntry> deleteMarkers;

    @JsonProperty("Prefix")
    public String prefix;
 
    @JsonProperty("IsTruncated")
    public Boolean isTruncated;
 
    @JsonProperty("NextKeyMarker")
    public String nextKeyMarker;
 
    @JsonProperty("NextVersionIdMarker")
    public String nextVersionIdMarker;
 
    @JsonProperty("Delimiter")
    public String delimiter;
 
    @JsonProperty("EncodingType")
    public String encodingType;

    public List<CommonPrefix> commonPrefixes;
 
    @JsonProperty("Name")
    public String name;
 
    @JsonProperty("KeyMarker")
    public String keyMarker;
 
    @JsonProperty("VersionIdMarker")
    public String versionIdMarker;
 
    @JsonProperty("MaxKeys")
    public Long maxKeys;

    public ListVersionsResultXml() {}


    /**
     * Add a version to the versions list.
     *
     * @param version the ObjectVersion to add
     * @return this ListVersionsResultXml instance
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Version")
    public ListVersionsResultXml addVersion(ObjectVersion version) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(version);
        return this;
    }

    /**
     * Add a delete marker to the deleteMarkers list.
     *
     * @param deleteMarker the DeleteMarkerEntry to add
     * @return this ListVersionsResultXml instance
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("DeleteMarker")
    public ListVersionsResultXml addDeleteMarker(DeleteMarkerEntry deleteMarker) {
        if (this.deleteMarkers == null) {
            this.deleteMarkers = new ArrayList<>();
        }
        this.deleteMarkers.add(deleteMarker);
        return this;
    }

    /**
     * Add a common prefix to the commonPrefixes list.
     *
     * @param commonPrefix the CommonPrefix to add
     * @return this ListVersionsResultXml instance
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("CommonPrefixes")
    public ListVersionsResultXml addCommonPrefix(CommonPrefix commonPrefix) {
        if (this.commonPrefixes == null) {
            this.commonPrefixes = new ArrayList<>();
        }
        this.commonPrefixes.add(commonPrefix);
        return this;
    }
}
