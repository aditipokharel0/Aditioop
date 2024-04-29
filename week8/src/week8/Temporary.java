package week8;

//Temporary.java
public class Temporary extends Employee {
 public Temporary(String name) {
     super(name, "Temporary");
 }

 @Override
 public void takeVacation() {
     System.out.println(getName() + " is taking a short vacation.");
 }

private String getName() {
	// TODO Auto-generated method stub
	return null;
}
}
