import java.util.*;

public class CustomException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            validateAge(age);
            System.out.println("Access granted!");
        }
        catch (InvalidAgeException e) {
            System.out.println("Age must be 18 or above");
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException();
        }
    }

    public static class InvalidAgeException extends Exception {
    }
}
