class arguments {
public static void main(String args[]) {

if(args.length != 2) {
System.out.println("Take a valid input...");
return;
}else{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);

int res = a+b;

System.out.println(res);
}
}
}