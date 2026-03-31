import java.util.*;

public class ScreeningUtil {

    public static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening for role: " + role.getRoleName());
        }
    }

    public static <T extends JobRole> void evaluateResume(Resume<T> resume) {
        if (resume.isEligible()) {
            System.out.println(resume.getCandidateName() + " selected for " + resume.getJobRole().getRoleName());
        }
        else {
            System.out.println(resume.getCandidateName() + " rejected for " + resume.getJobRole().getRoleName());
        }
    }
}
