import java.util.Objects;

//System.out.println("Enter emp id to be modified: ");
//int id = sc.nextInt();
//Employee key = new Employee();
//key.setId(id);
//int index = list.indexOf(key);
//if(index == -1)
//System.out.println("Employee not found.");
//else {
//Employee oldEmp = list.get(index);
//System.out.println("Employee Found: " + oldEmp);
//System.out.println("Enter new information for the Employee");
//Employee newEmp = new Employee();
//newEmp.accept();
//list.set(index, newEmp);
//}
public class Employee implements Comparable<Employee>{
   private int id;
   private String name;
   private int age;
   private double salary;
   
   public Employee() {
	   
   }
public Employee(int id, String name, int age, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public int hashCode() {
	return Objects.hash(age, id, name, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return  id == other.id;
}
@Override
public int compareTo(Employee obj) {
    int diff = Double.compare(this.salary,obj.salary);
	return diff;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
}


   
   
}
