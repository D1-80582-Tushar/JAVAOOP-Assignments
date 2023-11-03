package com.assignment13.question6;

import java.util.*;
import java.util.Map.Entry;


public class Tester {
//	Store Students in LinkedHashMap<> so that, for given roll, Student can be searched in fastest possible time. Do we need to write equals() and
//	hashCode() in Student class? Follow menu-driven approach. Hint:
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Student> Studentset = new LinkedHashMap<Integer,Student>();
		Studentset.put(6,new Student(6,"David Lee",20));
		Studentset.put(6,new Student(6,"David Lee",56));
		Studentset.put(7,new Student(7,"David Lee",24));
		Studentset.put(1,new Student(1,"A Lee",24));
		Studentset.put(2,new Student(2,"b Lee",25));
		Studentset.put(3,new Student(3,"C Lee",26));
		Studentset.put(4,new Student(4,"D Lee",27));
		
		Set<Entry<Integer,Student>> students = Studentset.entrySet();
		
		for (Entry<Integer, Student> entry : students) {
			System.out.println(entry);
		}
	}

}
