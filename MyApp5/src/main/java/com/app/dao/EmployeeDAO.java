package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.model.Employee;

public class EmployeeDAO {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		// Search for Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		
		// create connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");
		System.out.println("Connection Establish");
		
		// if connection establish and Driver found then return result
		return con;
	}
	
	public static int EmployeeRegistration(Employee e1) throws SQLException, ClassNotFoundException {
		
		int i = 0;
		try {
		// check if object coming or not
		System.out.println("e = " +e1);
		
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("Insert into employee"
				+ "(firstName,password,email,gender,age) "
				+ "values(?,?,?,?,?)");
		
		pstmt.setString(1, e1.getFirstName());
		pstmt.setString(2, e1.getPassword());
		pstmt.setString(3, e1.getEmail());
		pstmt.setString(4, e1.getGender());
		pstmt.setString(5, e1.getAge());
		
		i = pstmt.executeUpdate();
		
	
		return i;
		}catch(Exception e2) {
			return i;
		}
	}
	
}
