package com.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Tester {
//	Use Arrays.sort() to sort array of Students using Comparator. The 1st level sorting should be on city (desc), 2nd level sorting should be on marks (desc),
//	3rd level sorting should be on name (asc).

	
	public static void main(String[] args) {
		class CustomCompare implements Comparator<Student>{

			@Override
			public int compare(Student obj1, Student obj2) {
				// TODO Auto-generated method stub
//				The 1st level sorting should be on city (desc),
				int diff = - obj1.getCity().compareTo(obj2.getCity());
				if (diff == 0) {
					diff  = - Double.compare(obj1.getMarks(), obj2.getMarks());
				}
				if(diff == 0) {
					diff = obj1.getName().compareTo(obj2.getName());
				}
				return diff;
			}
				
			}
		// TODO Auto-generated method stub
//	    ArrayList<Student> students = new ArrayList<>(); 
//	    students.add(new Student(1,"amey","london",50));
//	    students.add(new Student(2,"raju","banchari",60));
//	    students.add(new Student(3,"abhishek","sydney",55));
//	    students.add(new Student(101, "Alice", "New York", 95.5));
//	    students.add(new Student(102, "Bob", "Los Angeles", 88.0));
//	    students.add(new Student(103, "Charlie", "Chicago", 78.5));
//	    
	    Student[] students = new Student[6];
	    students[0]= new Student(1,"amey","pune",50);
	    students[1] = new Student(2,"raju","pune",60);
	    students[2] =  new Student(3,"omkar","delhi",55);
        students[3]=new Student(4, "Alice", "faridabad", 95.5);
        students[4]=new Student(5, "Bob", "delhi", 88.0);
        students[5]=new Student(6, "Charlie", "faridabad", 78.5);
	    Arrays.sort(students,new CustomCompare());
	    
	    for (Student student : students) {
			System.out.println(student);
		}
	}

}
