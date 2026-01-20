import java.util.*;

public class Main {

    public static void main(String[] args) {
        CinemaTime manager = new CinemaTime();

        manager.addMovie("Inception", "18:30");
        manager.addMovie("Interstellar", "21:00");
        manager.addMovie("Avatar", "15:15");

        manager.displayAllMovies();

        manager.searchMovie("Inter");

        String[] report = manager.generateReport();
        for (String line : report) {
            System.out.println(line);
        }
    }
}
