package week7;

public class PlayerStats {
    private String playerName;
    private int matchesPlayed;
    private int goalsScored;
    // Add more common attributes as needed
    
    public PlayerStats(String playerName, int matchesPlayed, int goalsScored) {
        this.playerName = playerName;
        this.matchesPlayed = matchesPlayed;
        this.goalsScored = goalsScored;
    }

    // Common methods
    public void displayPlayerInfo() {
        System.out.println("Player: " + playerName);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Goals Scored: " + goalsScored);
    }
}

