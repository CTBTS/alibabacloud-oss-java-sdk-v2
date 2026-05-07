package com.aliyun.sdk.service.oss2.utils;

import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.deser.jackson.JsonNodeDeserializer;
import tools.jackson.databind.deser.std.StdDeserializer;
import tools.jackson.databind.module.SimpleModule;
import tools.jackson.dataformat.xml.XmlMapper;
import tools.jackson.dataformat.xml.deser.FromXmlParser;

public class XmlUtils {

    public static JsonNode getXmlRootElement(byte[] data) {
        XmlMapper xmlMapper = XmlMapper.builderWithJackson2Defaults()
                .addModule(new SimpleModule().addDeserializer(JsonNode.class,
                        new StdDeserializer<>(JsonNode.class) {
                            @Override
                            public JsonNode deserialize(JsonParser p, DeserializationContext ctxt) throws JacksonException {
                                String rootName = ((FromXmlParser) p).getStaxReader().getLocalName();
                                JsonNode inner = JsonNodeDeserializer.getDeserializer(JsonNode.class).deserialize(p, ctxt);
                                return ctxt.getNodeFactory().objectNode().set(rootName, inner);
                            }
                        }))
                .build();
        return xmlMapper.readTree(data);
    }

    public static String escapeText(String key) {
        if (key == null) {
            return "";
        }

        int pos;
        int len = key.length();
        StringBuilder builder = new StringBuilder();
        for (pos = 0; pos < len; pos++) {
            char ch = key.charAt(pos);
            String escapedStr;
            switch (ch) {
                /*
                case '\t':
                    escapedStr = "&#x09;";
                    break;
                case '\n':
                    escapedStr = "&#x00A;";
                    break;
                case '\r':
                    escapedStr = "&#x0D;";
                    break;
                 */
                case '&':
                    escapedStr = "&amp;";
                    break;
                case '\'':
                    escapedStr = "&apos;";
                    break;
                case '"':
                    escapedStr = "&quot;";
                    break;
                case '<':
                    escapedStr = "&lt;";
                    break;
                case '>':
                    escapedStr = "&gt;";
                    break;
                default:
                    if (ch < 0x20) {
                        escapedStr = "&#x" + Integer.toHexString(ch) + ";";
                    } else {
                        escapedStr = null;
                    }
                    break;
            }

            if (escapedStr != null) {
                builder.append(escapedStr);
            } else {
                builder.append(ch);
            }
        }

        return builder.toString();
    }

}
