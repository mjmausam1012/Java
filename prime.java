import java.util.*;

class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            boolean isPrime = true;

            if (num <= 0) {
                System.out.println("Please Enter a value greater than 0...");
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                    }

                }

                if (isPrime) {
                    System.out.println(num + " is a Prime Number.");
                } else {
                    System.out.println(num + " is not a Prime Number.");
                }

            }

        } else {
            System.out.println("Please Enter a Valid Integer Number...");
        }

        scan.close();

    }
}