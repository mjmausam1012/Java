class string {

    int num = 456;

    public static void main(String args[]) {
        String str = "Mausam";
        String str2 = new String(" Hello! Mausam");

        char[] charArr = { 'H', 'E', 'L', 'L', 'O' };
        String str3 = new String(charArr);

        System.out.println(str + "\n" + str2 + "\n" + str3 + "\n" + str.length() + "\n" + str.equals(str2));
        System.err.println(str2.toUpperCase());
        System.err.println(str2.toLowerCase());
        System.err.println(str2.trim());

        string obj = new string();
        System.out.println(obj.num);
    }
}