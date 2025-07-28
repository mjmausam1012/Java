import java.util.Scanner;

public class Banking_System {
    static int bal = 2000;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n");
            System.out.println("\t\tWELCOME TO BANKING SYSTEM");
            System.out.println("\t\t-------------------------");
            System.out.println("1. Customer Details\n2. Deposit\n3. Withdraw\n4. Account Balance\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    details();
                    break;
                case 2:
                    Deposit();
                    break;
                case 3:
                    Withdraw();
                    break;
                case 4:
                    Balance();
                    break;
                case 5:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid Choice... Please ! Try Again.");
                    break;
            }
        } while (choice != 5);

        scan.close();
    }

    public static void details() {
        String name = "Mausam Kumar";
        String account = "24140095";
        String mob = "9987654321";

        System.out.println("\n");
        System.out.println("\tCUSTOMER DETAILS:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + account);
        System.out.println("Mobile Number: " + mob);
        System.out.println("Available Balance: " + bal);
    }

    public static void Deposit() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter Deposit Amount: ");
        int amt = scan.nextInt();
        if (0 < amt) {
            System.out.println("Deposit Amount Successfully.");
            bal = bal + amt;
            System.out.println("Available Balance: " + bal);
        } else {
            System.out.println("Invalid Amount... Please ! Try Again.");
        }

        scan.close();
    }

    public static void Withdraw() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter Withdraw Amount: ");
        int amt = scan.nextInt();
        if (0 < amt && amt <= bal) {
            System.out.println("Withdraw Amount Successfully.");
            bal = bal - amt;
            System.out.println("Available Balance: " + bal);
        } else {
            System.out.println("Insufficient Balance... \nPlease ! Try Again.");
        }

        scan.close();
    }

    public static void Balance() {
        System.out.println("\nAvailable Balance: " + bal);
    }
}
