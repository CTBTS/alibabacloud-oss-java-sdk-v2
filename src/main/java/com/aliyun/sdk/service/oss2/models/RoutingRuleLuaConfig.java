package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import static java.util.Objects.requireNonNull;

/**
 * Lua script config for the routing rule.
 */
@JsonRootName("RoutingRuleLuaConfig")
public final class RoutingRuleLuaConfig {  
    @JsonProperty("Script")
    private String script;

    public RoutingRuleLuaConfig() {}

    private RoutingRuleLuaConfig(Builder builder) { 
        this.script = builder.script; 
    }

    /**
    * The name of the Lua script.
    */
    public String script() {
        return this.script;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder { 
        private String script;
        
        /**
        * The name of the Lua script.
        */
        public Builder script(String value) {
            requireNonNull(value);
            this.script = value;
            return this;
        }
        

        private Builder() {
            super();
        }

        private Builder(RoutingRuleLuaConfig from) { 
            this.script = from.script; 
        }

        public RoutingRuleLuaConfig build() {
            return new RoutingRuleLuaConfig(this);
        }
    }
}
