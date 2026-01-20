import java.util.*;

public class CinemaTime {

    private List<String> titles;
    private List<String> showTimes;

    public CinemaTime() {
        titles = new ArrayList<>();
        showTimes = new ArrayList<>();
    }

    public void addMovie(String title, String time) {
        validateTime(time);
        titles.add(title);
        showTimes.add(time);
    }

    public void searchMovie(String keyword) {
        try {
            for (int i = 0; i < titles.size(); i++) {
                if (titles.get(i).contains(keyword)) {
                    System.out.println(titles.get(i) + " at " + showTimes.get(i));
                }
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid movie index accessed");
        }
    }

    public void displayAllMovies() {
        for (int i = 0; i < titles.size(); i++) {
            System.out.println(titles.get(i) + " - " + showTimes.get(i));
        }
    }

    public String[] generateReport() {
        String[] report = new String[titles.size()];
        for (int i = 0; i < titles.size(); i++) {
            report[i] = String.format("Movie: %s | Time: %s", titles.get(i), showTimes.get(i));
        }
        return report;
    }

    private void validateTime(String time) {
        if (!time.matches("\\d{2}:\\d{2}")) {
            throw new InvalidTimeFormatException("Invalid time format");
        }

        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3));

        if (hour > 23 || minute > 59) {
            throw new InvalidTimeFormatException("Invalid time value");
        }
    }
}
