package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The rules for setting tags when saving files during mirror-based back-to-origin.
 */
@JsonRootName("MirrorTaggings")
public final class MirrorTaggings {  
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Taggings")
    private List<MirrorTagging> taggings;

    public MirrorTaggings() {}

    private MirrorTaggings(Builder builder) { 
        this.taggings = builder.taggings;
    }

    /**
    * The rule list for setting tags.
    */
    public List<MirrorTagging> taggings() {
        return this.taggings;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<MirrorTagging> taggings;
        
        /**
        * The rule list for setting tags.
        */
        public Builder taggings(List<MirrorTagging> value) {
            requireNonNull(value);
            this.taggings = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(MirrorTaggings from) { 
            this.taggings = from.taggings;
        }

        public MirrorTaggings build() {
            return new MirrorTaggings(this);
        }
    }
}
