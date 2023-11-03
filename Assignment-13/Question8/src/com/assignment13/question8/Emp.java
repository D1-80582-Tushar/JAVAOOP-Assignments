package com.assignment13.question8;

//double getSal() and a default method default double calcIncentives(). The default method
//simply returns 0.0. Create a class Manager (with ﬁelds basicSalary and dearanceAllowance) inherited from Emp. In this class override getSal() method
//(basicSalary + dearanceAllowance) as well as calcIncentives() method (20% of basicSalary). Create another class Labor (with ﬁelds hours and rate)
//inherited from Emp interface. In this class override getSal() method (hours * rate) as well as calcIncentives() method (5% of salary if hours > 300,
//otherwise no incentives). Create another class Clerk (with ﬁeld salary) inherited from Emp interface. 
public interface Emp {
	double getSal();
    default double calcIncentives() {
    	return 0.0;
    };
}
