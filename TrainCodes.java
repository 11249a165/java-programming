public class TrainCodes {
    public static void main(String[] args) {

        String[] trainCodes = {"TN01", "TN02", "TN03"};

        try {
            System.out.println("Train Code: " + trainCodes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program continues...");
    }
}
