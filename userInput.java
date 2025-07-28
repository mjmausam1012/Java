import java.util.Scanner;

class userInput {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer value: ");

        if (scan.hasNextInt()) {
            int num1 = scan.nextInt();
            System.out.println("Integer value is: " + num1);
        } else {
            System.out.println("Please ! Enter Integer Value...");
        }

        System.out.print("Enter a float value: ");

        if (scan.hasNextFloat()) {
            float val1 = scan.nextFloat();
            System.out.println("Float value is: " + val1);
        } else {
            System.out.println("Please ! Enter Float Value...");
        }

        scan.close();

    }
}