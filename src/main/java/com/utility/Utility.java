package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class Utility {

	private Utility() {
		// TODO Auto-generated constructor stub
	}
	public static  Connection getConnection() {
		
		Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		if(con==null)
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productDb","root","root");
		}catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
	
		}
		return con;
	}

}
