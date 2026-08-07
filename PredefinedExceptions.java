import java.util.Scanner;

public class PredefinedExceptions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        try {
            System.out.print("Enter your age: ");
            String age = sc.nextLine();

            int a = Integer.parseInt(age);

            System.out.println("Age = " + a);

        } catch (NumberFormatException e) {
            System.out.println("Invalid age! Please enter numbers only.");
        }

        
        try {
            int x = 10;
            int y = 0;

            int result = x / y;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        sc.close();
    }
}
