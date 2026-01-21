import java.util.*;

public class Main {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 = new Resume<>("Amit", 72, new SoftwareEngineer());

        Resume<DataScientist> r2 = new Resume<>("Neha", 70, new DataScientist());

        Resume<ProductManager> r3 = new Resume<>("Rohit", 68, new ProductManager());

        ScreeningUtil.evaluateResume(r1);
        ScreeningUtil.evaluateResume(r2);
        ScreeningUtil.evaluateResume(r3);

        List<JobRole> pipeline = new ArrayList<>();
        pipeline.add(new SoftwareEngineer());
        pipeline.add(new DataScientist());
        pipeline.add(new ProductManager());

        ScreeningUtil.screenResumes(pipeline);
    }
}
