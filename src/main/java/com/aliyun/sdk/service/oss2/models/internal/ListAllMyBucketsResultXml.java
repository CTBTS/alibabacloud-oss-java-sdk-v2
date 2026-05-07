package com.aliyun.sdk.service.oss2.models.internal;

import com.aliyun.sdk.service.oss2.models.Owner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * The container that stores the result of ListBuckets(GetService) request.
 */
@JsonRootName("ListAllMyBucketsResult")
public final class ListAllMyBucketsResultXml {
    @JsonProperty("NextMarker")
    public String nextMarker;

    @JsonProperty("Buckets")
    public BucketsXml buckets;

    @JsonProperty("Owner")
    public Owner owner;

    @JsonProperty("Prefix")
    public String prefix;

    @JsonProperty("Marker")
    public String marker;

    @JsonProperty("MaxKeys")
    public Long maxKeys;

    @JsonProperty("IsTruncated")
    public Boolean isTruncated;

    public ListAllMyBucketsResultXml() {
    }
}
