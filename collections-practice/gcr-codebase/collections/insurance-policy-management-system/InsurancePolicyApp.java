import java.time.LocalDate;

public class InsurancePolicyApp {

    public static void main(String[] args) {

        PolicyService service = new PolicyService();

        Policy p1 = new Policy("P101", "Aryan",
                LocalDate.now().plusDays(20),
                "Health", 5000);

        Policy p2 = new Policy("P102", "Ravi",
                LocalDate.now().plusDays(60),
                "Auto", 3000);

        Policy p3 = new Policy("P103", "Neha",
                LocalDate.now().plusDays(10),
                "Home", 4500);

        Policy duplicate = new Policy("P101", "Aryan",
                LocalDate.now().plusDays(20),
                "Health", 5000);

        service.addPolicy(p1);
        service.addPolicy(p2);
        service.addPolicy(p3);
        service.addPolicy(duplicate);

        System.out.println("All Unique Policies:");
        service.displayAllPolicies();

        System.out.println("\nPolicies Expiring Soon:");
        service.policiesExpiringSoon();

        System.out.println("\nHealth Policies:");
        service.policiesByCoverage("Health");

        System.out.println("\nPerformance Comparison:");
        service.performanceTest(p1);
    }
}