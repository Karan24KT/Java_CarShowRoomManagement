package com.CarShowroomManagement;

import java.util.Scanner;

public class Showroom implements Utility {

	public static String showRoomName;

	public static int showRoomId;

	public static String showRoomAddress;

	public static int noOfEmployee;

	public static int noOfCars;

	// public static String managerName;

	public static int noOfFloor;

	public static float showRoomRating;

	public static int showRoomCount = 0;

	@Override
	public void setDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter ShowRoom Details");
		System.out.println();
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ShowRoom Name");
		showRoomName = scanner.nextLine();

		System.out.println("Enter ShowRoom Id");
		showRoomId = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		System.out.println("Enter ShowRoom Address");
		showRoomAddress = scanner.nextLine();

		// System.out.println();
		System.out.println("Enter ShowRoom EmployeeCount");
		noOfEmployee = scanner.nextInt();

		System.out.println("Enter ShowRoom CarCount");
		noOfCars = scanner.nextInt();

		System.out.println("Enter ShowRoom FloorCount");
		noOfFloor = scanner.nextInt();

		System.out.println("Enter ShowRoom Rating Out Of 10");
		showRoomRating = scanner.nextFloat();

	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("ShowRoom Name - " + showRoomName);
		System.out.println("ShowRoom Id - " + showRoomId);
		System.out.println("ShowRoom Address - " + showRoomAddress);
		// System.out.println("ShowRoom Manager - " + managerName);
		System.out.println("ShowRoom Employee Count - " + noOfEmployee);
		System.out.println("ShowRoom Car Count - " + noOfCars);
		System.out.println("ShowRoom Floor Count - " + noOfFloor);
		System.out.println("ShowRoom Rating - " + showRoomRating);

	}

}
