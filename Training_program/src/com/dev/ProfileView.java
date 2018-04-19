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
 * Servlet implementation class ProfileView
 */
@WebServlet("/ProfileView")
public class ProfileView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ProfileView() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ck[] =  request.getCookies();
		String username = ck[0].getValue();
		System.out.println("========profile==" + username);
		
		response.setContentType("text/html");
		PrintWriter pw =  response.getWriter();
		if(!username.equals("dasds")) {
			pw.print("Welcome   " + username);
			pw.print("you succefully logged in");
		}else {
			pw.print("Please login first==");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		pw.close();		
	}

}
