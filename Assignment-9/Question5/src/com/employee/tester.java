package com.employee;

//Write a Person class with ﬁelds (name, age) and appropriate constructors + getter/setters + equals(). Write an Employee class inherited from Person class
//with additional ﬁelds (id and salary). Add abstract method double calcSalary(). Write a Labor class inherited from Employee class with additional ﬁelds
//(rate and hours). Override calcSalary() as hours * rate. Write a Salesman class inherited from Employee class with additional ﬁelds (target and
//commission). Override calcSalary() as salary + commission. Write a Clerk class with no additional ﬁelds and calcSalary() returns basic salary only. The
//setter methods of all classes should throw a custom exception EmployeeException (with additional ﬁeld - invalidValue), if invalid values are set. Create
//Employees helper class helper methods as follows. In main(), create array of Employees and initialize with appropriate objects. Call these Employees
//helper methods and display results.
//double averageSalManagers(Employee[] arr);
//double averageSalSalesmans(Employee[] arr);
//double averageSalClerks(Employee[] arr);
public class tester {
	
	public static void main(String[] args) {
		
	Employee[] employees = new Employee[10];
	
	try {
		employees[0] = new Labour("sachin",20,18.50,5);
	     Labour employee =(Labour) employees[0];
	     Person p = new Person("abc",20);
	     
	     System.out.println(p);
//	     employee.setRate(0);
		
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
