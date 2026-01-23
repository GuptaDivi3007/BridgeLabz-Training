import java.time.LocalDate;

public class PolicyService {

    private PolicyRepository repository = new PolicyRepository();

    public void addPolicy(Policy policy) {
        repository.addPolicy(policy);
    }

    public void getPolicyByNumber(String number) {
        Policy policy = repository.getByPolicyNumber(number);
        System.out.println(policy != null ? policy : "Policy not found");
    }

    public void policiesExpiringIn30Days() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Policy policy : repository.getPoliciesSortedByExpiry()) {
            if (!policy.getExpiryDate().isAfter(limit)) {
                System.out.println(policy);
            }
        }
    }

    public void policiesByHolder(String holder) {
        for (Policy policy : repository.getAllPolicies()) {
            if (policy.getHolderName().equalsIgnoreCase(holder)) {
                System.out.println(policy);
            }
        }
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        for (Policy policy : repository.getAllPolicies()) {
            if (policy.getExpiryDate().isBefore(today)) {
                repository.removePolicy(policy.getPolicyNumber());
            }
        }
    }
}