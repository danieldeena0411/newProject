package org.phone;



public class Phones {
	
	private void phoneInfo(String model,int camera) {
		System.out.println("Phone Model:"+model);
		System.out.println("Phone Camera:"+camera);

	}
	
	private void PhoneInfo(int ram,int battery) {
		
		System.out.println("Phone RAM :"+ram);
		System.out.println("Phone Battery"+battery);
		
	}
	
	private void PhoneInfo(long imei, int price) {
		System.out.println("Phone IMEI:"+imei);
		System.out.println("Phone Price:"+price);
	

	}
	
	public static void main(String[] args) {
		
		Phones p = new Phones();
		p.phoneInfo("Samsung m30s", 47);
		p.PhoneInfo(8, 5000);
		p.PhoneInfo(545825485269952l, 20000);
	}

}

