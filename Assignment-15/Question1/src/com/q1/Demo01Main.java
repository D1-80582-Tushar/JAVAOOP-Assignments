package com.q1;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

public class Demo01Main {
	
	public static Candidate acceptCandidate(Scanner sc) {
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate(id, name, party, votes);	
		return c;
	}
	
	public static Candidate updateCandidate(Scanner sc,int id) {
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate(id, name, party, votes);	
		return c;
	}
	
	
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("0- EXIT");
		System.out.println("1- SAVE CANDIDATE");
		System.out.println("2- UPDATE CANDIDATE");
		System.out.println("3- DELETECANDIDATEBYID");
		System.out.println("4- FINDBYID");
		System.out.println("5- FINDALL");
		System.out.println("6- FINDBYPARTY");
		choice = sc.nextInt();
		return choice;
 	}
	
	public static void main(String[] args) {
		//TODO: Menu driven program
		
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		try(CandidateDao can = new CandidateDao()){			
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
					int resultDelete = can.deleteById(id1);
					System.out.println("Rows Affected:"+resultDelete);

					break;
				case 4://find by id
					System.out.println("Enter id:");
					int id2 = sc.nextInt();
					Candidate candidate= can.findById(id2);
					if(candidate!=null) {
						System.out.println(candidate);
					}
					break;
				case 5://find all
					List<Candidate> list = can.findAll();
					 list.forEach(c->System.out.println(c));
					break;
				case 6://find by party
					System.out.print("Enter party: ");
					String party = sc.next();
					List<Candidate> list1 = can.findByParty(party);
					list1.forEach(c-> System.out.println(c));
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











