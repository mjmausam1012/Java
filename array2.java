import java.util.Scanner;

class array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        int[][] sumArr = new int[2][2];

        System.out.println("Enter the element in 1st-Array- ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the element in 2nd-Array- ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of 2 Array Element- ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sumArr[i][j] + "\t");
            }
            System.out.print("\n");
        }

        scan.close();
    }
}