package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The information about the regions.
 */
@JsonRootName("RegionInfoList")
public final class RegionInfoList {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("RegionInfo")
    private List<RegionInfo> regionInfos;

    public RegionInfoList() {
    }

    private RegionInfoList(Builder builder) {
        this.regionInfos = builder.regionInfos;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * The information about the regions.
     */
    public List<RegionInfo> regionInfos() {
        return this.regionInfos;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private List<RegionInfo> regionInfos;

        private Builder() {
            super();
        }


        private Builder(RegionInfoList from) {
            this.regionInfos = from.regionInfos;
        }

        /**
         * The information about the regions.
         */
        public Builder regionInfos(List<RegionInfo> value) {
            requireNonNull(value);
            this.regionInfos = value;
            return this;
        }

        public RegionInfoList build() {
            return new RegionInfoList(this);
        }
    }
}
