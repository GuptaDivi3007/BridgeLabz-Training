package EmailNotifications;

import java.util.*;
public class EmailNotificationsMain {
 public static void main(String[] args) {
     List<String> emails = Arrays.asList(
             "user1@gmail.com",
             "user2@gmail.com",
             "user3@gmail.com",
             "user4@gmail.com" );
     // Using forEach() to send notification to each email
     emails.forEach(email -> EmailService.sendEmailNotification(email));
 }
}

