import java.util.Scanner;

class array {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter an Integer value: ");
        if (scan.hasNextInt()) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
        }

        System.out.println("\nStored Array Values...");
        for (int val : arr) {
            System.out.println(val);
        }

        scan.close();
    }
}