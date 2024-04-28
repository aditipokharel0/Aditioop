package week6;

import java.util.Random;

class Card {
    private String suit;
    private String faceValue;

    // Constructor
    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    // Getter for suit
    public String getSuit() {
        return suit;
    }

    // Setter for suit
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Getter for faceValue
    public String getFaceValue() {
        return faceValue;
    }

    // Setter for faceValue
    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }

    // Method to return a string representation of the card
    public String toString() {
        return faceValue + " of " + suit;
    }
}