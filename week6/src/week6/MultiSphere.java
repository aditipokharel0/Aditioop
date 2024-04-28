package week6;

public class MultiSphere {
    public static void main(String[] args) {
        // Creating Sphere objects
        Sphere sphere1 = new Sphere(5.0);
        Sphere sphere2 = new Sphere(10.0);
        
        // Updating diameter using setter method
        sphere1.setDiameter(8.0);
        sphere2.setDiameter(12.0);
        
        // Displaying information using toString method
        System.out.println(sphere1);
        System.out.println(sphere2);
    }
}
