package com.employeepayroll;

import java.util.Scanner;

public class EmployeeService {

	public static void main(String[] args) {
		
		EmployeePayRoll service = new EmployeePayRoll();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter ID : ");
		int id = scan.nextInt();
		service .setId(id);
		
		System.out.println("Enter Name :");
		String name = scan.next();
		service.setName(name);
		
		System.out.println("Enter Salary : ");
		int salary = scan.nextInt();
		service .setSalary(salary);
		System.out.println("Employee Details :\n"+service);
		
	}
}
