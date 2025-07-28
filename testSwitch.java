import java.util.Scanner;

class testSwitch {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number between 1 to 12: ");
		int num = scan.nextInt();

		String season = "";

		switch (num) {

			case 1:
				season = "January";
				break;
			case 2:
				season = "February";
				break;
			case 3:
				season = "March";
				break;
			case 4:
				season = "April";
				break;
			case 5:
				season = "May";
				break;
			case 6:
				season = "June";
				break;
			case 7:
				season = "July";
				break;
			case 8:
				season = "August";
				break;
			case 9:
				season = "September";
				break;
			case 10:
				season = "October";
				break;
			case 11:
				season = "November";
				break;
			case 12:
				season = "December";
				break;
			default:
				System.out.println("Please! Enter a valid input...");
				break;
		}

		System.out.println("Season is: " + season);

		scan.close();

	}
}