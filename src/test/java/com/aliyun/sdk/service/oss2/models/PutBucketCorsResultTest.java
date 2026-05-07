package com.aliyun.sdk.service.oss2.models;

import com.aliyun.sdk.service.oss2.OperationOutput;
import com.aliyun.sdk.service.oss2.transform.SerdeUtils;
import org.junit.Assert;
import org.junit.Test;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.dataformat.xml.XmlMapper;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertNotNull;

public class PutBucketCorsResultTest {

    @Test
    public void testEmptyBuilder() {
        PutBucketCorsResult result = PutBucketCorsResult.newBuilder().build();
        Assert.assertEquals(0, result.headers().size());
        assertNotNull(result);
    }


    @Test
    public void testXmlParsing() throws Exception {
        String xml = "";

        OperationOutput output = new OperationOutput.Builder()
                .body(SerdeUtils.serializeXmlBody(xml))
                .build();

        ObjectMapper xmlMapper = XmlMapper.builderWithJackson2Defaults().build();

        String xmlContent = new String(output.body.toBytes(), StandardCharsets.UTF_8);
        Object innerBody = xmlMapper.readValue(xmlContent, CORSConfiguration.class);
        GetBucketCorsResult result = GetBucketCorsResult.newBuilder()
                .innerBody(innerBody)
                .build();
        CORSConfiguration config = result.corsConfiguration();

        assertNotNull(config);
    }
}
