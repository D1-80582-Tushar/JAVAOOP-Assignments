package com.app.salary;

public class HourlyEmployee extends Employee {
    int Regular_Hours;
    //wage
    double Hourly_Pay_Rate;
    
    public HourlyEmployee(String firstName,String lastName,int SSN,int hours,double rate) {
    	super(firstName,lastName,SSN);
    	this.Regular_Hours = hours;
    	this.Hourly_Pay_Rate = rate;
    }

	@Override
	public double WeekPay() {
		// TODO Auto-generated method stub
		if(Regular_Hours<=40) {
		  return Hourly_Pay_Rate*Regular_Hours;
		}
		
		return  (40 * Hourly_Pay_Rate) + ((Regular_Hours - 40) * Hourly_Pay_Rate * 1.5);
	}

}
