package com.bridgeit.operation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.bridgeit.controller.DeleteDatabase;
import com.bridgeit.controller.InsertDatabase;
import com.bridgeit.controller.ReadDatabase;
import com.bridgeit.controller.UpdateDatabase;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("\tWelcome Your Database\n");
		System.out.println("1.  Read Database\n2.  Update Database\n3.  Delete Database\n4. "
				+ " Insert Data\n5.  Close Database");
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\tEnter your choice");
		int choice = scan.nextInt();

		switch (choice) {
		case 1: {
			ReadDatabase.readDatabase();
			System.out.println("Do you want to continue pres yes/no");
			String option=scan.next();

			
		}
		case 2: {
			UpdateDatabase.updateDatabase();
			return;
		}

		case 3: {
			DeleteDatabase.deleteDatabase();
		}

		case 4: {
			InsertDatabase.insertDatabase();
		}

		
		case 5: {
			System.out.println("Successfully closed");
			return;
		}
		default: {
			System.out.println("Oops something wrong...! Enter correct choice");
			return;
		}
		}
	}

}
