package com.placements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeForm {

	//public static String value="yes";


	public static void main(String[] args) {
		System.out.println("program to save list of employee objects");
		String name = "";
		Double salary = null;
		String department="";
		String value = "y";
		Scanner scan = new Scanner(System.in);
		List<Employee> employeeInfo = new ArrayList();

		while (value.equalsIgnoreCase("Y")) {
			System.out.println("enter name");
			name = scan.next();
			System.out.println("enter salary");
			salary = scan.nextDouble();
			System.out.println("enter department");
			department = scan.next();
			System.out.println("do you want to add more employee, Enter Y to proceed, and N to exit");
			value = scan.next();
			Employee employee = new Employee(name, salary,department);
			employeeInfo.add(employee);
//			System.out.println(value);
		}

		for (Employee x : employeeInfo) {
			System.out.println(x);
		}
//		for (int i = 0; i <= employeeInfo.size()-1; i++) {
//			System.out.println(employeeInfo.size());
//       		System.out.println("here");
//			System.out.println(employeeInfo.get(i));
//		}
	}
}
