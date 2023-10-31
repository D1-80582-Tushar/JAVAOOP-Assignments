package com.employee;

public abstract class Employee extends Person {
    private int id;
    private double salary;
    
	public Employee(String name, int age,int id,int salary) {
		super(name, age);
		this.id = id;
		this.salary =salary;
		// TODO Auto-generated constructor stub
	}
	
	public abstract double calcSalary();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
