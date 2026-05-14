import java.util.*;

public class Berkeley {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of client clocks: ");
        int n = sc.nextInt();

        int[] clocks = new int[n];

        int sum = 0;

        System.out.print("Enter server clock time: ");
        int serverTime = sc.nextInt();

        sum += serverTime;

        for (int i = 0; i < n; i++) {

            System.out.print("Enter time for client " + (i + 1) + ": ");

            clocks[i] = sc.nextInt();

            sum += clocks[i];
        }

        int average = sum / (n + 1);

        System.out.println("\nAverage time is: " + average);

        System.out.println("\nTime adjustments:");

        System.out.println("Server adjustment: "
                + (average - serverTime));

        for (int i = 0; i < n; i++) {

            System.out.println("Client " + (i + 1)
                    + " adjustment: "
                    + (average - clocks[i]));
        }

        System.out.println("\nSynchronized Times:");

        System.out.println("Server time: " + average);

        for (int i = 0; i < n; i++) {

            System.out.println("Client "
                    + (i + 1)
                    + " time: "
                    + average);
        }

        sc.close();
    }
}