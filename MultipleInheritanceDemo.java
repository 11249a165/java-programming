import java.util.Scanner;

// Interface 1
interface Work {
    void workDetails();
}

// Interface 2
interface Salary {
    void salaryDetails();
}

// Class implementing both interfaces
class Employee implements Work, Salary {

    String name;
    double salary;

    public void workDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
    }

    public void salaryDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.workDetails();
        emp.salaryDetails();
        emp.display();
    }
}
