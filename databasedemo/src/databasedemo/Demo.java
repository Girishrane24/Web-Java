package databasedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Scanner s = new Scanner(System.in);
		
		// Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		// Establish the connection
		// Add your argument 
		// Note down your Address, root path and password
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
		System.out.println("Connection Establish!!");
				
		// Prepare statement
		PreparedStatement pstmt = con.prepareStatement("Insert into employee (name,salary) values (?,?)");
		
		System.out.println("Enter Employee name  = ");
		String name = s.next();
		
		System.out.println("Enter Employee Salary  = ");
		double salary = s.nextDouble();
		
		/*
		 * Index parameter and string
		 */
		pstmt.setString(1, name);
		pstmt.setDouble(2, salary);
		
		int i = pstmt.executeUpdate();
		
		if(i == 1) {
			System.out.println("Record inserted");
		}
		else
		{
			System.out.println("Failed");
		}
		
		// Get ResultSet
		ResultSet rs = pstmt.executeQuery("select * from employee");
		System.out.println("--------------");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			
		}
		System.out.println("-----------------");
		s.close();
		
		// close the connection
		con.close();
	}
}
