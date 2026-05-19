package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        System.out.println("Servlet2 Instantiated");
    }
    
    @Override
    public void init() throws ServletException{
    	super.init();
    	System.out.println("Initial State");
    }
    
    @Override
    public void destroy() {
    	super.destroy();
    	System.out.println("In destroy()");
    }
    
    public void service(ServletRequest request, ServletResponse response) throws IOException {
    	System.out.println("In service");
    	response.setContentType("text/html");
    	PrintWriter pw = response.getWriter();
    	
    	String name = request.getParameter("");
    	int age = Integer.parseInt(request.getParameter(""))
    	
    	
    }
    
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
