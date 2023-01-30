package org.pro;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	
	
	public static void main(String[] args) {
		
		List li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(2, 5);
		li.remove(1);
		li.set(1, 45);
		int size = li.size();
		
		
		
		
		System.out.println(li);
		
		
	}

}
