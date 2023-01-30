package org.project;

import org.client.Client;
import org.company.Company;
import org.emp.Employee;

public class Project {
	
	private void projectName() {
	System.out.println("ProjectName : Selenium");	
	}

	public static void main(String[] args) {
		
		Employee s = new Employee();
		 s.empName();
		 
		 Company l = new Company();
		 l.companyName();
		 
		 Client c = new Client();
		 c.clientName();
		 
		 Project p = new Project();
		 
		 p.projectName();
		 
	}

}
