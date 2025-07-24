class staticEx {

    public static void print() {
        System.out.println("Mj Mausam");
    }

    public static void main(String args[]) {
        print();

        inner obj = new inner();
        obj.inner();
    }


    static class inner {
        public static void inner() {
            System.out.println("Mausam Kumar");

            print();
        }
    }
}