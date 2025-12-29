import java.util.*;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean found = false;

        while (!found) {
            int guess = generateGuess(low, high);
            System.out.println(guess);

            String feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("correct")) {
                found = true;
            }
            else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            }
            else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }

    public static int generateGuess(int min, int max) {
        return (min + max) / 2;
    }

    public static String getFeedback(Scanner sc) {
        return sc.next();
    }
}
