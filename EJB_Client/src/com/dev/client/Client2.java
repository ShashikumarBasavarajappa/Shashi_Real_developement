package com.dev.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.ejb.BankRemote;

/**
 * Servlet implementation class Client2
 */
@WebServlet("/Client2")
public class Client2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Context context  = new InitialContext();
			BankRemote bk =  (BankRemote)context.lookup("stateful123");
			response.setContentType("text/html");
			PrintWriter out =  response.getWriter();
			
			String operation =  request.getParameter("operation");
			System.out.println("=======************" + operation);
			int amount = Integer.parseInt(request.getParameter("amount"));
			if(operation == null) {
				out.print("PLease select any one of the Option");
				request.getRequestDispatcher("home.jsp").include(request, response);
			}
			out.print("<a href='home.jsp'> GO to Home Page </a>");
			if(operation.equals("deposit")) {
				bk.deposit(amount);
			}else if(operation.equals("withdraw")) {
				 boolean status = bk.withdraw(amount);
				 if(status) {
					 out.print("Amount successfully withdrawn!");  
				 }else {
					 out.print("enter lesser amount");
				 }
			}else if(operation.equals("checkbalance")){
				out.print(bk.getbalance());
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}

}
