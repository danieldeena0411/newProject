package org.com;

public class Desktops implements Hardware,Software {

	@Override
	public void softwareResources() {
		System.out.println("Software Resources : OS,Cloud Computing");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resources:CPU,Printer");
		
	}
	
	public static void main(String[] args) {
		
		Desktops d = new Desktops();
		d.hardwareResources();
		d.softwareResources();
	}

}
