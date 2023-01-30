package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {
	
	public static void main(String[] args) {
	
		Connection con = null;
		
		// 1. Load the Driver
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		// 2. Connect to database 
			
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
			
		//3. Write a SQL Query
			 
			 String query = "select * from student";
			 
		//4. Prepare the statement
			 
			 PreparedStatement ps = con.prepareStatement(query);
			 
		//5. Execute Query
			 
			 ResultSet rs = ps.executeQuery();
			 
		//6. Iterate the results 
			 while (rs.next()) {
				 String stuName = rs.getString("sname");
				 System.out.println("Student Name: "+stuName);
				 
				 int stuId = rs.getInt("sid");
				 
				 System.out.println("Student ID: "+stuId);
				 
				 int courseId = rs.getInt("cid");
				 
				 System.out.println("Course ID: "+courseId);
				 
			 }
			 
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		finally {
			
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
			 
			 
			 
				
			
		
	

	
