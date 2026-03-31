package IPLProject;

public class IPL {
	public int match_id;
    public String team1;
    public String team2;
    public String winner;
    public String player_of_match;

    // Censorship logic
    public void censor() {
        this.team1 = maskTeam(this.team1);
        this.team2 = maskTeam(this.team2);
        this.winner = maskTeam(this.winner);
        this.player_of_match = "REDACTED";
    }

    private String maskTeam(String team) {
        if (team == null) return null;
        int index = team.indexOf(" ");
        return index != -1 ? team.substring(0, index) + " ***" : "***";
    }
}
