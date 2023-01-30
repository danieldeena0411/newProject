package org.stu;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Student Id	: ");
		short stuId = s.nextShort();
		System.out.println("Student Name: ");
		String stuName = s1.nextLine();
		System.out.println("Tamil		: ");
		short mark1 = s.nextShort();
		System.out.println("English		: ");
		short mark2 = s.nextShort();
		System.out.println("Maths		: ");
		short mark3 = s.nextShort();
		System.out.println("Science		: ");
		short mark4 = s.nextShort();
		System.out.println("Social		: ");
		short mark5 = s.nextShort();
		System.out.println("Total		: ");
		short total = s.nextShort();
		System.out.println("average		: ");
		float avg = s.nextFloat();
		
		System.out.println("Student Details");
		System.out.println("===============");
		System.out.println("Student Id	: "+stuId);
		System.out.println("Student Name: "+stuName);
		System.out.println("Tamil		: "+mark1);
		System.out.println("English		: "+mark2);
		System.out.println("Maths		: "+mark3);
		System.out.println("Science		: "+mark4);
		System.out.println("Social		: "+mark5);
		System.out.println("Total		: "+total);
		System.out.println("Average		: "+avg);
		
		
		
	}

}
