class Student {
    public void printDetails() {
        System.out.println("Name: Mausam Kumar");
        System.out.println("Roll No.: 101");
        System.out.println("Mob: 6203826355");
    }

}

class Teacher extends Student {
    public void teacherDetails() {
        System.out.println("Name: Abhishek Kumar");
        System.out.println("Id: 23104");
        System.out.println("Mob: 9621228161");
    }

}

public class inheritance {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teacherDetails();
        obj.printDetails();
    }
}
