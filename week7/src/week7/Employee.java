package week7;

public class Employee {
    private String name;
    private String empId;

    public Employee(String name, String empId) {
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }

    public void displayInfo() {
        // Placeholder method, to be overridden by subclasses
    }
}
