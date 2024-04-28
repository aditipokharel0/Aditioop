package week7;

public class PlayerStatsDriver {
    public static void main(String[] args) {
        // Test FootballStats
        FootballStats footballPlayer = new FootballStats("John Doe", 20, 15, 10, 2, 1);
        System.out.println("Football Player Stats:");
        footballPlayer.displayPlayerInfo();
        System.out.println();

        // Test CricketStats
        CricketStats cricketPlayer = new CricketStats("Alice Smith", 30, 500, 25);
        System.out.println("Cricket Player Stats:");
        cricketPlayer.displayPlayerInfo();
    }
}
