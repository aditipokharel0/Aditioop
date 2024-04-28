package week7;

public class Doctor extends Employee {
    private String specialism;

    public Doctor(String name, String empId, String specialism) {
        super(name, empId);
        this.specialism = specialism;
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor " + getName() + " Emp#" + getEmpId() + " specializes in " + specialism);
    }
}

