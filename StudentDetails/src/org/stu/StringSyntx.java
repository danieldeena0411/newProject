package org.stu;

public class StringSyntx {

	
	public static void main(String[] args) {
		
		//length of the string
		String s = "computer 123";
		String s1 ="COMPUTER 123";
		int l = s.length();
		System.out.println(l);
		
		String a = s.toUpperCase();
		System.out.println(a);
		
		boolean b = s.equalsIgnoreCase(s1);
		System.out.println(b);
		
		String n = s.concat(s1);
		System.out.println(n);
		
		int i = s.compareTo(s1);
		
		System.out.println(i);
	
	
	
	
	
	
	}
	
	
}
