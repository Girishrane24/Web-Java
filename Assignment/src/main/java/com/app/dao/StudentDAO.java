package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDAO {

public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		// Search for Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		
		// create connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Resultdb", "root", "root");
		System.out.println("Connection Establish");
		
		// if connection establish and Driver found then return result
		return con;
	}
	
}
