package com.dev;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First_Example
 */
@WebServlet("/First_Example")
public class First_Example implements Servlet {
	ServletConfig config = null;
	
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println(" we are initiazed the servlet===");
	}
	

	
	public void destroy() {
		System.out.println("==========destroyed the data====");
	}
	
	public ServletConfig getServletConfig(){return config;}  
	
	public String getServletInfo(){return "copyright 2007-1010";}

	@Override
	public void service(ServletRequest req , ServletResponse res) throws ServletException, IOException {
		System.out.println("=========== entered into response Page =========");
	}
	
	
}
