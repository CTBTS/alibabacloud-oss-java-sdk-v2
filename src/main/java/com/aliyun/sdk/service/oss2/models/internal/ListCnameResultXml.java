package com.aliyun.sdk.service.oss2.models.internal;

import com.aliyun.sdk.service.oss2.models.CnameInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.List;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

/**
 * The container that stores the results of the ListCname request.
 */
@JsonRootName("ListCnameResult")
public final class ListCnameResultXml {

    @JsonProperty("Bucket")
    public String bucket;

    @JsonProperty("Owner")
    public String owner;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Cname")
    public List<CnameInfo> cnames;

    public ListCnameResultXml() {}

}