package org.company;

public class CompanyInfos {
	
	private void CompanyName(int code,String name) {
		System.out.println("Company ID:"+code);
		System.out.println("Company Name:"+name);
		}
	private void CompanyName(int rank,String address,float turnover) {
		System.out.println("Company Rank:"+rank);
		System.out.println("Company Address:"+address);
		System.out.println("Company Turnover:"+turnover);

	}
	

public static void main(String[] args) {
	
	CompanyInfos c = new CompanyInfos();
	c.CompanyName(3001, "DCS");
	c.CompanyName(01, "Bangalore", 1000501f);
}		

	}
	
	


