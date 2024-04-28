package week6;

class Bulb {
    private boolean isOn;

    // Constructor
    public Bulb() {
        this.isOn = false; // Bulb is initially off
    }

    // Method to turn on the bulb
    public void turnOn() {
        isOn = true;
    }

    // Method to turn off the bulb
    public void turnOff() {
        isOn = false;
    }

    // Method to check if the bulb is on
    public boolean isOn() {
        return isOn;
    }
}
