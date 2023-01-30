package org.stuinfo;

import java.util.Scanner;

public class StuDetails {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		Scanner s4 = new Scanner(System.in);
		
		System.out.println("Student ID 			: ");
		short stuId = s.nextShort();
		System.out.println("Student Name		: ");
		String stuName = s1.nextLine();
		System.out.println("Student Email   	: ");
		String stuEmail = s2.nextLine();
		System.out.println("Student Phone No 	: ");
		long stuPhneNo = s.nextLong();
		System.out.println("Student Dept        : ");
		String stuDept = s3.nextLine();
		System.out.println("Student Gender      : ");
		char stuGen = s.next().charAt(0);
		System.out.println("Student City        : ");
		String stuCity = s4.nextLine();
		
		System.out.println("Student ID          : "+stuId);
		System.out.println("Student Name        :"+stuName);
		System.out.println("Student Email       :"+stuEmail);
		System.out.println("Student Phone No    :"+stuPhneNo);
		System.out.println("Student Dept        :"+stuDept);
		System.out.println("Student Gender      :"+stuGen);
		System.out.println("Student City        :"+stuCity);
		
		
		
		
	}
	
}
