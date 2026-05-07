package com.aliyun.sdk.service.oss2.dataprocess.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonRootName("Image")
public final class Image {

    @JsonProperty("ImageWidth")
    private Long imageWidth;

    @JsonProperty("ImageHeight")
    private Long imageHeight;

    @JsonProperty("EXIF")
    private String exif;

    @JsonProperty("ImageScore")
    private ImageScore imageScore;

    @JacksonXmlElementWrapper(localName = "CroppingSuggestions")
    @JsonProperty("CroppingSuggestion")
    private List<CroppingSuggestion> croppingSuggestions;

    @JacksonXmlElementWrapper(localName = "OCRContents")
    @JsonProperty("OCRContents")
    private List<OCRContents> ocrContents;

    public Image() {}

    private Image(Builder builder) {
        this.imageWidth = builder.imageWidth;
        this.imageHeight = builder.imageHeight;
        this.exif = builder.exif;
        this.imageScore = builder.imageScore;
        this.croppingSuggestions = builder.croppingSuggestions;
        this.ocrContents = builder.ocrContents;
    }

    public Long imageWidth() { return this.imageWidth; }
    public Long imageHeight() { return this.imageHeight; }
    public String exif() { return this.exif; }
    public ImageScore imageScore() { return this.imageScore; }
    public List<CroppingSuggestion> croppingSuggestions() { return this.croppingSuggestions; }
    public List<OCRContents> ocrContents() { return this.ocrContents; }

    public static Builder newBuilder() { return new Builder(); }
    public Builder toBuilder() { return new Builder(this); }

    public static class Builder {
        private Long imageWidth;
        private Long imageHeight;
        private String exif;
        private ImageScore imageScore;
        private List<CroppingSuggestion> croppingSuggestions;
        private List<OCRContents> ocrContents;

        public Builder imageWidth(Long value) { this.imageWidth = value; return this; }
        public Builder imageHeight(Long value) { this.imageHeight = value; return this; }
        public Builder exif(String value) { this.exif = value; return this; }
        public Builder imageScore(ImageScore value) { this.imageScore = value; return this; }
        public Builder croppingSuggestions(List<CroppingSuggestion> value) { this.croppingSuggestions = value; return this; }
        public Builder ocrContents(List<OCRContents> value) { this.ocrContents = value; return this; }

        private Builder() { super(); }

        private Builder(Image from) {
            this.imageWidth = from.imageWidth;
            this.imageHeight = from.imageHeight;
            this.exif = from.exif;
            this.imageScore = from.imageScore;
            this.croppingSuggestions = from.croppingSuggestions;
            this.ocrContents = from.ocrContents;
        }

        public Image build() { return new Image(this); }
    }
}
