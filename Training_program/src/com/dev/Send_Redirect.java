package com.dev;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Send_Redirect")
public class Send_Redirect extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("**");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		ServletContext config = getServletContext();
		Enumeration<String> enum1 = config.getInitParameterNames();

		while (enum1.hasMoreElements()) {
			String str = enum1.nextElement();
			System.out.println("+*************+" + config.getInitParameter(str));
		}
		String Driver = config.getInitParameter("username");
		String n = req.getParameter("last_name");

		out.print("Welcome " + n);
		Cookie c = new Cookie("username", n);

		System.out.println("=========" + c);
		res.addCookie(c);

		out.print("<form action='Servlet2' method='post'>");
		out.print("<input type='submit' value='go'>");
		out.print("</form>");

		out.close();
	}
}
