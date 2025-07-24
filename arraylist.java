import java.util.ArrayList;

class arraylist {
public static void main(String args[]) {
ArrayList<Integer> list = new ArrayList<>();
ArrayList<String> name = new ArrayList<>();

list.add(1);
list.add(2);
list.add(3);
list.add(4);

name.add("Mausam");
name.add("Raushan");
name.add("Jitesh");

String name1 = name.get(2);
System.out.println(name + "\t" + name1);
System.out.println(list);

}
}
