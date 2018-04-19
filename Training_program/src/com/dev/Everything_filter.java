package com.dev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Everything_filter
 */
@WebFilter("/EV")
public class Everything_filter implements Filter {

	static int count=0;
	@Override
	public void destroy() {
	
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 response.setContentType("text/html");
		 PrintWriter out =  response.getWriter();
		 out.print("=============Hello=====");
		   
		  chain.doFilter(request,response);  
          
	        out.print("<br/>Total visitors "+(++count));  
	        
	}
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

	

}
