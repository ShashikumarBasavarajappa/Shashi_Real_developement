package com.dev;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPDF
 */
@WebServlet("/ServletPDF")
public class ServletPDF extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/pdf");
		PrintWriter out  =  response.getWriter();
		
		response.setHeader("Content-disposition","inline; filename='shashi.pdf'");  
		
		PDF pdf=new PDF(out);
		
	}

}
