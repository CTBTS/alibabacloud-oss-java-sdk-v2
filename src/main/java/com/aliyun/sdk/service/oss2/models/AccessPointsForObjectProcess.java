package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores information about all Object FC Access Points.
 */
@JsonRootName("AccessPointsForObjectProcess")
public final class AccessPointsForObjectProcess {  
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("AccessPointForObjectProcess")
    private List<AccessPointForObjectProcess> accessPointForObjectProcess;

    public AccessPointsForObjectProcess() {}

    private AccessPointsForObjectProcess(Builder builder) { 
        this.accessPointForObjectProcess = builder.accessPointForObjectProcess;
    }

    /**
    * The container that stores information about a single Object FC Access Point.
    */
    public List<AccessPointForObjectProcess> accessPointForObjectProcess() {
        return this.accessPointForObjectProcess;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<AccessPointForObjectProcess> accessPointForObjectProcess;
        
        /**
        * The container that stores information about a single Object FC Access Point.
        */
        public Builder accessPointForObjectProcess(List<AccessPointForObjectProcess> value) {
            requireNonNull(value);
            this.accessPointForObjectProcess = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(AccessPointsForObjectProcess from) { 
            this.accessPointForObjectProcess = from.accessPointForObjectProcess;
        }

        public AccessPointsForObjectProcess build() {
            return new AccessPointsForObjectProcess(this);
        }
    }
}
