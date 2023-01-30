package org.univ;

public class College extends University {
	
@Override
public void ug() {
	System.out.println("UG: BE,BSC,Bed,BBA");
}

@Override
	public void pg() {
		System.out.println("PG: MBA,MSc,ME,Mphil");
	}
	
public static void main(String[] args) {
	
	College c = new  College();
	c.ug();	
	c.pg();
}
}
