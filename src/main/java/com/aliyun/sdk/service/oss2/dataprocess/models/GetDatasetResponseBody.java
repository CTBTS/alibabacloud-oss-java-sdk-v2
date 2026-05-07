package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * XML response body for the GetDataset operation.
 */
@JsonRootName("GetDatasetResponse")
public final class GetDatasetResponseBody {
    @JsonProperty("Dataset")
    private Dataset dataset;

    public GetDatasetResponseBody() {}

    public Dataset dataset() {
        return this.dataset;
    }
}
