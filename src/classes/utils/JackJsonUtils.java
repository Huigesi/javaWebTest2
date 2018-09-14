package classes.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JackJsonUtils {
    static ObjectMapper mObjectMapper;

    public static <T> T formJson(String content, Class<T> valueType) {
        if (mObjectMapper == null) {
            mObjectMapper = new ObjectMapper();
        }
        try {
            return mObjectMapper.readValue(content, valueType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String toJson(Object object) {
        if (mObjectMapper == null) {
            mObjectMapper = new ObjectMapper();
        }
        try {
            return mObjectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
