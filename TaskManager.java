class CounterThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);

            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class TaskManager {

    public static void main(String[] args) {

        CounterThread thread = new CounterThread();

        thread.start();
    }
}
