import java.lang.reflect.*;

class User {
    String name = "Aryan";
    int age = 22;
}

public class ObjectToJson {

    public static void main(String[] args) throws Exception {

        User user = new User();
        StringBuilder json = new StringBuilder("{");

        Field[] fields = User.class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            json.append("\"").append(fields[i].getName()).append("\":\"")
                .append(fields[i].get(user)).append("\"");
            if (i < fields.length - 1) json.append(", ");
        }
        json.append("}");

        System.out.println(json);
    }
}