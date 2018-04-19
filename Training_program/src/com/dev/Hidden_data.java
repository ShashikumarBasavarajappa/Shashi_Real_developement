package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hidden_data
 */
@WebServlet("/Hidden_data")
public class Hidden_data extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		String name = request.getParameter("hidden_search");
		System.out.println(name);
		PrintWriter out =  response.getWriter();
		out.print("<form action='Second_servlet'>");
		out.print("<input type='text' name='new_name'>");
		out.print("<input type='hidden' name='uname' value='"+name+"'>");
		out.print("<input type='submit' value='data_submit'>");
		out.print("</form>");
	}

}
