package com.CarShowroomManagement;

//import java.awt.Menu;
import java.util.Scanner;

public class Main {

	public static void showMenuAgain(int num) {
		// (num == 1) ? menu() : exitShowShoomManagement();

		if (num == 1) {
			menu();
		} else {
			exitShowShoomManagement();
			// System.out.println("Exit");
		}
	}

	public static void exitShowShoomManagement() {
		System.out.println("Thank You");
	}

	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter Your Choice - ");
		System.out.println("Choose 1 option");
		System.out.println();
		System.out.println("1. Add ShowRoom ");
		System.out.println("2. Show ShowRoom ");
		System.out.println("3. Add Employee ");
		System.out.println("4. Show Employee ");
		System.out.println("5. Add Car");
		System.out.println("6. Show All Cars");

		// System.out.println("5. Exit");
		int choice = scanner.nextInt();
		services(choice);

	}

	public static void services(int choice) {

		while (choice > 0 || choice < 5) {

			switch (choice) {
			case 1:
				menuFunction.addShowRoom();
				break;
			case 2:
				menuFunction.showAllShowRoom();
				break;
			case 3:
				menuFunction.addEmployee();
				break;
			case 4:
				menuFunction.showAllEmployee();
				break;
			case 5:
				menuFunction.addCar();
				break;
			case 6:
				menuFunction.showAllCars();
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

			break;

		}
		System.out.println("Show Menu Again ? (1/0)");
		Scanner scanner = new Scanner(System.in);
		int showMenuAgainChoice = scanner.nextInt();
		showMenuAgain(showMenuAgainChoice);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to ShowRoom Management System");

		System.out.println();

		menu();

	}
}
