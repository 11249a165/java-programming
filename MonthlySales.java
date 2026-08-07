import java.util.Scanner;
public class MonthlySales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sales = new int[12];

        System.out.println("Enter monthly sales for 12 months:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            sales[i] = sc.nextInt();
        }

        int max = sales[0];
        int min = sales[0];

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }
            if (sales[i] < min) {
                min = sales[i];
            }
        }

        System.out.println("Highest Sales = " + max);
        System.out.println("Lowest Sales = " + min);

        sc.close();
    }
}
