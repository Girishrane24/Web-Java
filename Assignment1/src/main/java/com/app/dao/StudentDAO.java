package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import app.java.model.Student;

public class StudentDAO {

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Resultdb",
                    "root",
                    "root");

        } catch (Exception e) {

            e.printStackTrace();
        }

        return con;
    }

    public static int StudentRegistration(Student e1) {

        int status = 0;

        try {

            Connection con = getConnection();

            PreparedStatement pstmt = con.prepareStatement(
                    "INSERT INTO Student VALUES(?,?,?,?,?,?,?,?,?,?)");

            pstmt.setString(1, e1.getPrn());
            pstmt.setString(2, e1.getStudentName());

            pstmt.setDouble(3, e1.getSubject1());
            pstmt.setDouble(4, e1.getSubject2());
            pstmt.setDouble(5, e1.getSubject3());
            pstmt.setDouble(6, e1.getSubject4());
            pstmt.setDouble(7, e1.getSubject5());

            pstmt.setDouble(8, e1.getTotal());
            pstmt.setDouble(9, e1.getPercentage());

            pstmt.setString(10, e1.getStatusval());

            status = pstmt.executeUpdate();

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return status;
    }
}