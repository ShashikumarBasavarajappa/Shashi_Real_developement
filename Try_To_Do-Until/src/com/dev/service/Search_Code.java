package com.dev.service;

import java.sql.Connection;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public class Search_Code {

	public void search_User() {
		try {
			
			String sql = "select * from users where "+ "id=?";
			
			Connector_code coo =  new Connector_code(); 
			Connection con  = coo.sample();
			
			PreparedStatement pp =  (PreparedStatement) con.prepareStatement(sql);
			
			pp.setInt(1, 112);
			
			ResultSet rr = pp.executeQuery();
			
			if(rr.next() == false) {
				System.out.println("================= Not exisit_++++++++++");
			}
			else {
				System.out.println("=========Exist==========");
				
				String sql1 = "update users set name='Basavarajappa' where id=?";
				
				PreparedStatement ppp =  (PreparedStatement) con.prepareStatement(sql1);
				ppp.setInt(1, 112);
				ppp.execute();
			}
			
			System.out.println(rr);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
