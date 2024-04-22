package week2;

import java.util.Scanner;

public class SquareProperties {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the square's side
        System.out.print("Enter the length of the square's side: ");
        
        // Read the length of the square's side as an integer
        int sideLength = scanner.nextInt();

        // Calculate the square's perimeter and area
        int perimeter = 4 * sideLength;
        int area = sideLength * sideLength;

        // Display the square's perimeter and area
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Area of the square: " + area);

        // Close the scanner
        scanner.close();
    }
}
