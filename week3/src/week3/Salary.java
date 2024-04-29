package week3;

import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {
    public static void main(String[] args) {
        double currentSalary; // employee's current salary
        double raise = 0; // amount of the raise
        double newSalary; // new salary for the employee
        String rating; // performance rating
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        
        System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();
        
        // Compute the raise using if...else statements
        if (rating.equals("Excellent")) {
            raise = currentSalary * 0.06; // 6% raise
        } else if (rating.equals("Good")) {
            raise = currentSalary * 0.04; // 4% raise
        } else if (rating.equals("Poor")) {
            raise = currentSalary * 0.015; // 1.5% raise
        } else {
            System.out.println("Invalid performance rating.");
            return; // Exit the program if the rating is invalid
        }
        
        newSalary = currentSalary + raise;
        
        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary: " + money.format(newSalary));
        System.out.println();
        
        scan.close(); // Close the scanner
    }
}
