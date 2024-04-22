package week2;

import java.util.Scanner;

public class FractionToDecimal {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the numerator and denominator
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        // Calculate the decimal equivalent of the fraction
        double decimal = (double) numerator / denominator;

        // Display the decimal equivalent of the fraction
        System.out.println("Decimal equivalent: " + decimal);

        // Close the scanner
        scanner.close();
    }
}
