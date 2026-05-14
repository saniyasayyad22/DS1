import java.util.Scanner;

public class Bully {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");

        int n = sc.nextInt();

        int[] processes = new int[n];

        for (int i = 0; i < n; i++) {

            processes[i] = i + 1;
        }

        System.out.print("Enter process that initiates election: ");

        int initiator = sc.nextInt();

        System.out.println("\nElection Process:");

        for (int i = initiator; i < n; i++) {

            System.out.println("Process "
                    + initiator
                    + " sends election message to Process "
                    + processes[i]);
        }

        int coordinator = processes[n - 1];

        System.out.println("\nProcess "
                + coordinator
                + " becomes Coordinator");

        sc.close();
    }
}