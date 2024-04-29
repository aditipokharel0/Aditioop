package week8;

//Staff.java
public class Staff extends Employee {
 public Staff(String name) {
     super(name, "Staff");
 }

 @Override
 public void takeVacation() {
     System.out.println(getName() + " is taking a standard vacation.");
 }

private String getName() {
	// TODO Auto-generated method stub
	return null;
}
}

