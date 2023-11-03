package com.assignment13.question2;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		In above assignment use LinkedHashSet instead of HashSet. If any book with duplicate isbn is added, what will happen? Books are stored in which order?
//		in case of hashset we have random order 
		// in case of LinkedHashSet  ===> same order as return will be printed
		
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("2", 29.99, "John Doe", 15));
		books.add(new Book("1", 19.95, "Jane Smith", 20));
		books.add(new Book("3", 49.99, "Bob Johnson", 8));
		books.add(new Book("4", 9.99, "Alice Brown", 10));
	    books.add(new Book("5", 35.50, "David Lee", 30));
    
	
	Set<Book> books1 = new LinkedHashSet<>();
	books1.addAll(books);
	books1.add(new Book("2",28,"nsjka",54));
	
	Iterator<Book> itr = books1.iterator();
	
	while(itr.hasNext()) {
		Book b = itr.next();
		System.out.println(b);
	}

	}

}
