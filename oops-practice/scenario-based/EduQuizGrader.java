import java.util.*;

public class EduQuizGrader {

    static int calculateScore(String[] correct, String[] student) {
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (student[i].equalsIgnoreCase(correct[i])) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] correctAnswers = {
            "A", "C", "B", "D", "A",
            "B", "C", "D", "A", "C"
        };

        String[] studentAnswers = new String[10];

        for (int i = 0; i < studentAnswers.length; i++) {
            System.out.print("Enter answer for Question " + (i + 1) + ": ");
            studentAnswers[i] = sc.nextLine().trim();
        }

        int score = calculateScore(correctAnswers, studentAnswers);

        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
            }
            else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }

        double percentage = (score / 10.0) * 100;

        System.out.println("Score: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 50) {
            System.out.println("Result: Pass");
        }
        else {
            System.out.println("Result: Fail");
        }
    }
}
