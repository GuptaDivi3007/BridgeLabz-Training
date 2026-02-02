import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class UserDTO {
    @JsonField(name = "user_name")
    String name = "Aryan";
}

public class JsonFieldExample {
    public static void main(String[] args) throws Exception {
        UserDTO u = new UserDTO();
        Field f = UserDTO.class.getDeclaredField("name");
        JsonField jf = f.getAnnotation(JsonField.class);
        System.out.println("{\""+ jf.name() + "\":\""+ f.get(u) + "\"}");
    }
}