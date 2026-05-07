package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * XML response body for the GetDataPipelineConfiguration operation.
 */
@JsonRootName("GetDataPipelineConfigurationResult")
public final class GetDataPipelineConfigurationResponseBody {
    @JsonProperty("DataPipelineConfiguration")
    private DataPipelineConfiguration dataPipelineConfiguration;

    public GetDataPipelineConfigurationResponseBody() {}

    public DataPipelineConfiguration dataPipelineConfiguration() {
        return this.dataPipelineConfiguration;
    }
}
