import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] roygbivColor = { "RED", "ORANGE", "GREEN", "YELLOW", "BLUE", "INDIGO", "VIOLET" };

		int yearsToRetire;
		double bankBalance = 0;
		String vacationDestination = "";
		String rainbowColor = "";
		String modeOfTransportation = "";

		System.out.println("Enter your First Name: ");
		String firstName = input.next();

		System.out.println("Enter your Last Name: ");
		String lastName = input.next();

		System.out.println("Enter your Age: ");
		int age = input.nextInt();

		System.out.println("Enter your number of siblings: ");
		int numberOfSiblings = input.nextInt();

		boolean contains = false;
		do {
			System.out.println("Enter your Favorite ROYGBIV Color: ");
			rainbowColor = input.next();

			for (String s : roygbivColor) {
				if (s.equals(rainbowColor.toUpperCase())) {
					contains = true;
					break;
				}
			}
			if (!contains) {
				System.out.println("Enter \"Help\" for a list of ROYGBIV Colors: ");
				String help = input.next();
				if (help.toUpperCase().equals("HELP")) {
					System.out.println("The ROYGBIV Colors are: Red, Orange, Yellow, Green, Blue, Ingigo and Violet");
				}
			}

		} while (!contains);

		System.out.println("Enter your birth Month in number: ");
		int birthMonth = input.nextInt();

		if (age % 2 == 0) {
			yearsToRetire = 12;
		} else {
			yearsToRetire = 18;
		}

		if (numberOfSiblings < 0) {
			vacationDestination = "Afghanistan";

		} else if (numberOfSiblings > 3) {
			vacationDestination = "Hawaii";

		}
		switch (numberOfSiblings) {
		case 0:
			vacationDestination = "Paris";
			break;
		case 1:
			vacationDestination = "Bahamas";
			break;
		case 2:
			vacationDestination = "Australia";
			break;
		case 3:
			vacationDestination = "Singapore";
		}

		if (birthMonth > 0 && birthMonth <= 4) {
			bankBalance = 45000;
		} else if (birthMonth > 5 && birthMonth <= 8) {
			bankBalance = 85000;
		} else if (birthMonth > 9 && birthMonth <= 12) {
			bankBalance = 100000.00;
		} else {
			bankBalance = 0.00;
		}

		switch (rainbowColor.toUpperCase()) {

		case "RED":
			modeOfTransportation = "Yatch";
			break;
		case "ORANGE":
			modeOfTransportation = "Bike";
			break;
		case "YELLOW":
			modeOfTransportation = "Scooter";
			break;
		case "GREEN":
			modeOfTransportation = "Jaguar";
			break;
		case "BLUE":
			modeOfTransportation = "Horse";
			break;
		case "INDIGO":
			modeOfTransportation = "Taxi";
			break;
		case "VIOLET":
			modeOfTransportation = "Plane";
			break;

		}

		System.out.println(firstName + " " + lastName + " " + "will retire in " + yearsToRetire + " years" + " "
				+ "with" + " " + "$" + bankBalance + " " + "in the bank, a vacation home in " + vacationDestination
				+ " and travel by " + modeOfTransportation);

	}
}