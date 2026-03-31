package InsuranceClaimAnalysis;
import java.util.*;
import java.util.stream.*;

public class InsuranceClaimAnalysisMain {
 public static void main(String[] args) {
     List<Claim> claims = Arrays.asList(
             new Claim("Health", 46000),
             new Claim("Vehicle", 39000),
             new Claim("Health", 97000),
             new Claim("Property", 220000),
             new Claim("Vehicle", 45000),
             new Claim("Health", 60000)
     );

     // Average claim amount for each claim type
     Map<String, Double> averageClaimByType = claims.stream()
             .collect(Collectors.groupingBy(
                     Claim::getClaimType,
                     Collectors.averagingDouble(Claim::getAmount)
             ));

     averageClaimByType.forEach((type, avg) ->
             System.out.println(type + " Claim Average: " + avg)
     );
 }
}
