package FilteringExpiringMemberships;


//Member.java
import java.time.LocalDate;
class Member {
 private String name;
 private LocalDate expiryDate;
 public Member(String name, LocalDate expiryDate) {
     this.name= name;
     this.expiryDate= expiryDate;
 }
 public String getName() {
     return name;
 }
 public LocalDate getExpiryDate() {
     return expiryDate;
 }
 @Override
 public String toString() {
     return name+" - Expiry Date: "+expiryDate;
 }
}
