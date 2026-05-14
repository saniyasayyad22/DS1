import java.util.Scanner;

public class Ring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");

        int n = sc.nextInt();

        int[] processes = new int[n];

        for (int i = 0; i < n; i++) {

            processes[i] = i + 1;
        }

        System.out.print("Enter process initiating election: ");

        int initiator = sc.nextInt();

        System.out.println("\nRing Election Process:");

        for (int i = initiator; i < n; i++) {

            System.out.println("Process "
                    + processes[i]
                    + " passes election message");
        }

        for (int i = 0; i < initiator; i++) {

            System.out.println("Process "
                    + processes[i]
                    + " passes election message");
        }

        int coordinator = processes[n - 1];

        System.out.println("\nProcess "
                + coordinator
                + " becomes Coordinator");

        sc.close();
    }
}