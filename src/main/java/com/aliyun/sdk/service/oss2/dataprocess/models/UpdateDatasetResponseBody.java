package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * XML response body for the UpdateDataset operation.
 */
@JsonRootName("UpdateDatasetResult")
public final class UpdateDatasetResponseBody {
    @JsonProperty("Dataset")
    private Dataset dataset;

    public UpdateDatasetResponseBody() {}

    public Dataset dataset() {
        return this.dataset;
    }
}
