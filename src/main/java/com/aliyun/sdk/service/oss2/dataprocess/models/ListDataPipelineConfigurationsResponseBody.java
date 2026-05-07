package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

/**
 * XML response body for the ListDataPipelineConfigurations operation.
 */
@JsonRootName("ListDataPipelineConfigurationsResult")
public final class ListDataPipelineConfigurationsResponseBody {
    @JsonProperty("NextToken")
    private String nextToken;

    @JacksonXmlElementWrapper(localName = "DataPipelineConfigurations")
    @JsonProperty("DataPipelineConfiguration")
    private List<DataPipelineConfiguration> dataPipelineConfigurations;

    public ListDataPipelineConfigurationsResponseBody() {}

    public String nextToken() {
        return this.nextToken;
    }

    public List<DataPipelineConfiguration> dataPipelineConfigurations() {
        return this.dataPipelineConfigurations;
    }
}
