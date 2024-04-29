package week3;

import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a sentence
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split the input sentence into words
        String[] words = input.split("\\s+");

        // Process each word and reverse its characters
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        // Print the reversed sentence
        System.out.println("Reversed sentence: " + reversedSentence);

        scanner.close(); // Close the scanner
    }
}
