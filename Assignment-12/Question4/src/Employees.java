
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//Create LinkedList<> of Employee. Perform add, delete, ﬁnd, sort, edit functionality in a menu driven program. Refer hint below for edit/update
//functionality:
public class Employees {
	
   
   public static LinkedList<Employee> loadData() {
	   LinkedList<Employee> employees = new LinkedList<>();
	   employees.add(new Employee(1,"raju",20,5000.0));
	   employees.add(new Employee(2,"suman",25,7000.50));
	   employees.add(new Employee(3,"dory",24,6200.0));
	   employees.add(new Employee(4,"golu",22,6200.0));

	   return employees;
   }
   
   public static void add(LinkedList<Employee> emps,Scanner sc) {
	   int empid;
	   System.out.println("Enter empid");
	   empid = sc.nextInt();
	   
	   // inside indexOf an object can be passed only
	   // so create a temp Arr with id empId to pass it
	   Employee temp = new Employee(empid,"na",0,0);
	   // now in order to make indexOf to work with id comparison write your own equals method in Employee class first
	   //because two objects are comparing here
	   if(emps.indexOf(temp)!=-1) {
		   //it exist
		   System.out.println("Employee Already Exist.");
	   }else {
		   //it doesn't exist
		   Employee e = new Employee();
		   e.setId(empid);
		   System.out.println("Enter Name");
		   e.setName(sc.next());
		   System.out.println("Enter Age");
		   e.setAge(sc.nextInt());
		   System.out.println("Enter Salary");
		   e.setSalary(sc.nextDouble());
		   emps.add(e);
	   }
   };
   


}
