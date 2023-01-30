package org.colleges;

public class Students extends College {

	public void studentName() {
		System.out.println("Student Name : Andrew");
		
	}
	
	public void studentDept() {
		System.out.println("Student Dept : CSE");
		

	}
	
	public void studentId() {
		
		System.out.println("Student Id : 04");
	}
	
public static void main(String[] args) {
		
		Students s = new Students();
		s.collegName();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.hostelName();
		s.deptName();
}
		
		
}
