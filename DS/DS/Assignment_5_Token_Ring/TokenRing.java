import java.util.Scanner;

public class TokenRing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");

        int n = sc.nextInt();

        int token = 0;

        int choice;

        do {

            System.out.print("\nEnter process to access critical section: ");

            int process = sc.nextInt();

            System.out.println("\nToken passing:");

            while (token != process) {

                System.out.println("Token passed from process "
                        + token + " to process "
                        + ((token + 1) % n));

                token = (token + 1) % n;
            }

            System.out.println("\nProcess "
                    + process
                    + " enters Critical Section");

            System.out.println("Process "
                    + process
                    + " exits Critical Section");

            System.out.println("Token released by process "
                    + process);

            System.out.print("\nDo you want to continue? (1 for yes / 0 for no): ");

            choice = sc.nextInt();

        } while (choice == 1);

        sc.close();
    }
}