package week2;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter miles
        System.out.print("Enter the number of miles: ");
        
        // Read miles as a floating point value
        double miles = scanner.nextDouble();

        // Convert miles to kilometers
        double kilometers = miles * 1.60935;

        // Display the result
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");

        // Close the scanner
        scanner.close();
    }
}
