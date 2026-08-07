import java.util.Scanner;

// Parent Class
class Student {
    int rollNo;
    String name;

    void getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
    }
}

// Child Class
class Marks extends Student {
    int[] marks = new int[5];

    void getMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks in 5 Subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }
}

// Grandchild Class
class Result extends Marks {
    int total = 0;
    double average;
    char grade;

    void calculateResult() {
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }

        average = total / 5.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';
    }

    void display() {
        System.out.println("\nStudent Result");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade : " + grade);
    }
}
public class StudentResult {
    public static void main(String[] args) {
        Result r = new Result();

        r.getStudentDetails();
        r.getMarks();
        r.calculateResult();
        r.display();
    }
}
