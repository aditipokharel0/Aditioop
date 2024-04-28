package week6;

public class Lights {
    public static void main(String[] args) {
        // Instantiating Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();

        // Turning on some bulbs
        bulb1.turnOn();
        bulb2.turnOn();

        // Checking if bulbs are on
        System.out.println("Bulb 1 is on: " + bulb1.isOn());
        System.out.println("Bulb 2 is on: " + bulb2.isOn());

        // Turning off bulb 1
        bulb1.turnOff();

        // Checking bulb 1 status again
        System.out.println("Bulb 1 is on: " + bulb1.isOn());
    }
}
