package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * The container that stores the redirection rules.  You must specify at least one of the following containers: IndexDocument, ErrorDocument, and RoutingRules.
 */
@JsonRootName("RoutingRules")
public final class RoutingRules {  
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("RoutingRule")
    private List<RoutingRule> routingRules;

    public RoutingRules() {}

    private RoutingRules(Builder builder) { 
        this.routingRules = builder.routingRules; 
    }

    /**
    * The specified redirection rule or mirroring-based back-to-origin rule. You can specify up to 20 rules.
    */
    public List<RoutingRule> routingRules() {
        return this.routingRules;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private List<RoutingRule> routingRules;
        
        /**
        * The specified redirection rule or mirroring-based back-to-origin rule. You can specify up to 20 rules.
        */
        public Builder routingRules(List<RoutingRule> value) {
            requireNonNull(value);
            this.routingRules = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(RoutingRules from) { 
            this.routingRules = from.routingRules; 
        }

        public RoutingRules build() {
            return new RoutingRules(this);
        }
    }
}
