import java.util.*;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        String s = "tree";
        System.out.println(frequencySort(s));  // eert
    }

    public static String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();
        for(char ch : list){
            for(int j = 0; j < map.get(ch); j++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
