package week7;

public class HospitalDriver {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("Dr. Smith", "001", "Cardiology");
        Nurse nurse1 = new Nurse("Alice", "101", 8);
        Receptionist receptionist1 = new Receptionist("Emily", "201");
        Cleaner cleaner1 = new Cleaner("John", "301", "Emergency Department");

        hospital.addEmployee(doctor1);
        hospital.addEmployee(nurse1);
        hospital.addEmployee(receptionist1);
        hospital.addEmployee(cleaner1);

        hospital.displayAllEmployeesInfo();
    }
}
