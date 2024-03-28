package com.hexaware.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	static Connection con;

	public static Connection getDBConn() {

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrierhub", "root", "0000");
		} catch (SQLException e) {
	
			e.printStackTrace();
		}

		return con;
	}

	public static void main(String[] args) {
		System.out.println(getDBConn());
	}
}