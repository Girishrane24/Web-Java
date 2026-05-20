package com.app;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Serv1
 */
@WebServlet("/serv1")
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv1() {
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

        // Get form values
        String uname = request.getParameter("txtUserName");
        String pwd = request.getParameter("txtPassword");

        // Validation
        
        if(uname.equals("admin") && pwd.equals("admin123")) {
       // if("admin".equals(uname) && "admin123".equals(pwd)) {
            // Forward request to another servlet
            RequestDispatcher rd =
                    request.getRequestDispatcher("serv3");

            rd.forward(request, response);

        } else {

            pw.write("Invalid name");

            // Include login page again
            
            request.getRequestDispatcher("login.html").include(request, response);

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
