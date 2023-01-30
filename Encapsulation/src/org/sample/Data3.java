package org.sample;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Data3 {
	
	public static void main(String[] args) {
		
		Data2 d = new Data2();
		d.setAge(18);
		d.setName("Rocky");
		d.setPhno(7852186542l);
		
		Data2 d1 = new Data2();
		
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter your Age:");
		
		int age = s.nextInt();
		d1.setAge(age);
		d1.setName("rambo");
		d1.setPhno(7521245231l);
		
		Set<Data2> s1= new LinkedHashSet<>();
		s1.add(d);
		s1.add(d1);
		
	for(Data2 x:s1) {
		System.out.println("age:"+x.getAge());
		System.out.println("name:"+x.getName());
		System.out.println("phno:"+x.getPhno());
	}
		
		
	}

}
