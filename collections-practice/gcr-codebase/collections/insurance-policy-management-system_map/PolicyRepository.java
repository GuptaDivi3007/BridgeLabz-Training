import java.time.LocalDate;
import java.util.*;

public class PolicyRepository {

    private Map<String, Policy> hashMap = new HashMap<>();
    private Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, Policy> treeMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.put(policy.getExpiryDate(), policy);
    }

    public Policy getByPolicyNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    public Collection<Policy> getAllPolicies() {
        return hashMap.values();
    }

    public Collection<Policy> getPoliciesSortedByExpiry() {
        return treeMap.values();
    }

    public void removePolicy(String policyNumber) {
        Policy policy = hashMap.remove(policyNumber);
        if (policy != null) {
            linkedHashMap.remove(policyNumber);
            treeMap.remove(policy.getExpiryDate());
        }
    }
}