public class Resume<T extends JobRole> {

    private final String candidateName;
    private final int score;
    private final T jobRole;

    public Resume(String candidateName, int score, T jobRole) {
        this.candidateName = candidateName;
        this.score = score;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getScore() {
        return score;
    }

    public T getJobRole() {
        return jobRole;
    }

    public boolean isEligible() {
        return score >= jobRole.getMinimumScore();
    }
}
