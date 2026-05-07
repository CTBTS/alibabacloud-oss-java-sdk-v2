package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * Container to store the rules for setting response headers in mirror-based back-to-origin.
 */
@JsonRootName("MirrorReturnHeaders")
public final class MirrorReturnHeaders {  
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("ReturnHeader")
    private List<MirrorReturnHeader> returnHeaders;

    public MirrorReturnHeaders() {}

    private MirrorReturnHeaders(Builder builder) { 
        this.returnHeaders = builder.returnHeaders; 
    }

    /**
    * The rule list for setting response headers in mirror-based back-to-origin.
    */
    public List<MirrorReturnHeader> returnHeaders() {
        return this.returnHeaders;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<MirrorReturnHeader> returnHeaders;
        
        /**
        * The rule list for setting response headers in mirror-based back-to-origin.
        */
        public Builder returnHeaders(List<MirrorReturnHeader> value) {
            requireNonNull(value);
            this.returnHeaders = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(MirrorReturnHeaders from) { 
            this.returnHeaders = from.returnHeaders; 
        }

        public MirrorReturnHeaders build() {
            return new MirrorReturnHeaders(this);
        }
    }
}
