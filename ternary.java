import java.util.Scanner;

class ternary {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        if (scan.hasNextInt()) {
            int val = scan.nextInt();

            String str = (val > 10) ? "Value is Greater than 10" : "Value is Less than 10";

            System.out.println(str);
        } else {
            System.out.println("Please! Enter an integer values...");
        }

        scan.close();

    }
}