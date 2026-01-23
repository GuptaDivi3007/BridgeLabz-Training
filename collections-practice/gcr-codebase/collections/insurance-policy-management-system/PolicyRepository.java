import java.util.*;

public class PolicyRepository {

    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public Set<Policy> getHashSet() {
        return hashSet;
    }

    public Set<Policy> getLinkedHashSet() {
        return linkedHashSet;
    }

    public Set<Policy> getTreeSet() {
        return treeSet;
    }
}