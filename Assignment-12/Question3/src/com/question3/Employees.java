package com.question3;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//Create LinkedList<> of Employee. Perform add, delete, ﬁnd, sort, edit functionality in a menu driven program. Refer hint below for edit/update
//functionality:
public class Employees {
	
   
   public static LinkedList<Employee> loadData() {
	   LinkedList<Employee> employees = new LinkedList<>();
	   employees.add(new Employee(1,"raju",20,5000.0));
	   employees.add(new Employee(2,"suman",25,7000.50));
	   employees.add(new Employee(3,"dory",24,6200.0));
	   employees.add(new Employee(4,"golu",22,6200.0));

	   return employees;
   }
   
   public static void add(LinkedList<Employee> emps,Scanner sc) {
	   int empid;
	   System.out.println("Enter empid");
	   empid = sc.nextInt();
	   
	   // inside indexOf an object can be passed only
	   // so create a temp Arr with id empId to pass it
	   Employee temp = new Employee(empid,"na",0,0);
	   // now in order to make indexOf to work with id comparison write your own equals method in Employee class first
	   //because two objects are comparing here
	   if(emps.indexOf(temp)!=-1) {
		   //it exist
		   System.out.println("Employee Already Exist.");
	   }else {
		   //it doesn't exist
		   Employee e = new Employee();
		   e.setId(empid);
		   System.out.println("Enter Name");
		   e.setName(sc.next());
		   System.out.println("Enter Age");
		   e.setAge(sc.nextInt());
		   System.out.println("Enter Salary");
		   e.setSalary(sc.nextDouble());
		   emps.add(e);
	   }
   };
   
   public static void delete(LinkedList<Employee> emps,Scanner sc) {
	    int tempid = sc.nextInt();
	    Employee temp = new Employee(tempid,"na",0,0);
        int index = emps.indexOf(temp);
       
        if(index!=-1) {
            emps.remove(index);
            System.out.println("Deleted.");
        }else {
        	System.out.println("Not Exist");
        }
   }
   public static void find(LinkedList<Employee> emps,int id) {
	   Employee temp = new Employee(id,"na",0,0);
       int index = emps.indexOf(temp);
      
       if(index!=-1) {
    	   System.out.println(emps.get(index));
       }else {
       	System.out.println("Not Exist");
       }
   }
   
   public static int findIndex(LinkedList<Employee> emps,int id) {
	   Employee temp = new Employee(id,"na",0,0);
       int index = emps.indexOf(temp);
       return index;
   }
   public static void sort(LinkedList<Employee> emps) {
	    Collections.sort(emps);
	    for (Employee employee : emps) {			
	    	System.out.println(employee);
		}
   }
   public static int editmenu(Scanner sc) {
	 int choice=0;
	   System.out.println("What you want to edit?");
  	 System.out.println(" 1 - Id \n"+
  	            "2 - Name\n" +
  			    "3 - Age\n" +
  	            "4 - Salary\n"+
  			    "0 - Exit"
  			 );
  	 choice = sc.nextInt();
  	 return choice;
   }
   public static void edit(LinkedList<Employee> emps,Scanner sc,int id){
	     int index = findIndex(emps,id);
	     if(index!=-1) {
	    	 Employee e = emps.get(index);
	    	 System.out.println(e);
	    	 int choice = 0;
	    	 while((choice = editmenu(sc))!=0) {	    		 
	    		 switch (choice) {
	    		 case 1:
	    			 e.setId(sc.nextInt());
	    			 System.out.println("done");
	    			 break;
	    		 case 2:
	    			 e.setName(sc.next());
	    			 System.out.println("done");
	    			 break;
	    		 case 3:
	    			 e.setAge(sc.nextInt());
	    			 System.out.println("done");
	    			 break;
	    		 case 4:
	    			 e.setSalary(sc.nextDouble());
	    			 System.out.println("done");
	    			 break;
	    		 default:
	    			 break;
	    		 }
	    	 }
	    	 }
   }
   
   public static void display(LinkedList<Employee> emps) {
	   for (Employee employee : emps) {
		 System.out.println(employee);
	}
   }
}
