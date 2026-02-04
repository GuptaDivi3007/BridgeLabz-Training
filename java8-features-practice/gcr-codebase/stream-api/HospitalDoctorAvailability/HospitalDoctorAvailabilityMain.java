package HospitalDoctorAvailability;

import java.util.*;
import java.util.stream.*;
public class HospitalDoctorAvailabilityMain {
 public static void main(String[] args) {
     List<Doctor> doctors = Arrays.asList(
             new Doctor("Dr. A", "Cardiology", true),
             new Doctor("Dr. X", "Neurology", false),
             new Doctor("Dr. Y", "Orthopedics", true),
             new Doctor("Dr. P", "Dermatology", true),
             new Doctor("Dr. B", "Neurology", true));
     List<Doctor> weekendDoctors = doctors.stream()
             .filter(Doctor::isAvailableOnWeekend)   
             .sorted(Comparator.comparing(Doctor::getSpecialty)) // sort by specialty
             .collect(Collectors.toList());
     weekendDoctors.forEach(System.out::println);
 }
}
