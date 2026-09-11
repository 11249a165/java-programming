class OrderPlacement extends Thread {

    public void run() {
        System.out.println("Order Placement Started");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Placing order... Step " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Order placed successfully!");
    }
}

class OrderDelivery extends Thread {

    public void run() {
        System.out.println("Order Delivery Started");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Delivering order... Step " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Order delivered successfully!");
    }
}

public class FoodDelivery {

    public static void main(String[] args) {

        OrderPlacement placement = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();

        placement.start();
        delivery.start();
    }
}
