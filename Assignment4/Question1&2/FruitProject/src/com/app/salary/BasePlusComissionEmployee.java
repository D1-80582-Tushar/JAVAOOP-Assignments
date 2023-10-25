package com.app.salary;

public class BasePlusComissionEmployee extends Employee {
    public BasePlusComissionEmployee(String firstName, String lastName, int sSN) {
		super(firstName, lastName, sSN);
		// TODO Auto-generated constructor stub
	}
	double Base_Salary;
    double Sales_Amount;
    double Commission_Percentage;
	@Override
	public double WeekPay() {
		// TODO Auto-generated method stub
		return (Base_Salary + 0.10 * Base_Salary) + (Sales_Amount * Commission_Percentage);
	}

}
