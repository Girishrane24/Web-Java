package databsedemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Resultdb",
                    "root",
                    "root");

            System.out.println("Connection Successful");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}