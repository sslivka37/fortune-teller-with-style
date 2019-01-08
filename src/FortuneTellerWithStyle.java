import java.util.Scanner;

public class FortuneTellerWithStyle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// first and last name
		System.out.println("Enter your first name");
		String firstName = input.nextLine();
			if (firstName.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}

		System.out.println("Enter your last name:");
		String lastName = input.nextLine();
			if (lastName.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}

		// age
		System.out.println("Enter your age in years:");
		String age = input.nextLine();
			if (age.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}

		// birth month
		System.out.println("Enter your birth month number:");
		String month = input.nextLine();
			if (month.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}

		// Favorite color, going to have to loop this
		String colorInput;
		do {
			System.out.println("Enter your favorite ROYGBIV color");
			System.out.println("Type \"help\" to list the ROYGBIV colors.");
			colorInput = input.nextLine();
			if (colorInput.equalsIgnoreCase("help")) {
				System.out.println("The ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, and Violet.");
			} else if(colorInput.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}				
			
		} while (colorInput.equalsIgnoreCase("help"));

		// number of siblings
		System.out.println("Enter your number of siblings:");
		String siblings = input.nextLine();
			if (siblings.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}

		//closing the scanner so no resource leak
		input.close();

		// declaring a variable to use later when going from int to string
		String vacationSiblings;
		String carColor = " ";
		int retirementYears;
		int bankBalance;
		
		//have to parse the original string inputs(to be able to quit program) as integers
		int ageNumber = Integer.parseInt(age);
		int monthNumber = Integer.parseInt(month);
		int siblingsNumber = Integer.parseInt(siblings);
		

		// now conditionals for age odd/even retirement years> seems to work okay
		if (ageNumber % 2 == 1) {
			retirementYears = 30;
		} else {
			retirementYears = 100;
		}

		// now conditionals for birth month and bank balance >works okay
		switch (monthNumber) {
		case 1:
			bankBalance = 100;
			break;
		case 2:
			bankBalance = 100;
			break;
		case 3:
			bankBalance = 100;
			break;
		case 4:
			bankBalance = 100;
			break;
		case 5:
			bankBalance = 1337;
			break;
		case 6:
			bankBalance = 1337;
			break;
		case 7:
			bankBalance = 1337;
			break;
		case 8:
			bankBalance = 1337;
			break;
		case 9:
			bankBalance = 1000000;
			break;
		case 10:
			bankBalance = 1000000;
			break;
		case 11:
			bankBalance = 1000000;
			break;
		case 12:
			bankBalance = 1000000;
			break;
		default:
			bankBalance = 0;
			break;
		}

		// conditionals for siblings and vacation spot
		if (siblingsNumber < 0) {
			vacationSiblings = "Antarctica";
		} else if (siblingsNumber == 0) {
			vacationSiblings = "Hawaii";
		} else if (siblingsNumber == 1) {
			vacationSiblings = "Malibu";
		} else if (siblingsNumber == 2) {
			vacationSiblings = "London";
		} else if (siblingsNumber == 3) {
			vacationSiblings = "New Zealand";
		} else {
			vacationSiblings = "Denver";
		}

		// conditionals for favorite color and car driven
		if (colorInput.equalsIgnoreCase("red")) {
			carColor = "Mustang";
		} else if (colorInput.equalsIgnoreCase("orange")) {
			carColor = "Mercedez";
		} else if (colorInput.equalsIgnoreCase("yellow")) {
			carColor = "Subaru";
		} else if (colorInput.equalsIgnoreCase("green")) {
			carColor = "Honda";
		} else if (colorInput.equalsIgnoreCase("blue")) {
			carColor = "Toyota";
		} else if (colorInput.equalsIgnoreCase("indigo")) {
			carColor = "Yugo";
		} else if (colorInput.equalsIgnoreCase("violet")) {
			carColor = "Tesla";
		} else {
			carColor = "scooter";
		}
	
		
		//final output message
		System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " years, with $"
				+ bankBalance + " in their bank account, and will have a vacation home in " + vacationSiblings
				+ ", and will drive a " + carColor + ".");
		
	}	
	}