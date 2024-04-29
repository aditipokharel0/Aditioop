package week8;

//Employee.java
public class Employee {
 private String name;
 private String role;

 public Employee(String name, String role) {
     this.name = name;
     this.role = role;
 }

 public void takeVacation() {
     System.out.println(name + " is taking a vacation.");
 }
}
