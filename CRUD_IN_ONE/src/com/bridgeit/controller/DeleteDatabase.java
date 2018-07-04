package com.bridgeit.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgeit.utility.DBConnection;

public class DeleteDatabase {
	public static void deleteDatabase() {

		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();

			String sql = "DELETE FROM student WHERE id = 5";
			stmt.executeUpdate(sql);
		}

		catch (SQLException | ClassNotFoundException e) {
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
