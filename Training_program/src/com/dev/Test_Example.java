package com.dev;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test_Example
 */
@WebServlet("/test_Example")
public class Test_Example extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("===========" + config.getServletContext());
		System.out.println("+=======******************+");
	}

	public Test_Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * Servlet class is loaded
	 * 
	 * The classloader is responsible to load the servlet class. The servlet class
	 * is loaded when the first request for the servlet is received by the web
	 * container.
	 * 
	 * Servlet Instance created The web container creates the instance of a servlet
	 * after loading the servlet class. The servlet instance is created only once in
	 * the servlet life cycle.
	 * 
	 * init method is invoked
	 * 
	 * Once instance created Instance method to initiaze the method.
	 * 
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("Welcome to servlet");
		pw.println("</body></html>");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Enumeration enum1  =  request.getHeaderNames();
		while(enum1.hasMoreElements()) {
			System.out.println(enum1.nextElement());
		}
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    out.print("Sorry UserName or Password Error!");  
        RequestDispatcher rd=request.getRequestDispatcher("/home.jsp");        
		rd.include(request, response); 
}

	/* this will destroy the servlet once it's work of servlet id done--- */
	public void destroy() {
		System.out.println("=====i'm destroyed here---=");
	}
}
