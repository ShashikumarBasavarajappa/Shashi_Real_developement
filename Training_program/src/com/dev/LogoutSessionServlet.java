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
 * Servlet implementation class LogoutSessionServlet
 * Shashi kumar J B
 * 
 */
@WebServlet("/LogoutSessionServlet")
public class LogoutSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LogoutSessionServlet() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out  =  response.getWriter();
		
		HttpSession hts =  request.getSession(false);
		
		if(hts !=null) {
			out.print(" Sucessfully logged out from here");
			hts.invalidate();
		}

	}

}
