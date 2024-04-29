package week4;

import java.util.Random;

public class PinEncryption {
    public static void main(String[] args) {
        // Get the PIN number from the user
        int pin = getPinFromUser();

        // Generate two random numbers greater than 1000 and less than 65536
        int random1 = generateRandomNumber();
        int random2 = generateRandomNumber();

        // Convert the PIN and random numbers to hexadecimal
        String encryptedPin = encryptPin(pin, random1, random2);

        // Print the encrypted PIN
        System.out.println("Your encrypted pin number is " + encryptedPin);
    }

    // Method to get the PIN number from the user
    public static int getPinFromUser() {
        // In a real program, you would read input from the user
        // Here, we'll just return a hardcoded value for demonstration
        return 8491;
    }

    // Method to generate a random number greater than 1000 and less than 65536
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(64536) + 1000;
    }

    // Method to encrypt the PIN number
    public static String encryptPin(int pin, int random1, int random2) {
        // Convert the PIN and random numbers to hexadecimal strings
        String hexPin = Integer.toHexString(pin);
        String hexRandom1 = Integer.toHexString(random1);
        String hexRandom2 = Integer.toHexString(random2);

        // Concatenate the hexadecimal strings with the PIN in the middle
        String encryptedPin = hexRandom1 + hexPin + hexRandom2;

        return encryptedPin;
    }
}
