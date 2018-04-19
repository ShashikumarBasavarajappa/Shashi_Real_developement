package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet2
 */
@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		
		Cookie ck[] =  request.getCookies();
		pw.print("Hello "+ck[0].getValue()); 
		

		
		pw.close();
		
	}
}
