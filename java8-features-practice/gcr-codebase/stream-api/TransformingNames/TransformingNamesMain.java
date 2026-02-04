package TransformingNames;


import java.util.*;
import java.util.stream.*;

public class TransformingNamesMain {
 public static void main(String[] args) {

     List<Customer> customers = Arrays.asList(
             new Customer("ron"),
             new Customer("any"),
             new Customer("kaira"),
             new Customer("Kio"),
             new Customer("Anit")
     );

     List<String> displayNames = customers.stream()
             .map(c -> c.getName().toUpperCase()) // transform to uppercase
             .sorted()                            // sort alphabetically
             .collect(Collectors.toList());

     displayNames.forEach(System.out::println);
 }
}
