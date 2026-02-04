import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
class Alert {
    String type;
    String message;
    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }
    public String toString() {
        return type + ": " + message;
    }
}
public class AlertFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Alert> alerts = Arrays.asList(
            new Alert("Emergency", "Heart rate critical"),
            new Alert("Reminder", "Take medicine"),
            new Alert("Info", "Appointment scheduled")
        );
        System.out.println("Enter alert type to filter (Emergency / Reminder / Info): ");
        String userChoice = sc.nextLine();
        Predicate<Alert> filterCondition = alert -> alert.type.equalsIgnoreCase(userChoice);
        List<Alert> filteredAlerts = alerts.stream()
                                            .filter(filterCondition)
                                            .collect(Collectors.toList());
        System.out.println("\nFiltered Alerts:");
        filteredAlerts.forEach(System.out::println);
    }
}
