package PasswordStrengthValidator;

public class Main {
	public static void main(String[] args) {

        String password1 = "Pass@123";
        String password2 = "password";
        String password3 = "Admin@2024";

        checkPassword(password1);
        checkPassword(password2);
        checkPassword(password3);
    }

    static void checkPassword(String password) {

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password: " + password);
        } else {
            System.out.println("Weak Password: " + password);
        }
    }
}
