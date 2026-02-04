import java.util.*;
import java.util.stream.Collectors;
public class UppercaseNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("muskan", "muskiiii", "mskn");
        List<String> upperNames = names.stream()
                                        .map(String::toUpperCase) 
                                        .collect(Collectors.toList());
        upperNames.forEach(System.out::println);
    }
}
