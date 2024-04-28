package week7;

public class FootballStats extends PlayerStats {
    private int assists;
    private int yellowCards;
    private int redCards;
    // Add more football-specific attributes as needed

    public FootballStats(String playerName, int matchesPlayed, int goalsScored, int assists, int yellowCards, int redCards) {
        super(playerName, matchesPlayed, goalsScored);
        this.assists = assists;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

    // Override common method if necessary
    @Override
    public void displayPlayerInfo() {
        super.displayPlayerInfo();
        System.out.println("Assists: " + assists);
        System.out.println("Yellow Cards: " + yellowCards);
        System.out.println("Red Cards: " + redCards);
    }
}
