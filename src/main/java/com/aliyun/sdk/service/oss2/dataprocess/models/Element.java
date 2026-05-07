package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonRootName("Element")
public final class Element {

    @JacksonXmlElementWrapper(localName = "ElementContents")
    @JsonProperty("ElementContent")
    private List<ElementContent> elementContents;

    @JsonProperty("ObjectId")
    private String objectId;

    @JsonProperty("ElementType")
    private String elementType;

    @JsonProperty("SemanticSimilarity")
    private Float semanticSimilarity;

    @JacksonXmlElementWrapper(localName = "ElementRelations")
    @JsonProperty("ElementRelation")
    private List<ElementRelation> elementRelations;

    public Element() {}

    private Element(Builder builder) {
        this.elementContents = builder.elementContents;
        this.objectId = builder.objectId;
        this.elementType = builder.elementType;
        this.semanticSimilarity = builder.semanticSimilarity;
        this.elementRelations = builder.elementRelations;
    }

    public List<ElementContent> elementContents() { return this.elementContents; }
    public String objectId() { return this.objectId; }
    public String elementType() { return this.elementType; }
    public Float semanticSimilarity() { return this.semanticSimilarity; }
    public List<ElementRelation> elementRelations() { return this.elementRelations; }

    public static Builder newBuilder() { return new Builder(); }
    public Builder toBuilder() { return new Builder(this); }

    public static class Builder {
        private List<ElementContent> elementContents;
        private String objectId;
        private String elementType;
        private Float semanticSimilarity;
        private List<ElementRelation> elementRelations;

        public Builder elementContents(List<ElementContent> value) { this.elementContents = value; return this; }
        public Builder objectId(String value) { this.objectId = value; return this; }
        public Builder elementType(String value) { this.elementType = value; return this; }
        public Builder semanticSimilarity(Float value) { this.semanticSimilarity = value; return this; }
        public Builder elementRelations(List<ElementRelation> value) { this.elementRelations = value; return this; }

        private Builder() { super(); }

        private Builder(Element from) {
            this.elementContents = from.elementContents;
            this.objectId = from.objectId;
            this.elementType = from.elementType;
            this.semanticSimilarity = from.semanticSimilarity;
            this.elementRelations = from.elementRelations;
        }

        public Element build() { return new Element(this); }
    }
}
