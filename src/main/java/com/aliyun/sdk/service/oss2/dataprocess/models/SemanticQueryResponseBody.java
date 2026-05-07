package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

/**
 * XML response body for the SemanticQuery operation.
 */
@JsonRootName("SemanticQueryResult")
public final class SemanticQueryResponseBody {
    @JacksonXmlElementWrapper(localName = "Files")
    @JsonProperty("File")
    private List<File> files;

    public SemanticQueryResponseBody() {}

    public List<File> files() {
        return this.files;
    }
}
