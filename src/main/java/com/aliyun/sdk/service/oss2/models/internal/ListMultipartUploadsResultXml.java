package com.aliyun.sdk.service.oss2.models.internal;

import com.aliyun.sdk.service.oss2.models.Upload;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.List;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

/**
 * The container that stores list multipart uploads result for XML serialization.
 */
@JsonRootName("ListMultipartUploadsResult")
public final class ListMultipartUploadsResultXml {
    @JsonProperty("Bucket")
    public String bucket;

    @JsonProperty("KeyMarker")
    public String keyMarker;

    @JsonProperty("UploadIdMarker")
    public String uploadIdMarker;

    @JsonProperty("NextKeyMarker")
    public String nextKeyMarker;

    @JsonProperty("NextUploadIdMarker")
    public String nextUploadIdMarker;

    @JsonProperty("Delimiter")
    public String delimiter;

    @JsonProperty("Prefix")
    public String prefix;

    @JsonProperty("MaxUploads")
    public Long maxUploads;

    @JsonProperty("IsTruncated")
    public Boolean isTruncated;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Upload")
    public List<Upload> uploads;

    @JsonProperty("EncodingType")
    public String encodingType;


    public ListMultipartUploadsResultXml() {
    }

}
