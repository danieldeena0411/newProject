package org.emp;

import java.util.Scanner;

public class Employee {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Scanner s1 = new Scanner(System.in);
		
		Scanner s2 = new Scanner(System.in);
		
		Scanner s3 = new Scanner(System.in);
		
		System.out.println("Enter the Employee ID :");
		
		short empId = s.nextShort();
		
		System.out.println("Enter the Employee Name :");
		
		String empName =s1.nextLine();
		
		System.out.println("Enter the Employee Email :");
		
		String empEmail = s2.nextLine();
		
		System.out.println("Enter the Employee Phone No:");
		
		long empPhoneNo = s.nextLong();
		
		System.out.println("Enter the Employee Salary:");
		
		double empSalary = s.nextDouble();
		
		System.out.println("Enter the Employee Gender:");
		
		char empGender = s.next().charAt(0);
		
		System.out.println("Enter the Employee City:");
		
		String empCity = s3.next();
		
		System.out.println("All the above info are True or False");
		
		Boolean result = s.nextBoolean();
		
		System.out.println("Employee Details");
		System.out.println("================");
		System.out.println("Enter the Employee ID:"+empId);
		System.out.println("Enter the Employee Name:"+empName);
		System.out.println("Enter the Employee Email:"+empEmail);
		System.out.println("Enter the Employee Phone No:"+empPhoneNo);
		System.out.println("Enter the Employee Salary:"+empSalary);
		System.out.println("Enter the Employee Gender:"+empGender);
		System.out.println("Enter the Employee City:"+empCity);
		System.out.println("Result: "+result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
