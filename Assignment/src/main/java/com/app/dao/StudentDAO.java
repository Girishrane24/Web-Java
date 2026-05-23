package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import app.java.model.Student;

public class StudentDAO {

    // static method to create connection with database
    public static Connection getConnection()
            throws ClassNotFoundException, SQLException {

        // Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Found");

        // Create Connection
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Resultdb",
                "root",
                "root");

        System.out.println("Connection Established");

        return con;
    }

    // method to insert student data
    public static int StudentRegistration(Student e1)
            throws SQLException, ClassNotFoundException {

        int i = 0;

        try {

            // check object
            System.out.println("e1 = " + e1);

            // create connection
            Connection con = getConnection();

            // prepare SQL query
            PreparedStatement pstmt = con.prepareStatement(
                    "INSERT INTO Student "
                    + "(PRN,StudentName,Subject1,Subject2,"
                    + "Subject3,Subject4,Subject5,Total,"
                    + "Percentage,Statusval) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?)");

            // set values
            pstmt.setString(1, e1.getPRN());
            pstmt.setString(2, e1.getStudentName());

            pstmt.setDouble(3, e1.getSubject1());
            pstmt.setDouble(4, e1.getSubject2());
            pstmt.setDouble(5, e1.getSubject3());
            pstmt.setDouble(6, e1.getSubject4());
            pstmt.setDouble(7, e1.getSubject5());

            pstmt.setDouble(8, e1.getTotal());
            pstmt.setDouble(9, e1.getPercentage());

            
            pstmt.setString(10, e1.getStatusval());

            // execute query
            i = pstmt.executeUpdate();
            	
            System.out.println("Rows Inserted = " + i);

            // close connection
            con.close();

        } catch (Exception e2) {

            // print actual error
            e2.printStackTrace();
        }

        return i;
    }
}