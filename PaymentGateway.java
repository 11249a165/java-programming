class PaymentProcess implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing...");

            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class PaymentGateway {

    public static void main(String[] args) {

        PaymentProcess payment = new PaymentProcess();

        Thread thread = new Thread(payment);

        thread.start();
    }
}
