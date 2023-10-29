package Date;

public class Person implements Cloneable{
    private String name;
    private int age;
    private Date date;
    
	public Person(String name, int age, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.date = date;
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
    
//Shallow copy only for date property
//	public Object clone() throws CloneNotSupportedException{
//		Person temp = (Person)super.clone();
//		return temp;
//	}
	
	//deep copy
	public Object clone() throws CloneNotSupportedException{
		Person temp = (Person)super.clone();
		temp.date = (Date) this.date.clone();
		return temp;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", date=" + date + "]";
	}
    
}
