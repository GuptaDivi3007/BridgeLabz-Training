import java.time.LocalDate;

public class InsurancePolicyApp {

    public static void main(String[] args) {

        PolicyService service = new PolicyService();

        service.addPolicy(new Policy("P201", "Aryan",
                LocalDate.now().plusDays(10), "Health", 5000));

        service.addPolicy(new Policy("P202", "Neha",
                LocalDate.now().plusDays(40), "Auto", 3000));

        service.addPolicy(new Policy("P203", "Aryan",
                LocalDate.now().minusDays(2), "Home", 4500));

        System.out.println("Get policy by number:");
        service.getPolicyByNumber("P201");

        System.out.println("\nPolicies expiring in next 30 days:");
        service.policiesExpiringIn30Days();

        System.out.println("\nPolicies for holder Aryan:");
        service.policiesByHolder("Aryan");

        System.out.println("\nRemoving expired policies...");
        service.removeExpiredPolicies();

        System.out.println("\nRemaining policies:");
        service.policiesExpiringIn30Days();
    }
}