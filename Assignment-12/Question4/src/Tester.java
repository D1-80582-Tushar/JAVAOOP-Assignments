import java.util.PriorityQueue;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create PriorityQueue<> of Employee. offer employees in the queue and ensure that employees are deleted in desc order of their salaries.
        PriorityQueue<Employee> employees = new PriorityQueue<Employee>();
           employees.offer(new Employee(1,"raju",20,5000.0));
	 	   employees.offer(new Employee(2,"suman",25,7000.50));
	 	   employees.offer(new Employee(3,"dory",24,6200.0));
	 	   employees.offer(new Employee(4,"golu",22,2000.0));
		   System.out.println("before delete : ");
		   for (Employee employee : employees) {
			 System.out.println(employee);
		   }
	 	   employees.poll();
	 	  System.out.println("after delete : ");
		   for (Employee employee : employees) {
			 System.out.println(employee);
		   }
	}

}
