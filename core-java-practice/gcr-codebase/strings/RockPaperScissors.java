import java.util.*;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        String[][] ans = new String[games][3];
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {
            String userChoice = sc.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            ans[i][0] = userChoice;
            ans[i][1] = computerChoice;
            ans[i][2] = winner;

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;
        }

        String[][] stats = calculateStats(userWins, computerWins, games);
        displayResults(ans, stats);
    }

    static String getComputerChoice() {
        int n = (int) (Math.random() * 3);
        if (n == 0) return "rock";
        if (n == 1) return "paper";
        return "scissors";
    }

    static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        if (
            (user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))
        ) {
            return "User";
        }
        return "Computer";
    }

    static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent);

        return stats;
    }

    static void displayResults(String[][] games, String[][] stats) {
        System.out.println("\nGame\tUser\tComputer\tWinner");

        for (int i = 0; i < games.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                games[i][0] + "\t" +
                games[i][1] + "\t\t" +
                games[i][2]
            );
        }

        System.out.println("\nPlayer\tWins\tWin %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                stats[i][0] + "\t" +
                Integer.parseInt(stats[i][1]) + "\t" +
                stats[i][2]
            );
        }
    }
}
