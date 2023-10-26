package Date;

public class Tester {
   public static void main(String[] args) throws CloneNotSupportedException {
	     //deep copy
	     Date d1 =new Date(1,1,1999);
	     Date d2 = (Date) d1.clone();
	     
	     Person p1 = new Person("Ani",24,d1);
	     Person p2 =(Person)p1.clone();
	     System.out.println(p1);
	     System.out.println(p2);
	     d1.setDay(10);
	     System.out.println(p1);
	     System.out.println(p2);
	     
   }
}
