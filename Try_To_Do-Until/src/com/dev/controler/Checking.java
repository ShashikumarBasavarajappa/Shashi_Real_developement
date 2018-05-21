package com.dev.controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.dev.model.Users;
import com.dev.service.Connector_code;
import com.dev.service.Delete_code;
import com.dev.service.Search_Code;
import com.mysql.jdbc.PreparedStatement;

class Checking {
	public static void main(String[] args) throws SQLException {
		System.out.println("=-====================");

		Thread t = new Thread();
		System.out.println(t);

		Connector_code con = new Connector_code();
		Connection con1 = null;
		con1 = con.sample();

		System.out.println(con1);

		String sql = "select * from users";
		Statement stm = con1.createStatement();

		ResultSet res = stm.executeQuery(sql);
		Users us = new Users();
		List<Users> ls = new ArrayList<Users>();
		while (res.next()) {
			System.out.println(res.getString(2));
			System.out.println(res.getInt(1));

			us.setId(res.getInt(1));
			us.setName(res.getString(2));
			ls.add(us);
		}

		Iterator<Users> itr = ls.iterator();

		for (Users e : ls) {
			System.out.println("Id : " + e.getId());
			System.out.println("Name : " + e.getName());
		}

		// try to do the insertion operation with thread coding

		Delete_code dl = new Delete_code();
		dl.delete_main_code();

		String sql1 = "insert into users (id,name)" + "values (? , ?)";
		PreparedStatement pp = (PreparedStatement) con1.prepareStatement(sql1);

		pp.setInt(1, 112);
		pp.setString(2, "hh");
		pp.execute();

		Search_Code ss =  new Search_Code();
		
		ss.search_User();
		

		ResultSet res1 = stm.executeQuery(sql);
		Users us1 = new Users();
		List<Users> ls1 = new ArrayList<Users>();
		while (res1.next()) {
			System.out.println("After CHanges " + res1.getString(2));
			System.out.println(res1.getInt(1));

			us1.setId(res1.getInt(1));
			us1.setName(res1.getString(2));
			ls1.add(us1);
		}

				
	}
}
