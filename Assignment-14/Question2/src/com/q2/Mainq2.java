package com.q2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Mainq2 {

	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "manager";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	private static int menu(Scanner sc) {
		int choice=0;
		System.out.println("0-EXIT");
		System.out.println("1-INSERT NEW USER");
		System.out.println("2-DISPLAY ALL USERS");
		System.out.println("3-DELETE VOTER BY ID");
		System.out.println("4-CHANGE STATUS OF VOTER BY ID");
		System.out.println("5-CHANGE NAME AND BIRTHDATE OF VOTER");
	    choice = sc.nextInt();
        return choice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a menu driven program to do following operations on users table using JDBC PreparedStatement.
//		Insert new user (Voter)
//		Display all users
//		Delete voter with given id
//		Change status of voter with given id to true
//		Change the name and birth date of voter*/
		Scanner sc = new Scanner(System.in);
	    int choice=0;
	    String sql;
		try(Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
			    while((choice = menu(sc))!=0) {
			    	switch (choice) {
					case 1:
						sql = "INSERT INTO users VALUES(default,?,?,?,?,?,?,?)";
						try(PreparedStatement stm = conn.prepareStatement(sql)){
							System.out.println("Enter fname");
							String fname = sc.next();
							System.out.println("Enter lname");
							String lname = sc.next();
							System.out.println("Enter email");
							String email = sc.next();
							System.out.println("Enter password");
							String password = sc.next();
							System.out.println("Enter dob");
							String date = sc.next();

							System.out.println("Enter status");
							int status = sc.nextInt();
							System.out.println("Enter role");
							String role = sc.next();
							
							stm.setString(1,fname);
							stm.setString(2, lname);
							stm.setString(3,email);
							stm.setString(4,password);
						
							SimpleDateFormat sdf;
							sdf  = new SimpleDateFormat("YYYY-MM-DD");
							java.util.Date uDate = sdf.parse(date);
							java.sql.Date sdate;
							sdate = new java.sql.Date(uDate.getTime());
							stm.setDate(5, sdate);
							stm.setInt(6, status);
							stm.setString(7, role);
							
							int rs = stm.executeUpdate();
							System.out.println("Rows Affected"+rs);
						}
			 			break;
					case 2:
						sql = "SELECT * FROM users";
						try(PreparedStatement stm = conn.prepareStatement(sql)){
							ResultSet rs = stm.executeQuery();
							while(rs.next()) {
								int id = rs.getInt("id");
								String fname =rs.getString("first_name");
								String lname = rs.getString("last_name");
								String email = rs.getString("email");
								String password = rs.getString("password");
								Date sDate = rs.getDate("dob");

								String status = rs.getString("status");
								String role = rs.getString("role");
								System.out.printf("%d %s %s %s %s %s %s %s\n",id,fname,lname,email,password,sDate,status,role);
							}
						}
			 			break;
					case 3://delete voter with id
						sql = "DELETE FROM users WHERE id=?";
						try(PreparedStatement stm = conn.prepareStatement(sql)){
							System.out.println("Enter id:");
							int id = sc.nextInt();
							stm.setInt(1, id);
							int rs = stm.executeUpdate();
							System.out.println("Rows Affected"+rs);
						}
			 			break;
					case 4:
						sql = "UPDATE users set status = ? WHERE id = ?";
						try(PreparedStatement stm = conn.prepareStatement(sql)){
							System.out.println("Enter id:");
							int id = sc.nextInt();
							System.out.println("Enter status:");
							int status = sc.nextInt();
							stm.setInt(1, status);
							stm.setInt(2, id);
							int rs = stm.executeUpdate(); // for ddl commands use execute query
							System.out.println("Rows Affected: "+rs);
						}
			 			break;
					case 5:
						sql = "UPDATE users set first_name = ?,dob = ? WHERE id = ?";
						try(PreparedStatement stm = conn.prepareStatement(sql)){
							System.out.println("Enter id:");
							int id = sc.nextInt();
							System.out.println("Enter name:");
							String name = sc.next();
							System.out.println("Enter dob:");
							String date = sc.next();
							stm.setString(1, name);
							SimpleDateFormat sdf;
							sdf  = new SimpleDateFormat("YYYY-MM-DD");
							java.util.Date uDate = sdf.parse(date);
							java.sql.Date sdate;
							sdate = new java.sql.Date(uDate.getTime());
							stm.setDate(2, sdate);
							stm.setInt(3, id);
							int rs = stm.executeUpdate(); // for ddl commands use execute query
							System.out.println("Rows Affected: "+rs);
						}
			 			break;
					default:
						break;
					}
			    }
			
		}catch(Exception e) {
           e.printStackTrace();
		}
        
	}

}
