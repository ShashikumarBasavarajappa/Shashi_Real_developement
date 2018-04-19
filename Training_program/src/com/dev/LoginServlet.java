package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws  IOException,ServletException {
		
		PrintWriter out  =  response.getWriter();
		
		//String  username = 
		String username =  "shashi";
		if(username.equals("shashi")) {
		Cookie ck=new Cookie("name",username);  
		response.addCookie(ck);
		  out.print("You are successfully logged in!");  
          out.print("Welcome, " + username);
		} else {
			out.print("Seems to not ok with the Data");
			request.getRequestDispatcher("login.html").include(request, response);
		}
	}
}
