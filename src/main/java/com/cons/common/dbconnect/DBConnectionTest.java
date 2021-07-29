package com.cons.common.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnectionTest {
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306",
					"root",
					"rootroot"
			);
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(
					"show databases"
			);
			
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
