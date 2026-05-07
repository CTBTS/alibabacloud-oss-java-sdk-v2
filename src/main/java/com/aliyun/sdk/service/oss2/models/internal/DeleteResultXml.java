package com.aliyun.sdk.service.oss2.models.internal;

import com.aliyun.sdk.service.oss2.models.DeletedInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.List;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

/**
 * The wrapper for the DeleteMultipleObjects response XML parsing.
 */
@JsonRootName("DeleteResult")
public final class DeleteResultXml {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Deleted")
    public List<DeletedInfo> deleted;

    @JsonProperty("EncodingType")
    public String encodingType;

    public DeleteResultXml() {
    }
}