package com.employee;

public class EmployeeHelper {
	public static double averageSalManagers(Employee[] arr) {
		double average=0;
		double total=0;
		for(Employee emp:arr) {
			if(emp instanceof Labour) {
				total+=emp.calcSalary();
			}
		}
		average = total / arr.length;
		return average;
		
	};
	
	public static double averageSalSalesmans(Employee[] arr) {
		double average=0;
		double total=0;
		for(Employee emp:arr) {
			if(emp instanceof SalesMan) {
				total+=emp.calcSalary();
			}
		}
		average = total / arr.length;
		return average;
	};
	
	public static double averageSalClerks(Employee[] arr) {
		double average=0;
		double total=0;
		for(Employee emp:arr) {
			if(emp instanceof Clerk) {
				total+=emp.calcSalary();
			}
		}
		average = total / arr.length;
		return average;		
	};
}
