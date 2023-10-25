package com.app.salary;

public class ComissionEmployee extends Employee {
	public ComissionEmployee(String firstName, String lastName, int sSN) {
		super(firstName, lastName, sSN);
		// TODO Auto-generated constructor stub
	}
	double Sales_Amount;
	double Commission_Percentage;
	@Override
	public double WeekPay() {
		return (Sales_Amount * Commission_Percentage);
	}

}
