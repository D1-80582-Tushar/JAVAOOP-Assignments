package com.assignment13.question8;

public class Manager implements Emp{
    private double basicSalary;
    private double dearanceAllowance;
    

    public double calcIncentives() {
		return basicSalary * 0.20;
    }
    
	@Override
	public double getSal() {
				return (basicSalary+dearanceAllowance);
	}
    
}
