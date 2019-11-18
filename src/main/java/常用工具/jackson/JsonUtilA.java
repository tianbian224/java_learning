package 常用工具.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author cang.lv
 * @date 2019/11/12 0012 22:25
 */
public class JsonUtilA {
    private static final Logger log = LoggerFactory.getLogger(JsonUtilA.class);

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static <T> String encode(T object) {
        if (object == null) {
            //防止为null时返回"null"
            return null;
        }
        try {
            return MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("{}", e);
            return null;
        }

    }

    public static <T> T decode(String json, Class<T> clazz) {
        try {
            return MAPPER.readValue(json, clazz);
        } catch (IOException e) {
            log.error("{}", e);
            return null;
        }
    }


}
