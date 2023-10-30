package com.employee;

public class EmployeeException extends Exception{
    private String invalidValue;

    public EmployeeException() {
    	System.out.println("something went wrong");
    }
	public EmployeeException(String invalidValue) {
		this.invalidValue = invalidValue;
		System.out.println(invalidValue);
	}
    
    
    
}
