import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Aryan Jain")
class Book {}

public class AnnotationReflection {

    public static void main(String[] args) {

        Author author = Book.class.getAnnotation(Author.class);
        System.out.println("Author: " + author.name());
    }
}