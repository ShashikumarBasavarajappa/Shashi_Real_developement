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
 * Servlet implementation class SecoundSession
 */
@WebServlet("/SecoundSession")
public class SecoundSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SecoundSession() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		HttpSession hts = request.getSession(false);
		String n = (String) hts.getAttribute("username");
		pw.print("welcome session Data " + n);
	}

}
