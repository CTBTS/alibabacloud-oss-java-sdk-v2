package com.aliyun.sdk.service.oss2.models.internal;

import com.aliyun.sdk.service.oss2.models.BucketSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.List;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the information about multiple buckets.
 */
@JsonRootName("Buckets")
public final class BucketsXml {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Bucket")
    private List<BucketSummary> buckets;

    public BucketsXml() {
    }

    private BucketsXml(Builder builder) {
        this.buckets = builder.buckets;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * The container that stores the information list of multiple buckets.
     */
    public List<BucketSummary> buckets() {
        return this.buckets;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private List<BucketSummary> buckets;

        private Builder() {
            super();
        }


        private Builder(BucketsXml from) {
            this.buckets = from.buckets;
        }

        /**
         * The container that stores the information list of multiple buckets.
         */
        public Builder buckets(List<BucketSummary> value) {
            requireNonNull(value);
            this.buckets = value;
            return this;
        }

        public BucketsXml build() {
            return new BucketsXml(this);
        }
    }
}
