package com.q1;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
	public static final String DB_USER = "root";
	public static final String DB_PASSSWD = "manager";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSSWD);
		return con;
	}
}





