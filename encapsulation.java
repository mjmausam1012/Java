import java.util.Scanner;

class encapsulation {
    private String Name, Mob;
    private int Roll;

    public encapsulation(String Name, String Mob, int Roll) {
        this.Name = Name;
        this.Mob = Mob;
        this.Roll = Roll;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setMob(String Mob) {
        this.Mob = Mob;
    }

    public String getMob() {
        return Mob;
    }

    public void setRoll(int Roll) {
        this.Roll = Roll;
    }

    public int getRoll() {
        return Roll;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scan.nextLine();
        System.out.print("Enter your Mob: ");
        String mob = scan.nextLine();
        System.out.print("Enter your Roll: ");
        int roll = scan.nextInt();

        encapsulation obj = new encapsulation(name, mob, roll);

        System.out.println("\nShow your Student Details: ");
        System.out.println("Name: " + obj.getName() + "\nRoll: " + obj.getRoll() + "\nMob: " + obj.getMob());

        scan.close();

    }
}