package com.aliyun.sdk.service.oss2.models.internal;

import com.aliyun.sdk.service.oss2.models.CommonPrefix;
import com.aliyun.sdk.service.oss2.models.ObjectSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.List;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the metadata of the returned objects.
 */
@JsonRootName("ListBucketResult")
public final class ListBucketV2ResultXml {
    @JsonProperty("Name")
    public String name;

    @JsonProperty("Prefix")
    public String prefix;

    @JsonProperty("MaxKeys")
    public Integer maxKeys;

    @JsonProperty("KeyCount")
    public Integer keyCount;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Contents")
    public List<ObjectSummary> contents;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("CommonPrefixes")
    public List<CommonPrefix> commonPrefixes;

    @JsonProperty("StartAfter")
    public String startAfter;

    @JsonProperty("Delimiter")
    public String delimiter;

    @JsonProperty("IsTruncated")
    public Boolean isTruncated;

    @JsonProperty("EncodingType")
    public String encodingType;

    @JsonProperty("ContinuationToken")
    public String continuationToken;

    @JsonProperty("NextContinuationToken")
    public String nextContinuationToken;

    public ListBucketV2ResultXml() {
    }

}
