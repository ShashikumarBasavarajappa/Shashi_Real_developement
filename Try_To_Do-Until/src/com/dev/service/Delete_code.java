package com.dev.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Delete_code {

	public void delete_main_code() throws SQLException {
		
		String sql  =  "delete from users where id=112";
		
		Connector_code conn =  new Connector_code();
		
		Connection con =  conn.sample();
		
		PreparedStatement pp = (PreparedStatement) con.prepareStatement(sql);
		
		pp.execute();
	}
}
