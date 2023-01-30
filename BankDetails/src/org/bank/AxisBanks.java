package org.bank;

public class AxisBanks extends BankInfos {
	
		@Override
		public void deposit(int deposit) {
		System.out.println("My Deposit is : 99%");
		}

		
		

	
public static void main(String[] args) {
	
	AxisBanks b = new AxisBanks();
	b.saving(58);
	b.deposit(96);
	b.fixed(65);
}


}
