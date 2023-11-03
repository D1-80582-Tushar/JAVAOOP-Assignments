package com.assignment12.question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Store few books (hardcoded values with the Book class in previous assignment -- with equals() and without Comparable) in a HashSet and display them
//		using iterator. If any book with duplicate isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.
		ArrayList<Book> books = new ArrayList<>();
			books.add(new Book("2", 29.99, "John Doe", 15));
			books.add(new Book("1", 19.95, "Jane Smith", 20));
			books.add(new Book("3", 49.99, "Bob Johnson", 8));
			books.add(new Book("4", 9.99, "Alice Brown", 10));
		    books.add(new Book("5", 35.50, "David Lee", 30));
	    
		
		Set<Book> books1 = new HashSet<>();
		books1.addAll(books);
		books1.add(new Book("2",28,"nsjka",54));
		
		Iterator<Book> itr = books1.iterator();
		
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
	}

}
