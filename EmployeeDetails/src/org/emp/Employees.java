package org.emp;

public class Employees {

	private void empId(int id) {
		
		System.out.println("Emp ID :"+id);
			}
	private void empId(String name,long phneno) {
		
		System.out.println("Emp Name:"+name);
		System.out.println("Emp phneno:"+phneno);
		}
	
	private void empId(char gender,float percent) {
		
		System.out.println("Emp Gender:"+gender);
		System.out.println("Emp Percent:"+percent);
		
	}
	
	public static void main(String[] args) {
		
		Employees e = new Employees();
		e.empId(1);
		e.empId("jeeva",7854623468l);
		e.empId('M', 78.333f);
		
		
	}
}



