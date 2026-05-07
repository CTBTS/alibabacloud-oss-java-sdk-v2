package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonRootName("WorkflowParameters")
public final class WorkflowParameters {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("WorkflowParameter")
    private List<WorkflowParameter> workflowParameters;

    public WorkflowParameters() {
    }

    private WorkflowParameters(Builder builder) {
        this.workflowParameters = builder.workflowParameters;
    }

    public List<WorkflowParameter> workflowParameters() {
        return this.workflowParameters;
    }


    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private List<WorkflowParameter> workflowParameters;

        public Builder workflowParameters(List<WorkflowParameter> value) {
            this.workflowParameters = value;
            return this;
        }


        private Builder() {
            super();
        }

        private Builder(WorkflowParameters from) {
            this.workflowParameters = from.workflowParameters;
        }

        public WorkflowParameters build() {
            return new WorkflowParameters(this);
        }
    }
}
