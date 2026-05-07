package com.aliyun.sdk.service.oss2.models;

import com.aliyun.sdk.service.oss2.OperationInput;
import com.aliyun.sdk.service.oss2.transform.SerdeBucketMetaquery;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;

import static org.assertj.core.api.Assertions.assertThat;

public class GetMetaQueryStatusRequestTest {

    @Test
    public void testEmptyBuilder() {
        GetMetaQueryStatusRequest request = GetMetaQueryStatusRequest.newBuilder().build();
        assertThat(request).isNotNull();
        assertThat(request.headers()).isNotNull();
        assertThat(request.headers().isEmpty()).isTrue();
        assertThat(request.parameters()).isNotNull();
        assertThat(request.parameters().isEmpty()).isTrue();
        assertThat(request.bucket()).isNull();
    }

    @Test
    public void testFullBuilder() {
        GetMetaQueryStatusRequest request = GetMetaQueryStatusRequest.newBuilder()
                .bucket("examplebucket")
                .header("x-header-value", "value1")
                .header("x-header-value", "value2")
                .parameter("empty-param", "")
                .parameter("null-param", null)
                .parameter("str-param", "value")
                .build();

        assertThat(request.bucket()).isEqualTo("examplebucket");
        assertThat(request.headers()).contains(
                new AbstractMap.SimpleEntry<>("x-header-value", "value2"));
        assertThat(request.parameters()).contains(
                new AbstractMap.SimpleEntry<>("empty-param", ""),
                new AbstractMap.SimpleEntry<>("str-param", "value")
        );
        assertThat(request.parameters().get("null-param")).isNull();

        // to builder
        GetMetaQueryStatusRequest copy = request.toBuilder().build();
        assertThat(copy.bucket()).isEqualTo("examplebucket");
        assertThat(copy.headers()).contains(
                new AbstractMap.SimpleEntry<>("x-header-value", "value2"));
        assertThat(copy.parameters()).contains(
                new AbstractMap.SimpleEntry<>("empty-param", ""),
                new AbstractMap.SimpleEntry<>("str-param", "value")
        );
    }

    @Test
    public void testToBuilderPreserveState() {
        GetMetaQueryStatusRequest original = GetMetaQueryStatusRequest.newBuilder()
                .bucket("test-bucket")
                .build();

        GetMetaQueryStatusRequest copy = original.toBuilder().build();

        assertThat(copy.bucket()).isEqualTo("test-bucket");
    }

    @Test
    public void testHeaderProperties() {
        GetMetaQueryStatusRequest request = GetMetaQueryStatusRequest.newBuilder()
                .bucket("status-bucket")
                .build();

        assertThat(request.bucket()).isEqualTo("status-bucket");
    }

    @Test
    public void xmlBuilder() {
        GetMetaQueryStatusRequest request = GetMetaQueryStatusRequest.newBuilder()
                .bucket("xml-bucket")
                .build();

        OperationInput input = SerdeBucketMetaquery.fromGetMetaQueryStatus(request);

        assertThat(input.bucket().get()).isEqualTo("xml-bucket");
        assertThat(input.parameters().get("metaQuery")).isEqualTo("");

    }
}