package com.classwork;

public class StringPoolPractice {
     
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//question 1
//		String s1 = "xyz";
//		String s2 = "xyz";
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		
		//question 2
//		String s1 = new String("xyz");
//		String s2 = new String("xyz");
//		System.out.println(s1==s2); // false
//		System.out.println(s1.equals(s2)); // true
		
		//question 3
//		String s1 = "xyz";
//		String s2 = new String("xyz");
//		
//		System.out.println(s1==s2); //false references of both are not equal as s1 is pointing to string pool literal/constant's refernce i.e "xyz" and s2 point's to new object in heap
//		System.out.println(s1.equals(s2));//true as data of both s1 and s2 i.e "xyz" is equal
		
//		question 4
//		String s1 = "Sunbeam";
//		String s2 = "Sun"+"beam"; // will resolved at compiled time and will reference the "Sunbeam" literal only at the end there will be two more literals ("Sun" and "beam" also)
//		//but s2 at the end at runtime will points to "SUnbeam" literal
//		System.out.println(s1==s2); // true
//		System.out.println(s1.equals(s2)); // true
		
//		question 5
//		String s1 = "Sunbeam";
//		String s2 = "Sun";
//		String s3 = s2+"beam"; // this will get resolve at runtime as s2 is a variable its not a const/literal compiler can't resolve this 
//		// will return a new object on heap with value "Sunbeam" as there is already a literal "Sunbeam" in string pool it won't create it again
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s3));
 
		
//		question 6
//		String s1 = "Sunbeam";
//		String s2 = new String("Sunbeam").intern(); // new String("Sunbeam") will create a object on heap .intern() then try to create a literal/constant on string pool
//		// but as "Sunbeam" of s1 already exist it won't create again it will just return the reference of it.
//		
//		System.out.println(s1==s2);// true
//		System.out.println(s1.equals(s2));//true
		
		//string builder
//		String s1 = "infotech";
//		StringBuilder sb = new StringBuilder(s1);
//	    sb.reverse();
////		System.out.println(sb);
//		String  s2 = sb.toString();
//		System.out.println(s2);
		
		
		//stringBuffer q-1
//		StringBuffer sb1 = new StringBuffer("abc");
//		StringBuffer sb2 = new StringBuffer("abc");
//		
//		System.out.println(sb1==sb2);// false == will check for references
//		System.out.println(sb1.equals(sb2)); // false  will check for values are they equal sb1 and sb2 are not string here 

       //Stringbuffer q-2
//		StringBuffer sb1 = new StringBuffer("abc");
//		String sb2 = new String("abc");
////		System.out.println(sb1==sb2); // compile time error as incompatible types
//		System.out.println(sb1.equals(sb2)); // false 
		
		// string buffer q-3
//		String s1 = new String("Sunbeam");
//		StringBuffer s2 = new StringBuffer("Sunbeam");
//		System.out.println(s1.equals(s2)); // false  ,as s1 and s2 of different types
//		System.out.println(s1.equals(s2.toString())); // true
		
//		StringBuffer s1 = new StringBuffer("Sunbeam");
//		StringBuffer s2 = s1.reverse();
//		System.out.println(s1 == s2);// true  as both are referencing to same memory
//		System.out.println(s1.equals(s2)); // as stringBuffer is mutable both are same here 
       
//		StringBuilder s1 = new StringBuilder("Sunbeam");
//		StringBuilder s2 = new StringBuilder("Sunbeam");
//		System.out.println(s1 == s2);// false
//		System.out.println(s1.equals(s2)); // false

//		StringBuffer s = new StringBuffer();
//		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 0
//		s.append("1234567890");
//		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 10
//		s.append("ABCDEFGHIJKLMNOPQRSTUV");
//		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 34, 32  on exceeding value 16 it will = >(16+1)*2 = 34
		// it will do modified with  ===> (old value + 1) * 2
	}

}
