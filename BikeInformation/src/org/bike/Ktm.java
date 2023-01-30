package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("KTM BIKE COST: 2,00,000");
		
	}

	@Override
	public void speed() {
		System.out.println("KTM BIKE SPEED : 190kmh");
		
	}
	
	public static void main(String[] args) {
		
		Ktm k = new Ktm();
		k.cost();
		k.speed();
		
	}

}
