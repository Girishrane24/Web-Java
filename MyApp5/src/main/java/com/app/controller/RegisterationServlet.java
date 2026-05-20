package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.app.dao.EmployeeDAO;
import com.app.model.Employee;

/**
 * Servlet implementation class RegisterationServlet
 */
@WebServlet("/serv2")
public class RegisterationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		// get the parameter
		String fname = request.getParameter("txtFirstName");
		String password = request.getParameter("txtPassword");
		String email = request.getParameter("txtemail");
		String gender = request.getParameter("gender");
		String age = request.getParameter("txtage");
		
		// create new object for Employee class
		Employee e = new Employee();
		e.setFirstName(fname);
		e.setPassword(password);
		e.setEmail(email);
		e.setGender(gender);
		e.setAge(age);
		
		
		try {
			int status = EmployeeDAO.EmployeeRegistration(e);
			
			if(status == 1) {
				response.sendRedirect("login.html");
			}
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("SQL");
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
