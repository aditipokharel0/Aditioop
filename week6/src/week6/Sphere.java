package week6;
import java.text.DecimalFormat;

class Sphere {
    private double diameter;

    // Constructor
    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    // Getter for diameter
    public double getDiameter() {
        return diameter;
    }

    // Setter for diameter
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Method to calculate volume
    public double calculateVolume() {
        double radius = diameter / 2.0;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to calculate surface area
    public double calculateSurfaceArea() {
        double radius = diameter / 2.0;
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    // toString method
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Sphere with diameter " + df.format(diameter) + ", volume " + df.format(calculateVolume()) + ", and surface area " + df.format(calculateSurfaceArea());
    }
}




