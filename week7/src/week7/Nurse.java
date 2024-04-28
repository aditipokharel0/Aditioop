package week7;

public class Nurse extends Employee {
    private int patients;

    public Nurse(String name, String empId, int patients) {
        super(name, empId);
        this.patients = patients;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nurse " + getName() + " Emp#" + getEmpId() + " has " + patients + " patients");
    }
}
