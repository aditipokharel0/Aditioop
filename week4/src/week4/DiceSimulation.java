package week4;

import java.util.Scanner;
import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Prompt the user for the number of sides for two dice
        System.out.print("How many sides does die 1 have? ");
        int sides1 = scanner.nextInt();
        System.out.print("How many sides does die 2 have? ");
        int sides2 = scanner.nextInt();

        // Simulate rolling the dice three times
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 3; i++) {
            int roll1 = random.nextInt(sides1) + 1;
            int roll2 = random.nextInt(sides2) + 1;

            sum1 += roll1;
            sum2 += roll2;

            System.out.println("Die 1 " + (i + 1) + "st roll = " + roll1 + ".");
            System.out.println("Die 2 " + (i + 1) + "st roll = " + roll2 + ".");
        }

        // Calculate and output the sum and average for each die
        double avg1 = (double) sum1 / 3;
        double avg2 = (double) sum2 / 3;
        System.out.println("Die 1 rolled a total of " + sum1 + " and rolled " + avg1 + " on average.");
        System.out.println("Die 2 rolled a total of " + sum2 + " and rolled " + avg2 + " on average.");
    }
}
