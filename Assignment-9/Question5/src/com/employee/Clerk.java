package com.employee;

public class Clerk extends Employee {

	public Clerk(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return super.getSalary();
	}

	@Override
	public String toString() {
		return String.format("Name:%s , Age:%d Salary: %f \n", super.getName(),super.getAge(),super.getSalary());
	}
	
}
