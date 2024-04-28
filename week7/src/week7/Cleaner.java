package week7;

public class Cleaner extends Employee {
    private String department;

    public Cleaner(String name, String empId, String department) {
        super(name, empId);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Cleaner " + getName() + " Emp#" + getEmpId() + " of " + department + " is sweeping");
    }
}
