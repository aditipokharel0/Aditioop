package week7;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Employee> employees;

    public Hospital() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployeesInfo() {
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
