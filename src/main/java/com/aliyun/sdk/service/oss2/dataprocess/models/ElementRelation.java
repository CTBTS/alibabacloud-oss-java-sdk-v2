package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("ElementRelation")
public final class ElementRelation {

    @JsonProperty("Type")
    private String type;

    @JsonProperty("ObjectId")
    private String objectId;

    public ElementRelation() {
    }

    private ElementRelation(Builder builder) {
        this.type = builder.type;
        this.objectId = builder.objectId;
    }

    public String type() {
        return this.type;
    }

    public String objectId() {
        return this.objectId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String type;
        private String objectId;

        public Builder type(String value) {
            this.type = value;
            return this;
        }

        public Builder objectId(String value) {
            this.objectId = value;
            return this;
        }

        private Builder() {
            super();
        }

        private Builder(ElementRelation from) {
            this.type = from.type;
            this.objectId = from.objectId;
        }

        public ElementRelation build() {
            return new ElementRelation(this);
        }
    }
}
