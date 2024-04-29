package week8;

//Manager.java
public class Manager extends Employee {
 public Manager(String name) {
     super(name, "Manager");
 }

 @Override
 public void takeVacation() {
     System.out.println(getName() + " is taking a luxury vacation.");
 }

private String getName() {
	// TODO Auto-generated method stub
	return null;
}
}

