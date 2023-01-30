package org.edu;

public class Arts1 extends Education {

public void bsc() {
	System.out.println("BSC:UG");

}
	
public void bed() {
	System.out.println("Bed:UG");

}	

public void ba() {
	System.out.println("BA:UG");

}


public void bba() {
	System.out.println("BBA:UG");

}

@Override
	public void ug() {
		System.out.println("UG: BE,BBA,BSC....");
	}

	@Override
		public void pg() {
			System.out.println("PG:MBA,ME,MCA");
		}
	
	public static void main(String[] args) {
		Arts1 a = new Arts1();
		a.ug();
		a.pg();
		a.bsc();
		a.bba();
		a.bed();
		a.ba();
		
	}
}
