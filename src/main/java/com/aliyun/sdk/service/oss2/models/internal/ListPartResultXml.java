package com.aliyun.sdk.service.oss2.models.internal;

import com.aliyun.sdk.service.oss2.models.Part;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.List;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

/**
 * The container that stores the response of the ListParts request.
 */
@JsonRootName("ListPartResult")
public final class ListPartResultXml {
    @JsonProperty("Key")
    public String key;

    @JsonProperty("UploadId")
    public String uploadId;

    @JsonProperty("PartNumberMarker")
    public Long partNumberMarker;

    @JsonProperty("NextPartNumberMarker")
    public Long nextPartNumberMarker;

    @JsonProperty("MaxParts")
    public Long maxParts;

    @JsonProperty("IsTruncated")
    public Boolean isTruncated;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Part")
    public List<Part> parts;

    @JsonProperty("Bucket")
    public String bucket;

    @JsonProperty("EncodingType")
    public String encodingType;


    public ListPartResultXml() {
    }


}
