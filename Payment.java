// Interface
interface Payment {
    void pay();   // abstract method
}

// UPIPayment class
class UPIPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using UPI.");
    }
}

// CardPayment class
class CardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using Credit/Debit Card.");
    }
}

// Main class
public class PaymentDemo {
    public static void main(String[] args) {

        Payment payment1 = new UPIPayment();
        Payment payment2 = new CardPayment();

        payment1.pay();
        payment2.pay();
    }
}
