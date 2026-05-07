package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

/**
 * XML response body for the ListDatasets operation.
 */
@JsonRootName("ListDatasetsResponse")
public final class ListDatasetsResponseBody {
    @JsonProperty("NextToken")
    private String nextToken;

    @JacksonXmlElementWrapper(localName = "Datasets")
    @JsonProperty("Dataset")
    private List<Dataset> datasets;

    public ListDatasetsResponseBody() {}

    public String nextToken() {
        return this.nextToken;
    }

    public List<Dataset> datasets() {
        return this.datasets;
    }
}
