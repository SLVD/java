package com.icss.ch.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Util {
	public static Connection getConnection(){
		Connection conn =null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

  public static void Close1(Connection conn,PreparedStatement ptmt,ResultSet rs){
	  if(conn != null){
		 try{ conn.close();
	  } catch (Exception e) {
		  e.printStackTrace();
	}
	}if (ptmt != null) {
		try {
			ptmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
	}
  }
}
