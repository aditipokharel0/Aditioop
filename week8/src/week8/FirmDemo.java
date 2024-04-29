package week8;

//FirmDemo.java (Driver Program)
public class FirmDemo {
 public static void main(String[] args) {
     Employee manager = new Manager("John");
     Employee staff = new Staff("Alice");
     Employee temporary = new Temporary("Bob");

     manager.takeVacation();  // Output: John is taking a luxury vacation.
     staff.takeVacation();    // Output: Alice is taking a standard vacation.
     temporary.takeVacation(); // Output: Bob is taking a short vacation.
 }
}

