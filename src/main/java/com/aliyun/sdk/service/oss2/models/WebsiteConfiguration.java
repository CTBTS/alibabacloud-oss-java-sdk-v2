package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * The root node for website configuration.
 */
@JsonRootName("WebsiteConfiguration")
public final class WebsiteConfiguration {  
    @JsonProperty("RoutingRules")
    private RoutingRules routingRules;
 
    @JsonProperty("IndexDocument")
    private IndexDocument indexDocument;
 
    @JsonProperty("ErrorDocument")
    private ErrorDocument errorDocument;

    public WebsiteConfiguration() {}

    private WebsiteConfiguration(Builder builder) { 
        this.routingRules = builder.routingRules; 
        this.indexDocument = builder.indexDocument; 
        this.errorDocument = builder.errorDocument; 
    }

    /**
    * The container that stores the redirection rules.  You must specify at least one of the following containers: IndexDocument, ErrorDocument, and RoutingRules.
    */
    public RoutingRules routingRules() {
        return this.routingRules;
    }

    /**
    * The container that stores the default homepage.  You must specify at least one of the following containers: IndexDocument, ErrorDocument, and RoutingRules.
    */
    public IndexDocument indexDocument() {
        return this.indexDocument;
    }

    /**
    * The container that stores the default 404 page.  You must specify at least one of the following containers: IndexDocument, ErrorDocument, and RoutingRules.
    */
    public ErrorDocument errorDocument() {
        return this.errorDocument;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private RoutingRules routingRules;
        private IndexDocument indexDocument;
        private ErrorDocument errorDocument;
        
        /**
        * The container that stores the redirection rules.  You must specify at least one of the following containers: IndexDocument, ErrorDocument, and RoutingRules.
        */
        public Builder routingRules(RoutingRules value) {
            requireNonNull(value);
            this.routingRules = value;
            return this;
        }
        
        /**
        * The container that stores the default homepage.  You must specify at least one of the following containers: IndexDocument, ErrorDocument, and RoutingRules.
        */
        public Builder indexDocument(IndexDocument value) {
            requireNonNull(value);
            this.indexDocument = value;
            return this;
        }
        
        /**
        * The container that stores the default 404 page.  You must specify at least one of the following containers: IndexDocument, ErrorDocument, and RoutingRules.
        */
        public Builder errorDocument(ErrorDocument value) {
            requireNonNull(value);
            this.errorDocument = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(WebsiteConfiguration from) { 
            this.routingRules = from.routingRules; 
            this.indexDocument = from.indexDocument; 
            this.errorDocument = from.errorDocument; 
        }

        public WebsiteConfiguration build() {
            return new WebsiteConfiguration(this);
        }
    }
}
