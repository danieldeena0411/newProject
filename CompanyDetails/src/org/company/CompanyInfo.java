package org.company;

public class CompanyInfo {
	
	private void companyName() {
		System.out.println("Company Name : DCD Technology");
}
private void companyId() {
	System.out.println("Company Id : 1996");
	}
private void companyAddress() {
	System.out.println("Company Address : Bangalore");
	}

public static void main(String[] args) {

	CompanyInfo s = new CompanyInfo();
	s.companyName();
	s.companyId();
	s.companyAddress();
}
}
