package com.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Mainq1 {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver"; // driver is inherited from java.sql.Driver interface
 	private static final String DB_URL="jdbc:mysql://localhost:3306/jdbc";
 	private static final String DB_USER="root";
 	private static final String DB_PASSWORD="manager";
 	
    static {
		try {
		Class.forName(DB_DRIVER);
		}
		catch(Exception ex) {
		ex.printStackTrace();
		System.exit(0);
		}
	}
    
    private static int menu(Scanner sc){
    	int choice;
    	System.out.println("0-EXIT");
    	System.out.println("1-INSERT NEW CANDIDATE");
    	System.out.println("2-DISPLAY ALL CANDIDATES");
    	System.out.println("3-INCREMENT VOTES OF CANDIDATE WITH GIVEN ID");
    	System.out.println("4-DELETE CANDIDATE WITH GIVEN ID");
    	System.out.println("5-FIND CANDIDATE WITH GIVEN ID");
    	System.out.println("6-DISPLAY TOTAL VOTES OF GIVEN PARTY");
    	choice = sc.nextInt();
		return choice;
    }
	
	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   int choice=0;
		   try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD) ){
			        String sql;
			    
			        // for printing use resultset
			    	//execute query is for ddl commands 
			    	while((choice = menu(sc))!=0) {
			    		switch (choice) {
						case 1://add a new candidate
							sql = "INSERT INTO candidates VALUES(default, ?, ?, ?)"; // parameterized query
							try(PreparedStatement stm = con.prepareStatement(sql)){
                            System.out.print("Enter Name");
                            String name = sc.next();
                            System.out.print("Enter Party");
                            String party = sc.next();
                            System.out.print("Enter Votes");
                            int votes = sc.nextInt();
                            stm.setString(1,name);
                            stm.setString(2, party);
                            stm.setInt(3,votes);
							int rs = stm.executeUpdate();
							System.out.println("Rows Affected: " + rs);
							}
							break;
						case 2:// display all candidates
							sql = "SELECT * FROM candidates";
							try(PreparedStatement stm = con.prepareStatement(sql)){
								ResultSet rs = stm.executeQuery();
								System.out.println("id\tname\tparty\t\tvotes");
								while(rs.next()) {
									int id = rs.getInt("id");
									String name =rs.getString("name");
									String party = rs.getString("party");
									int votes = rs.getInt("votes");
									System.out.printf("%d\t%s\t%s\t\t%d\n",id,name,party,votes);
								}
							}
							break;
						case 3://INCRE vote 
							//get vote by given id
							sql = "UPDATE candidates set votes = votes+1 WHERE id = ?";
							try(PreparedStatement stm = con.prepareStatement(sql)){
								System.out.println("Enter id:");
								int id = sc.nextInt();
								stm.setInt(1, id);
								int rs = stm.executeUpdate(); // for ddl commands use execute query
								System.out.println("Rows Affected: "+rs);
							}
							break;
						case 4://delete by id
							sql = "DELETE FROM candidates WHERE id = ?";
							try(PreparedStatement stm = con.prepareStatement(sql)){
								System.out.println("Enter id:");
								int id = sc.nextInt();
								stm.setInt(1, id);
								int rs = stm.executeUpdate();
								System.out.println("Rows Affected"+rs);
							}
							break;
						case 5://find by id
							sql = "Select * from candidates WHERE id = ?";
							try(PreparedStatement stm = con.prepareStatement(sql)){
							    System.out.println("Enter id:");
								int id = sc.nextInt();
							    stm.setInt(1, id);	
							    ResultSet rs = stm.executeQuery();
							    while(rs.next()) {
							    	int id1 = rs.getInt("id");
							    	String name = rs.getString("name");
							    	String party = rs.getString("party");
							    	int votes = rs.getInt("votes");
							        System.out.printf("%d %s %s %d\n",id1,name,party,votes);
							    }
							}
							break;
						case 6://
							sql = "Select party,sum(votes) as votes from candidates group by party";
							try(PreparedStatement stm = con.prepareStatement(sql)){
								ResultSet rs = stm.executeQuery();
								while(rs.next()) {
									String party = rs.getString("party");
									int count = rs.getInt("votes");
									System.out.printf("%s %d\n",party,count);
								}
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
//	1. Write a menu driven program to do following operations on candidates table using JDBC PreparedStatement.
//	Insert new candidate
//	Display all candidates
//	Increment votes of candidate with given id
//	Delete candidate with given id
//	Find candidate of given id
//	Find candidates of given party
//	Display total votes for each party

}
