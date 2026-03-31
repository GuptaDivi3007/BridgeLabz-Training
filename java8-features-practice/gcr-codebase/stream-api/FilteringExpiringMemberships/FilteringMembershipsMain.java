package FilteringExpiringMemberships;
//ExpiringMemberships.java
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;
public class FilteringMembershipsMain {
 public static void main(String[] args) {
     List<Member> members = Arrays.asList(
             new Member("A", LocalDate.now().plusDays(10)),
             new Member("P", LocalDate.now().plusDays(40)),
             new Member("Q", LocalDate.now().plusDays(25)),
             new Member("X", LocalDate.now().plusDays(5)),
             new Member("Y", LocalDate.now().plusDays(60))
     );
     LocalDate today = LocalDate.now();
     LocalDate next30Days = today.plusDays(30);
     List<Member> expiringSoon = members.stream()
             .filter(m -> !m.getExpiryDate().isBefore(today)&& !m.getExpiryDate().isAfter(next30Days))
             .collect(Collectors.toList());
     expiringSoon.forEach(System.out::println);
 }
}

