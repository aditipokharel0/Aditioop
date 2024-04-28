package week7;

public class Receptionist extends Employee {
    public Receptionist(String name, String empId) {
        super(name, empId);
    }

    @Override
    public void displayInfo() {
        System.out.println("Receptionist " + getName() + " Emp#" + getEmpId() + " is at the reception desk");
    }
}

