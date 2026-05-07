package com.aliyun.sdk.service.oss2.utils;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

public class JsonUtils {

    public static JsonNode getJsonRootElement(byte[] data) {
        JsonMapper objectMapper = JsonMapper.builderWithJackson2Defaults().build();
        return objectMapper.readTree(data);
    }

    private JsonUtils(){}
}
