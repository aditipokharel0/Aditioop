package week7;

public class CricketStats extends PlayerStats {
    private int runsScored;
    private int wicketsTaken;
    // Add more cricket-specific attributes as needed

    public CricketStats(String playerName, int matchesPlayed, int runsScored, int wicketsTaken) {
        super(playerName, matchesPlayed, 0); // Goals Scored not applicable in cricket
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
    }

    // Override common method if necessary
    @Override
    public void displayPlayerInfo() {
        super.displayPlayerInfo();
        System.out.println("Runs Scored: " + runsScored);
        System.out.println("Wickets Taken: " + wicketsTaken);
    }
}
