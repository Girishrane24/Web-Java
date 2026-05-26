package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.app.dao.StudentDAO;

import app.java.model.Student;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/serv2")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
		
		// get the parameter
		String studprn = request.getParameter("studprn");
		String studname = request.getParameter("studname");
		double sub1 = Double.parseDouble(request.getParameter("sub1"));
		double sub2 = Double.parseDouble(request.getParameter("sub2"));
		double sub3 = Double.parseDouble(request.getParameter("sub3"));
		double sub4 = Double.parseDouble(request.getParameter("sub4"));
		double sub5 = Double.parseDouble(request.getParameter("sub5"));
		
		double total = 0;
		
		// Add all subject data to total variable
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		
		// calculate percentage
		double percentage = 0;
		percentage = (total / 500) * 100;
		
		// check if student pass or not
		String statusval = "";
		
		if(percentage < 35.0) {
			statusval = "Fail";
		}
		else {
			statusval = "Pass";
		}
		System.out.println("I am here in registration form");
		// create new object for Student class
		Student e = new Student();
		e.setPrn(studprn);
		e.setStudentName(studname);
		e.setSubject1(sub1);
		e.setSubject2(sub2);
		e.setSubject3(sub3);
		e.setSubject4(sub4);
		e.setSubject5(sub5);
		e.setTotal(total);
		e.setPercentage(percentage);
		e.setStatusval(statusval);
		
		int status = StudentDAO.StudentRegistration(e);
		
			if(status == 1) {

			    pw.write("<h2>Registration Successful</h2>");
			    
			    pw.write("<h2> Please refresh the page for new student update </h2>");
			}
			else {
			    pw.write("<h1>Registration Failed</h1>");
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
