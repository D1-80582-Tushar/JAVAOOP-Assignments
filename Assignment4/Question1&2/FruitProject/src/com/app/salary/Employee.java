package com.app.salary;

public abstract class Employee {
    String firstName;
    String lastName;
    int SSN;
    
    public Employee(String firstName, String lastName, int sSN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
	}

	public abstract double WeekPay();
}
