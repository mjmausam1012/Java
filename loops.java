import java.util.Scanner;

class loops {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value to print a table: ");

        if (scan.hasNextInt()) {
            int num = scan.nextInt();

            System.out.println("Using For Loop...");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + "x" + i + "=" + num * i);
            }

            System.out.println("Using While Loop...");
            int j = 1;
            while (j <= 10) {
                System.out.println(num + "x" + j + "=" + num * j);
                j++;
            }

            System.out.println("Using Do-While Loop...");
            int k = 1;
            do {
                System.out.println(num + "x" + k + "=" + num * k);
                k++;
            } while (k <= 10);

        }

        scan.close();
    }
}