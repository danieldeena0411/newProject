package org.phone;

public class PhoneInfo {

	private void phoneName() {
		System.out.println("Phone Name : Apple Iphone 11");
}
	private void phoneImeiNum() {
		System.out.println("Phone Imei Num : 152482565812546");
		}
	private void camera() {
		System.out.println("Camera : 12+12MP|12MP");
		}
	private void storage() {
		System.out.println("Storage : 64GB/4 GB");
		}
	private void osName() {
		System.out.println("Os Name : iOS");
		}
public static void main(String[] args) {
	PhoneInfo s = new PhoneInfo();
	s.phoneName();
	s.phoneImeiNum();
	s.camera();
	s.storage();
	s.osName();
}
}

