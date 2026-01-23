import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        Map<String, Integer> voteMap = new HashMap<>();
        Map<String, Integer> insertionOrder = new LinkedHashMap<>();

        castVote(voteMap, insertionOrder, "Alice");
        castVote(voteMap, insertionOrder, "Bob");
        castVote(voteMap, insertionOrder, "Alice");

        System.out.println("Votes (Insertion Order): " + insertionOrder);

        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteMap);
        System.out.println("Sorted Results: " + sortedResults);
    }

    private static void castVote(Map<String, Integer> voteMap,
                                 Map<String, Integer> insertionOrder,
                                 String candidate) {

        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        insertionOrder.put(candidate, voteMap.get(candidate));
    }
}