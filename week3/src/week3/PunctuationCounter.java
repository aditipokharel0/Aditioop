package week3;

import java.util.HashMap;

public class PunctuationCounter {
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

        // Initialize a HashMap to store the count of each punctuation mark
        HashMap<Character, Integer> punctuationCounts = new HashMap<>();

        // Iterate through each character in the text
        for (char ch : text.toCharArray()) {
            // Check if the character is a punctuation mark
            if (isPunctuation(ch)) {
                // Increment the count for the punctuation mark
                punctuationCounts.put(ch, punctuationCounts.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the table header
        System.out.println("Punctuation Mark\tCount");
        System.out.println("----------------\t-----");

        // Print the count for each punctuation mark
        for (char ch : punctuationCounts.keySet()) {
            System.out.println(ch + "\t\t\t" + punctuationCounts.get(ch));
        }
    }

    // Method to check if a character is a punctuation mark
    private static boolean isPunctuation(char ch) {
        return (ch == '.' || ch == ',' || ch == ';' || ch == ':' || ch == '-' || ch == '\'' || ch == '"' || ch == '(' || ch == ')' || ch == '!' || ch == '?');
    }
}

