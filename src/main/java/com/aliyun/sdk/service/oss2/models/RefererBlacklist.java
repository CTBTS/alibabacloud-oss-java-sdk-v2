package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the Referer blacklist.
 */
@JsonRootName("RefererBlacklist")
public final class RefererBlacklist {  
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Referer")
    private List<String> referers;

    public RefererBlacklist() {}

    private RefererBlacklist(Builder builder) { 
        this.referers = builder.referers; 
    }

    /**
    * The addresses in the Referer blacklist.
    */
    public List<String> referers() {
        return this.referers;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<String> referers;
        
        /**
        * The addresses in the Referer blacklist.
        */
        public Builder referers(List<String> value) {
            requireNonNull(value);
            this.referers = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(RefererBlacklist from) { 
            this.referers = from.referers; 
        }

        public RefererBlacklist build() {
            return new RefererBlacklist(this);
        }
    }
}
