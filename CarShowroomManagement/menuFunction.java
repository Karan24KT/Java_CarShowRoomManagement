package com.CarShowroomManagement;

//Simport java.util.Iterator;

public class menuFunction {

	static Showroom[] showRooms = new Showroom[5];
	static Employee[] employees = new Employee[5];
	static Car[] cars = new Car[5];

	static int showRoomCount = 0;
	static int employeeCount = 0;
	static int carCount = 0;

	public static void addShowRoom() {
		System.out.println("Add ShowRoom Func");

		showRooms[showRoomCount] = new Showroom();
		showRooms[showRoomCount].setDetails();
		showRoomCount++;

		System.out.println();
	}

	public static void showAllShowRoom() {
		System.out.println("Show AllShowRoom Func");
		for (int i = 0; i < showRooms.length; i++) {
			if (showRooms[i] != null) {
				showRooms[i].getDetails();
				System.out.println();
			}
		}
	}

	public static void addEmployee() {
		System.out.println("Add Employee Func");

		employees[employeeCount] = new Employee();
		employees[employeeCount].setDetails();
		employeeCount++;

		System.out.println();

	}

	public static void showAllEmployee() {
		System.out.println("Show All Employee Func");
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null) {
				employees[i].getDetails();
				System.out.println();
			}
		}
	}

	public static void addCar() {
		System.out.println("Add car Func");

		cars[carCount] = new Car();
		cars[carCount].setDetails();
		carCount++;

		System.out.println();

	}

	public static void showAllCars() {
		System.out.println("Show All cars Func");
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null) {
				cars[i].getDetails();
				System.out.println();
			}
		}
	}

}
