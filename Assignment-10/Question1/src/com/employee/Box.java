package com.employee;

//Copy Person class and inherited classes (Employee, Labor, Clerk) from previous assignment/classwork. Implement generic class Box so that it can store
//any Employee in it. Write a method in Box class that prints total salary of the Employee in it.

public class Box<T extends Employee> {
    
	private T employee;
	
	
	public Box(T employee) {
		this.employee = employee;
	}

	public T getEmployee() {
		return employee;
	}

	public void setEmployee(T employee) {
		this.employee = employee;
	}
	
	public void printSalary() {
		System.out.println(employee.calcSalary());
	}
}
