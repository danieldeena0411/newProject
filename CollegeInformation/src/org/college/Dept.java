package org.college;

public class Dept {
public void deptName() {
	System.out.println("Dept Name : CSE");

}

public static void main(String[] args) {
	
	College c =new College();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	
	Student s = new Student();
	s.studentName();
	s.studentDept();
	s.studentId();
	
	Hostel h = new Hostel();
	h.hostelName();
	
	Dept d = new Dept();
	d.deptName();
}

}

