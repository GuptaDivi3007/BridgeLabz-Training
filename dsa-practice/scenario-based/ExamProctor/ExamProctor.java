import java.util.*;

public class ExamProctor {

    private Stack<Integer> navigationStack;
    private Map<Integer, String> answers;

    public ExamProctor() {
        navigationStack = new Stack<>();
        answers = new HashMap<>();
    }

    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
    }

    public void goBack() {
        if (!navigationStack.isEmpty()) {
            navigationStack.pop();
        }
    }

    public void answerQuestion(int questionId, String answer) {
        answers.put(questionId, answer);
    }

    public int submit(Map<Integer, String> correctAnswers) {
        return calculateScore(correctAnswers);
    }

    private int calculateScore(Map<Integer, String> correctAnswers) {
        int score = 0;
        for (int qId : answers.keySet()) {
            if (answers.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
