package com.dev.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connector_code {

	public Connection sample() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "shashi");
			
		} catch (Exception e) {
			System.out.println(e);

		}
		return con;
	}

}
