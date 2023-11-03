package com.assignment13.question3;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
//		In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
//				Books are stored in which order?
		// in case of LinkedHashSet  ===> same order as return will be printed
//		for natural ordering === comparable tree set duplication would work fine with xomparable only
		
		// treeset will return us sorted list as provided acc to comparable logic
		// treeset is known to give list in order only if we don not add comparable it would throw classcastexception
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("2", 29.99, "John Doe", 15));
		books.add(new Book("1", 19.95, "Jane Smith", 20));
		books.add(new Book("3", 49.99, "Bob Johnson", 8));
		books.add(new Book("4", 9.99, "Alice Brown", 10));
	    books.add(new Book("5", 35.50, "David Lee", 30));
    
	
	Set<Book> books1 = new TreeSet<>();
	books1.addAll(books);
	books1.add(new Book("2",28,"nsjka",54));
	
	Iterator<Book> itr = books1.iterator();
	
	while(itr.hasNext()) {
		Book b = itr.next();
		System.out.println(b);
	}

	}

}