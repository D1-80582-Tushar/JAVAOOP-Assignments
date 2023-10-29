package com.employee;

public class SalesMan extends Employee {
      public SalesMan(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	private double target;
    private double commision;
	
    @Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + commision;
	}

	public double getTarget() {
		return target;
	}

	public void setTarget(double target) throws EmployeeException {
		if(target <= 0) {
		  	  throw new EmployeeException("please input a valid target:target must be > = 0.");
		}
		
		this.target = target;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) throws EmployeeException  {
		if(commision <= 0) {
		  	  throw new EmployeeException("please input a valid commision:commission must be > = 0.");
		}
		this.commision = commision;
	}
    
    
}
