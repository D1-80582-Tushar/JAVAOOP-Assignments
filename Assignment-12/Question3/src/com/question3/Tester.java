package com.question3;

import java.util.LinkedList;
import java.util.Scanner;

public class Tester {

	
	private static int menu(Scanner sc) {
	    int choice=0;
	    System.out.println("1 - ADD EMPLOYEE");
	    System.out.println("2 - DELETE EMPLOYEE");
	    System.out.println("3 - FIND EMPLOYEE");
	    System.out.println("4 - SORT EMPLOYEE");
	    System.out.println("5 - EDIT EMPLOYEE");
	    System.out.println("6 - DISPLAY EMPLOYEES");
	    choice = sc.nextInt();
		return choice;	
	}
	
//	Create LinkedList<> of Employee. Perform add, delete, ﬁnd, sort, edit functionality in a menu driven program. Refer hint below for edit/update
//	functionality:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        LinkedList<Employee> employees = new LinkedList<>();
        employees = Employees.loadData();
        
		while((choice = menu(sc))!=0) {
        	switch (choice) {
			case 1:
				//first check before adding is it exist or not
				//for checking: use indexOf 
				Employees.add(employees,sc);
				break;
			case 2:
				Employees.delete(employees,sc);
				break;
			case 3:
				System.out.print("Enter Emp Id");
				int id = sc.nextInt();
				Employees.find(employees,id);
				break;
			case 4:
				Employees.sort(employees);
				break;
			case 5:
				System.out.print("Enter Emp Id For Update:");
				int id1 =sc.nextInt();
				Employees.edit(employees,sc,id1);
				break;
			case 6:
				Employees.display(employees);
			default:
				break;
			}
        }
		sc.close();
	}

}
