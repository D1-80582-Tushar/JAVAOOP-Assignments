package com.employee;

public class Tester {

	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub
//		Employee[] employees = new Employee[10];
//		employess[0] = 
		
        Box<Labour> obj1 = new Box<Labour>(new Labour("Amey",20,10.0,5,1,500));
        Box<Clerk> obj2 = new Box<Clerk>(new Clerk("abhishek",24,2,600));
        obj1.printSalary();
        obj2.printSalary();
	}

}
