package com.q2;

import java.util.List;
import java.util.Scanner;

public class MainUser {
	public static User acceptCandidate(Scanner sc) {
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		System.out.print("Enter fname: ");
		String fname = sc.next();
		System.out.print("Enter lname: ");
		String lname = sc.next();
		System.out.print("Enter email: ");
		String email = sc.next();
		System.out.print("Enter password: ");
		String password = sc.next();
		System.out.print("Enter dob: ");
		String dob = sc.next();
		System.out.print("Enter status: ");
		boolean status = sc.nextBoolean();
		System.out.print("Enter role: ");
		String role = sc.next();
		User u = new User(id,fname,lname,email,password,dob,status,role);	
		return u;
	}
	
	public static User updateCandidate(Scanner sc,int id) {
		System.out.print("Enter fname: ");
		String fname = sc.next();
		System.out.print("Enter lname: ");
		String lname = sc.next();
		System.out.print("Enter email: ");
		String email = sc.next();
		System.out.print("Enter password: ");
		String password = sc.next();
		System.out.print("Enter dob: ");
		String dob = sc.next();
		System.out.print("Enter status: ");
		boolean status = sc.nextBoolean();
		System.out.print("Enter role: ");
		String role = sc.next();
		User u = new User(id,fname,lname,email,password,dob,status,role);	
		return u;
	}
		
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("0- EXIT");
		System.out.println("1- SAVE USER");
		System.out.println("2- UPDATE USER");
		System.out.println("3- DELETE USER BY ID");
		System.out.println("4- FIND USER BY ID");
		System.out.println("5- FIND ALL USERS");
		choice = sc.nextInt();
		return choice;
 	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		try(UserDao can = new UserDao()){			
			while((choice=menu(sc))!=0) {
				switch (choice) {
				case 1://save
					int resultSave = can.save(acceptCandidate(sc));
					System.out.println("Rows Affected:"+resultSave);
					break;
				case 2://update
					System.out.println("Enter id:");
					int id = sc.nextInt();
					int resultUpdate = can.update(updateCandidate(sc,id));
					System.out.println("Rows Affected:"+resultUpdate);
					break;
				case 3://delete
					System.out.println("Enter id:");
					int id1 = sc.nextInt();
					int resultDelete = can.deleteUser(id1);
					System.out.println("Rows Affected:"+resultDelete);

					break;
				case 4://find by id
					System.out.println("Enter id:");
					int id2 = sc.nextInt();
					User u= can.findUser(id2);
					if(u!=null) {
						System.out.println(u);
					}
					break;
				case 5://find all
					List<User> list = can.findUsers();
					list.forEach(l->System.out.println(l));
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
