import java.util.*;

public class Main {

    public static void main(String[] args) {
        ExamProctor exam = new ExamProctor();

        exam.visitQuestion(1);
        exam.answerQuestion(1, "A");

        exam.visitQuestion(2);
        exam.answerQuestion(2, "C");

        exam.visitQuestion(3);
        exam.answerQuestion(3, "B");

        exam.goBack();
        exam.answerQuestion(2, "B");

        Map<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "B");

        int score = exam.submit(correctAnswers);
        System.out.println("Final Score: " + score);
    }
}
