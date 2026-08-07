import java.util.Scanner;

// Superclass
class Employee {
    int empId;
    String name;
    double basicSalary;

    void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }
}

// Subclass
class PermanentEmployee extends Employee {
    double hra, da, grossSalary;

    void calculateSalary() {
        hra = basicSalary * 0.20;   // 20% HRA
        da = basicSalary * 0.10;    // 10% DA
        grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Gross Salary : " + grossSalary);
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        PermanentEmployee emp = new PermanentEmployee();

        emp.getEmployeeDetails();
        emp.calculateSalary();
        emp.display();
    }
}
