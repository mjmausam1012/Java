import java.util.Scanner;

class constructor {
    String name;
    int roll;
    String course;
    String mob;

    constructor(String name, int roll, String course, String mob) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.mob = mob;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scan.nextLine();
        System.out.print("Enter your Course: ");
        String course = scan.nextLine();
        System.out.print("Enter your Mob: ");
        String mob = scan.nextLine();
        System.out.print("Enter your Roll: ");
        int roll = scan.nextInt();

        constructor obj = new constructor(name, roll, course, mob);

        System.out.println("Show your Details...");
        System.err
                .println("Name: " + obj.name + "\nRoll: " + obj.roll + "\nCourse: " + obj.course + "\nMob: " + obj.mob);

        scan.close();
    }

}