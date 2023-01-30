package org.bank;

public class BankInfo extends AxisBank {

	public void saving() {
		System.out.println("Saving : Interest Bearing Deposit Account");
		

	}
	
	public void fixed() {
		System.out.println("Fixed : Invesement Instrument Offered by Banks");
		
}
	
	
	public static void main(String[] args) {
		
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
	}
}
