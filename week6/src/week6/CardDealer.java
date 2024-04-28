package week6;
import java.util.Random;

public class CardDealer {
    public static void main(String[] args) {
        // Arrays representing possible suits and face values
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faceValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Create an array to hold the dealt cards
        Card[] hand = new Card[5];

        // Random object to generate random indices for suits and face values
        Random random = new Random();

        // Deal five random cards
        for (int i = 0; i < 5; i++) {
            String randomSuit = suits[random.nextInt(suits.length)];
            String randomFaceValue = faceValues[random.nextInt(faceValues.length)];
            hand[i] = new Card(randomSuit, randomFaceValue);
        }

        // Display the dealt cards
        System.out.println("Dealt cards:");
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}
