import java.lang.reflect.*;
import java.util.*;

public class ObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> data) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : data.entrySet()) {
            Field field = clazz.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj, entry.getValue());
        }
        return obj;
    }
}