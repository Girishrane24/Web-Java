package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private static Connection con;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {


            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/course_registration_system",
                    "root",
                    "root");

        return con;
}
}
