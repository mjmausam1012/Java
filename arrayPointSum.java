import java.util.ArrayList;

public class arrayPointSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 9, 8, 10, 7, 3, 6, 1 };
        ArrayList<Integer> arrSet = new ArrayList<>();

        int sum = 10;

        for (int val : arr) {
            int num = sum - val;
            if(arrSet.contains(num)) {
                System.out.println(val + " and " + num);

            }

            arrSet.add(val);

        }
    }
}
