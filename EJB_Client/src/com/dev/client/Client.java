package com.dev.client;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.ejb.AdderImplRemote;

/**
 * Servlet implementation class Client
 */
@WebServlet("/Client")
public class Client extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("================= passign here man");
		try {
			Context context =  new InitialContext();
			AdderImplRemote addpl = (AdderImplRemote)context.lookup("st1");
			addpl.add(2, 3);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
