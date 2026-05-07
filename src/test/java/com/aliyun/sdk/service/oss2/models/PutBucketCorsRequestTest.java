package com.aliyun.sdk.service.oss2.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.dataformat.xml.XmlMapper;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class PutBucketCorsRequestTest {

    @Test
    public void emptyBuilder() {
        PutBucketCorsRequest request = PutBucketCorsRequest.newBuilder().build();
        assertEquals(0, request.headers().size());
        assertEquals(0, request.parameters().size());
        assertNull(request.bucket());
    }

    @Test
    public void fullBuilder() {
        PutBucketCorsRequest request = PutBucketCorsRequest.newBuilder()
                .bucket("bucket")
                .header("x-header-value", "value1")
                .header("x-header-value", "value2")
                .parameter("empty-param", "")
                .parameter("null-param", null)
                .parameter("str-param", "value")
                .build();

        assertThat(request.bucket()).isEqualTo("bucket");
        assertEquals(1, request.headers().size());
        Assertions.assertThat(request.headers()).contains(
                new AbstractMap.SimpleEntry<>("x-header-value", "value2"));
        assertEquals(1, request.headers().size());
        assertThat(request.parameters()).contains(
                new AbstractMap.SimpleEntry<>("empty-param", ""),
                new AbstractMap.SimpleEntry<>("str-param", "value")
        );
        assertNull(request.parameters().get("null-param"));

        //to builder
        PutBucketCorsRequest.Builder builder = request.toBuilder();
        request = builder
                .header("x-header-value", "value1")
                .parameters(new HashMap<>())
                .build();

        assertThat(request.bucket()).isEqualTo("bucket");
        assertEquals(1, request.headers().size());
        Assertions.assertThat(request.headers()).contains(
                new AbstractMap.SimpleEntry<>("x-header-value", "value1"));
        assertThat(request.parameters()).contains(
                new AbstractMap.SimpleEntry<>("empty-param", ""),
                new AbstractMap.SimpleEntry<>("str-param", "value")
        );
    }

    @Test
    public void xmlBuilder() {
        ObjectMapper xmlMapper = XmlMapper.builderWithJackson2Defaults()
                .changeDefaultPropertyInclusion(v -> v.withValueInclusion(JsonInclude.Include.NON_NULL)
                        .withContentInclusion(JsonInclude.Include.NON_NULL))
                .build();
        CORSConfiguration config = CORSConfiguration.newBuilder()
                .corsRules(Arrays.asList(
                        CORSRule.newBuilder()
                                .allowedOrigins(Collections.singletonList("*"))
                                .allowedMethods(Arrays.asList("PUT", "GET"))
                                .allowedHeaders(Collections.singletonList("Authorization"))
                                .build(),
                        CORSRule.newBuilder()
                                .allowedOrigins(Arrays.asList("http://example.com", "http://example.net"))
                                .allowedMethods(Collections.singletonList("GET"))
                                .allowedHeaders(Collections.singletonList("Authorization"))
                                .exposeHeaders(Arrays.asList("x-oss-test", "x-oss-test1"))
                                .maxAgeSeconds(100L)
                                .build())
                )
                .responseVary(false)
                .build();

        String xml = xmlMapper.writeValueAsString(config);


        CORSConfiguration value = xmlMapper.readValue(xml, CORSConfiguration.class);

        assertFalse(value.responseVary());
    }
}
