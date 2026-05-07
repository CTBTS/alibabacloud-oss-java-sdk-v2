package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * XML response body for the CreateDataset operation.
 */
@JsonRootName("CreateDatasetResult")
public final class CreateDatasetResponseBody {
    @JsonProperty("Dataset")
    private Dataset dataset;

    public CreateDatasetResponseBody() {}

    public Dataset dataset() {
        return this.dataset;
    }
}
