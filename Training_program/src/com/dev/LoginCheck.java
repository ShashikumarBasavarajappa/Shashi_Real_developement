package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {

	public void init() {
		System.out.println("Starting login servlet here----");
	}
    public LoginCheck() {
        super();       
    }

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out  =  response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("name");
		//String username =  "shashi";
		if(username.equals("shashi")) {
		Cookie ck=new Cookie("name",username);  
		response.addCookie(ck);
		  out.print("You are successfully logged in!");  
          out.print("Welcome, " + username);
		} else {
			out.print("Seems to not ok with the Data");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
	}

}
