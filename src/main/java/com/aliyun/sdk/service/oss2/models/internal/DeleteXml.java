package com.aliyun.sdk.service.oss2.models.internal;


import com.aliyun.sdk.service.oss2.models.DeleteObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.List;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

/**
 * The XML representation of DeleteMultipleObjects request for serialization.
 */
@JsonRootName("Delete")
public class DeleteXml {
    @JsonProperty("Quiet")
    public Boolean quiet;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Object")
    public List<DeleteObject> objects;

    public DeleteXml() {
    }

    public DeleteXml(Boolean quiet, List<DeleteObject> objects) {
        this.quiet = quiet;
        this.objects = objects;
    }
}