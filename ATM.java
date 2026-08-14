import java.util.Scanner;


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class ATM {
    private double balance;

    
    ATM(double balance) {
        this.balance = balance;
    }

    
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Available balance: ₹" + balance
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Amount withdrawn: ₹" + amount);
        System.out.println("Remaining balance: ₹" + balance);
    }
}


public class ATMProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM(10000);

        System.out.println("===== ATM =====");
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();

        try {
            atm.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}