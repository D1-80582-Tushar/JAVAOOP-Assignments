package com.assignment13.question8;

public class Labour implements Emp{
    private int hours;
    private double rate;
	
    
    public double calcIncentives() {
    	if(hours>300) {
    		return hours*rate*0.05;
    	}
		return 0.0;
    }
    
	@Override
	public double getSal() {
				return (hours+rate);
	}
    
    
}
