package week4;

import java.util.Scanner;

public class SphereCalculations {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the sphere
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Calculate the volume and surface area of the sphere
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);

        // Print the volume and surface area, rounded to four decimal places
        System.out.printf("Volume: %.4f%n", volume);
        System.out.printf("Surface Area: %.4f%n", surfaceArea);
    }
}

