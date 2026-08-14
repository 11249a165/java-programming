import java.util.Scanner;

// User-defined exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Voting class
class VotingSystem {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(
                "Invalid age! You must be at least 18 years old to vote."
            );
        }

        System.out.println("You are eligible to vote.");
    }
}

// Main class
public class OnlineVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            VotingSystem.checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
