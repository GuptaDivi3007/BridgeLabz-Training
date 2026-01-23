import java.time.LocalDate;
import java.util.*;

public class PolicyService {

    private PolicyRepository repository = new PolicyRepository();

    public void addPolicy(Policy policy) {
        repository.addPolicy(policy);
    }

    public void displayAllPolicies() {
        repository.getHashSet().forEach(System.out::println);
    }

    public void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        repository.getTreeSet().stream()
            .filter(p -> !p.getExpiryDate().isAfter(limit))
            .forEach(System.out::println);
    }

    public void policiesByCoverage(String coverage) {
        repository.getHashSet().stream()
            .filter(p -> p.getCoverageType().equalsIgnoreCase(coverage))
            .forEach(System.out::println);
    }

    public void performanceTest(Policy sample) {

        long start = System.nanoTime();
        repository.getHashSet().contains(sample);
        System.out.println("HashSet search time: " +
                (System.nanoTime() - start));

        start = System.nanoTime();
        repository.getLinkedHashSet().contains(sample);
        System.out.println("LinkedHashSet search time: " +
                (System.nanoTime() - start));

        start = System.nanoTime();
        repository.getTreeSet().contains(sample);
        System.out.println("TreeSet search time: " +
                (System.nanoTime() - start));
    }
}