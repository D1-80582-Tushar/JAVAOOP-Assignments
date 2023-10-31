package com.employee;

public class Labour extends Employee{

	private double rate;
	private int hours;
	
	public Labour(String name, int age, double rate, int hours,int id,int salary) throws EmployeeException {
		super(name, age,id,salary);
		if(rate <= 0 || hours<=0) {
		  	  throw new EmployeeException("please input a valid target:target must be > = 0.");
		}
			
		this.rate = rate;
		this.hours = hours;
	}


	@Override
	public double calcSalary(){
		// TODO Auto-generated method stub
		return rate*hours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) throws EmployeeException {
		if(rate <= 0) {
		  	  throw new EmployeeException("please input a valid target:target must be > = 0.");
		}
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) throws EmployeeException {
		if(hours <= 0) {
		  	  throw new EmployeeException("please input a valid target:target must be > = 0.");
		}
		this.hours = hours;
	}
	
	
	@Override
	public String toString() {
		return String.format("Name:%s Age:%d Hours: %d, Rate: %f\n",super.getName(), super.getAge(), this.hours, this.rate);	}
    
}
