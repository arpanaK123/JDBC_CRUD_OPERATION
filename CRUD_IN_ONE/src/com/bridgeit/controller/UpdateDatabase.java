package com.bridgeit.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgeit.utility.DBConnection;

public class UpdateDatabase {
	public static void updateDatabase() {

		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();

			String sql = "UPDATE student SET ID = '4' WHERE ID=5";
			stmt.executeUpdate(sql);

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

}
