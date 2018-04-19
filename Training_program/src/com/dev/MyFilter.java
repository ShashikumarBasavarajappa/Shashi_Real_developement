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
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/servlet12")
public class MyFilter implements Filter {

	public MyFilter() {

	}

	FilterConfig config;
	public void init(FilterConfig config) throws ServletException {
			this.config = config;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("filter is invoked before");
		String name = request.getParameter("password");
		if (name.equals("admin")) {
			String s=config.getInitParameter("construction");  
			chain.doFilter(request, response);
			out.print("Filter is invoked After ==== " + s);
		} else {
			out.print("it's failed to load");
			request.getRequestDispatcher("home.jsp").include(request, response);
		}
	}

	public void destroy() {

	}

}
