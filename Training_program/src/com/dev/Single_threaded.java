package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Single_threaded
 */
@WebServlet("/Single_threaded")
public class Single_threaded extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =  response.getWriter();
		out.print("before thread sleep");
		try {
			Thread.sleep(10000);
		}catch(Exception e ){
			e.printStackTrace();
		}
		out.print("After thread sleep");
		
		
	}

}
