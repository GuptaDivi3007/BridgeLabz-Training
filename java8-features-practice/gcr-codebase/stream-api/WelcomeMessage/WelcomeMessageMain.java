package WelcomeMessage;

import java.util.*;

public class WelcomeMessageMain {
 public static void main(String[] args) {

     List<Attendee> attendees = Arrays.asList(
             new Attendee("Ron"),
             new Attendee("Kamee"),
             new Attendee("Raiyasnsh"),
             new Attendee("Antonia")
     );

     // Using forEach() with lambda to print welcome messages
     attendees.forEach(a ->
             System.out.println("Welcome to the event, "+a.getName()+"!")
     );
 }
}

