class forEach {
    public static void main(String args[]) {

        String[] fruits = { "Mango", "Apple", "Banana", "Grapes", "Guava" };
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (String fruit : fruits) {
            System.out.println("Fruits: " + fruit);
        }

        for (int number : num) {
            System.out.println("Number is: " + number);
        }

    }
}