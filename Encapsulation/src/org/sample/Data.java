package org.sample;


import java.util.LinkedList;
import java.util.List;

public class Data {
	
	public static void main(String[] args) {
		
		Data2 d = new Data2();
		d.setAge(18);
		d.setName("Rocky");
		d.setPhno(7852186542l);
		
		Data2 d1 = new Data2();
		d1.setAge(20);
		d1.setName("Denver");
		d1.setPhno(8425125461l);
		
		List<Data2> L = new LinkedList<Data2>();
		
		L.add(d);
		L.add(d1);
		
		for (int i = 0; i < L.size(); i++) {
			
		System.out.println("age:"+L.get(i).getAge());
		System.out.println("name:"+L.get(i).getName());
		System.out.println("phno:"+L.get(i).getPhno());
		
		
		
		}
		
		
		
	}

}
