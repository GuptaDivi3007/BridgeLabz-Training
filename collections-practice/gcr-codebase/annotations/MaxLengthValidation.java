import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(5)
    String username;

    User(String username) {
        if (username.length() > 5)
            throw new IllegalArgumentException("Too long");
        this.username = username;
    }
}

public class MaxLengthValidation {
    public static void main(String[] args) {
        new User("Aryan");
    }
}