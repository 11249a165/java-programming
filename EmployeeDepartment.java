import java.util.Scanner;
public class EmployeeDepartment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first Employee name:");
        String emp1 = sc.nextLine();

        System.out.print("Enter 2 Employee name:");
        String emp2=sc.nextLine();

        if(emp1.equalsIgnoreCase(emp2)){
            System.out.println("Both Employees are working in the similar department");
        }
        else{
            System.out.println("Employeees are working in different department");
        }

        System.out.println("\n String Operations");
        System.out.println("First Employee (Uppercase):" +emp1.toUpperCase());
        System.out.println("Second Employee (Lowercase):" +emp2.toLowerCase());
        System.out.println("Lenght of First Employee :" +emp1.length());
        System.out.println("Length of Second Employee :" +emp2.length());

        sc.close();
    }
}