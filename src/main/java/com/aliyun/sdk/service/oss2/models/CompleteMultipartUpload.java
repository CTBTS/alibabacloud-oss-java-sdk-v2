package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the content of the CompleteMultipartUpload request.
 */
@JsonRootName("CompleteMultipartUpload")
public final class CompleteMultipartUpload {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Part")
    private List<Part> parts;

    public CompleteMultipartUpload() {
    }

    private CompleteMultipartUpload(Builder builder) {
        this.parts = builder.parts;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * The container that stores the uploaded parts.
     */
    public List<Part> parts() {
        return this.parts;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private List<Part> parts;

        private Builder() {
            super();
        }


        private Builder(CompleteMultipartUpload from) {
            this.parts = from.parts;
        }

        /**
         * The container that stores the uploaded parts.
         */
        public Builder parts(List<Part> value) {
            requireNonNull(value);
            this.parts = value;
            return this;
        }

        public CompleteMultipartUpload build() {
            return new CompleteMultipartUpload(this);
        }
    }
}
