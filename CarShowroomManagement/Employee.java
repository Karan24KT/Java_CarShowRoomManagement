package com.CarShowroomManagement;

import java.util.Scanner;

public class Employee extends Showroom implements Utility {

	String employeeName;
	int employeeId;
	int employeeAge;

	int showRoomId;

	@Override
	public void setDetails() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		employeeName = scanner.nextLine();

		System.out.println("Enter Employee Id");
		employeeId = scanner.nextInt();

		System.out.println("Enter Employee Age");
		employeeAge = scanner.nextInt();

		System.out.println("Enter Showroom Id");
		showRoomId = scanner.nextInt();
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		// super.getDetails();
		System.out.println("Employee Name - " + employeeName);
		System.out.println("Employee Id - " + employeeId);
		System.out.println("Employee Age - " + employeeAge);
		System.out.println("Employee ShowRoom Id  - " + showRoomId);
	}

}
