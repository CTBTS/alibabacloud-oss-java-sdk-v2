package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the information about all access points.
 */
@JsonRootName("AccessPoints")
public final class AccessPoints {  
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("AccessPoint")
    private List<AccessPoint> accessPoint;

    public AccessPoints() {}

    private AccessPoints(Builder builder) { 
        this.accessPoint = builder.accessPoint; 
    }

    /**
    * The container that stores the information about all access point.
    */
    public List<AccessPoint> accessPoint() {
        return this.accessPoint;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<AccessPoint> accessPoint;
        
        /**
        * The container that stores the information about all access point.
        */
        public Builder accessPoint(List<AccessPoint> value) {
            requireNonNull(value);
            this.accessPoint = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(AccessPoints from) { 
            this.accessPoint = from.accessPoint; 
        }

        public AccessPoints build() {
            return new AccessPoints(this);
        }
    }
}
