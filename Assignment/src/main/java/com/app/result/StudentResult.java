package com.app.result;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Result
 */
@WebServlet("/serv1")
public class StudentResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        String prn = request.getParameter("prn");

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	// get connection
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Resultdb",
            		"root","root");

            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Student WHERE PRN=?");
            
            // read PRN from database
            pstmt.setString(1, prn);

            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {

                pw.write("<h1>Student Result</h1>");

                pw.write("<table border='1'>");

                pw.write("<tr>");
                pw.write("<td>PRN</td>");
                pw.write("<td>"+ rs.getString("PRN")+ "</td>");
                pw.write("</tr>");

                pw.write("<tr>");
                pw.write("<td>Name</td>");
                pw.write("<td>"+ rs.getString("StudentName")+ "</td>");
                pw.write("</tr>");

                pw.write("<tr>");
                pw.write("<td>Percentage</td>");
                pw.write("<td>"
                    + rs.getDouble("Percentage")
                    + "</td>");
                pw.write("</tr>");

                pw.write("<tr>");
                pw.write("<td>Status</td>");
                pw.write("<td>"
                    + rs.getString("Statusval")
                    + "</td>");
                pw.write("</tr>");

                pw.write("</table>");

            } else {

                pw.write("<h1>No Student Found</h1>");
            }

            con.close();

        } catch(Exception e) {

            e.printStackTrace();
        }
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
