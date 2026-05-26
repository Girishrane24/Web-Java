package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Student;
import com.utility.DBConnector;

public class StudentDAO {

    

    public int registerStudent(Student s) {

        int status = 0;

        try {
        	Connection con;
            con = DBConnector.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "insert into student(fullname,email,password) values(?,?,?)");

            ps.setString(1, s.getFullname());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getPassword());

            status = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public boolean validateStudent(String email, String password) {

        boolean status = false;

        try {
        	Connection con;
            con = DBConnector.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "select * from student where email=? and password=?");

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            status = rs.next();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return status;
    }
}