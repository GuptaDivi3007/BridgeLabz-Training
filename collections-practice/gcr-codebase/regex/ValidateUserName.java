import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateUserName {

    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    
    public static boolean isValid(String username) {
        if (username.length() < 5 || username.length() > 15) {
            return false;
        }
        Matcher matcher = USERNAME_PATTERN.matcher(username);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] testCases = {"nova", "123user", "you"};
        
        for (String test : testCases) {
            if (isValid(test)) {
                System.out.println("\"" + test + "\" → Valid");
            }
            else {
                System.out.println("\"" + test + "\" → Invalid");
            }
        }
        System.out.print("Enter a username to validate: ");
        String input = sc.nextLine();
        if (isValid(input)) {
            System.out.println("Valid username");
        }
        else {
            System.out.println("Invalid username");
        }
        
        sc.close();
    }
}
