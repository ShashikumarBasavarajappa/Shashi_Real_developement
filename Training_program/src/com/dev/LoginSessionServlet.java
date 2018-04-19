package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginSessionServlet
 */
@WebServlet("/LoginSessionServlet")
public class LoginSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 PrintWriter out=response.getWriter();  
	        request.getRequestDispatcher("home.jsp").include(request, response);  
	          
	        String name=request.getParameter("name");  
	        String password=request.getParameter("password");  
	         if(password.equals("shashi")) {
	        	 out.print("welcome " + name);
	        	 HttpSession session=request.getSession(); 
	        	 session.setAttribute("username", name);
	         }else{
	        	 out.print(" you don't have access    ");
	        	 request.getRequestDispatcher("session_login_logout.jsp").include(request, response);
	         }
	}

}
