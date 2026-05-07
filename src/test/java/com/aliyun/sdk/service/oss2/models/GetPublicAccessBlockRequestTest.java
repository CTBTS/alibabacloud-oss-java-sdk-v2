package com.aliyun.sdk.service.oss2.models;

import com.aliyun.sdk.service.oss2.OperationInput;
import com.aliyun.sdk.service.oss2.transform.SerdePublicAccessBlock;
import com.aliyun.sdk.service.oss2.utils.MapUtils;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.dataformat.xml.XmlMapper;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class GetPublicAccessBlockRequestTest {
    @Test
    public void testEmptyBuilder() {
        GetPublicAccessBlockRequest request = GetPublicAccessBlockRequest.newBuilder().build();
        assertThat(request).isNotNull();
        assertThat(request.headers()).isNotNull();
        assertThat(request.headers().isEmpty()).isTrue();
        assertThat(request.parameters()).isNotNull();
        assertThat(request.parameters().isEmpty()).isTrue();
    }

    @Test
    public void testFullBuilder() {
        Map<String, String> headers = MapUtils.of(
                "x-oss-request-id", "req-1234567890abcdefg",
                "ETag", "\"B5eJF1ptWaXm4bijSPyxw==\""
        );

        GetPublicAccessBlockRequest request = GetPublicAccessBlockRequest.newBuilder()
                .headers(headers)
                .parameter("param1", "value1")
                .parameter("param2", "value2")
                .build();

        assertThat(request.headers().get("x-oss-request-id")).isEqualTo("req-1234567890abcdefg");
        assertThat(request.headers().get("ETag")).isEqualTo("\"B5eJF1ptWaXm4bijSPyxw==\"");
        assertThat(request.parameters()).contains(
                new java.util.AbstractMap.SimpleEntry<>("param1", "value1"),
                new java.util.AbstractMap.SimpleEntry<>("param2", "value2")
        );
    }

    @Test
    public void testToBuilderPreserveState() {
        Map<String, String> headers = MapUtils.of(
                "x-oss-request-id", "req-765432109876543210",
                "ETag", "\"original-etag\""
        );

        GetPublicAccessBlockRequest original = GetPublicAccessBlockRequest.newBuilder()
                .headers(headers)
                .parameter("param3", "value3")
                .parameter("param4", "value4")
                .build();

        GetPublicAccessBlockRequest copy = original.toBuilder().build();

        assertThat(copy.headers().get("x-oss-request-id")).isEqualTo("req-765432109876543210");
        assertThat(copy.headers().get("ETag")).isEqualTo("\"original-etag\"");
        assertThat(copy.parameters()).contains(
                new java.util.AbstractMap.SimpleEntry<>("param3", "value3"),
                new java.util.AbstractMap.SimpleEntry<>("param4", "value4")
        );
    }


    @Test
    public void xmlBuilder() {
        ObjectMapper xmlMapper = XmlMapper.builderWithJackson2Defaults()
                .changeDefaultPropertyInclusion(v -> v.withValueInclusion(JsonInclude.Include.NON_NULL)
                        .withContentInclusion(JsonInclude.Include.NON_NULL))
                .build();

        PublicAccessBlockConfiguration config = PublicAccessBlockConfiguration.newBuilder()
                .blockPublicAccess(true)
                .build();

        PutPublicAccessBlockRequest request = PutPublicAccessBlockRequest.newBuilder()
                .publicAccessBlockConfiguration(config)
                .build();

        OperationInput input = SerdePublicAccessBlock.fromPutPublicAccessBlock(request);

        assertThat(input.parameters().get("publicAccessBlock")).isEqualTo("");
        assertThat(input.headers().get("Content-Type")).isEqualTo("application/xml");

        // Verify the XML body content
        String xmlContent = new String(input.body().get().toBytes(), java.nio.charset.StandardCharsets.UTF_8);
        assertThat(xmlContent).contains("<PublicAccessBlockConfiguration>");
        assertThat(xmlContent).contains("<BlockPublicAccess>true</BlockPublicAccess>");
        assertThat(xmlContent).contains("</PublicAccessBlockConfiguration>");
    }
}