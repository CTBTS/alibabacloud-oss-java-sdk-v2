package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

/**
 * XML response body for the SimpleQuery operation.
 */
@JsonRootName("SimpleQueryResult")
public final class SimpleQueryResponseBody {
    @JsonProperty("NextToken")
    private String nextToken;

    @JacksonXmlElementWrapper(localName = "Files")
    @JsonProperty("File")
    private List<File> files;

    @JacksonXmlElementWrapper(localName = "Aggregations")
    @JsonProperty("Aggregation")
    private List<AggregationInfo> aggregations;

    @JsonProperty("TotalHits")
    private Long totalHits;

    public SimpleQueryResponseBody() {}

    public String nextToken() {
        return this.nextToken;
    }

    public List<File> files() {
        return this.files;
    }

    public List<AggregationInfo> aggregations() {
        return this.aggregations;
    }

    public Long totalHits() {
        return this.totalHits;
    }
}
