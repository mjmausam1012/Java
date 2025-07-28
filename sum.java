import java.util.*;

class sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st Num: ");
        int num = scan.nextInt();

        System.out.print("Enter 2nd Num: ");
        int num1 = scan.nextInt();

        int sum = num + num1;
        System.out.println("Sum is: " + sum);
        scan.close();
    }
}