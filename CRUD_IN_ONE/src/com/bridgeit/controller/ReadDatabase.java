package com.bridgeit.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgeit.utility.DBConnection;

public class ReadDatabase {
public static void readDatabase() {

		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;
		try {
			con = DBConnection.getConnection();
			System.out.println("driver registered");
			System.out.println("connection established");
			stmt = con.createStatement();
			System.out.println("create statement");

			result = stmt.executeQuery("select * from student");
			while (result.next()) {
				int id = result.getInt("ID");
				String firstname = result.getString("FIRST_NAME");
				String lastname = result.getString("LAST_NAME");
				String address = result.getString("ADDRESS");
				System.out.print("ID: " + id + " ");
				System.out.print("FIRST_NAME: " + firstname + " ");
				System.out.print("LAST_NAME: " + lastname + " ");
				System.out.print("ADDRESS: " + address + " " + "\n");
			}

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
		System.out.println("Operation Successfull...");
	}
}
