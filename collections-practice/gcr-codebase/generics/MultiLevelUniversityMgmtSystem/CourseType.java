public abstract class CourseType {

    private final String evaluationMode;

    public CourseType(String evaluationMode) {
        this.evaluationMode = evaluationMode;
    }

    public final String getEvaluationMode() {
        return evaluationMode;
    }
}
