package com.assignment13.questoin5;

import java.util.*;
import java.util.Map.Entry;


public class Tester {
//	Store Books in HashMap<> so that for given isbn, book can be searched in fastest possible time.
//	Do we need to write equals() and hashCode() in Book ===  no as string has its own equals,hashcode and comparable method implementations
//	class? Hint:
	public static void main(String[] args) {
	Map<String,Book> bookset = new HashMap<String,Book>();
	bookset.put("6",new Book("6", 35.50, "David Lee", 30));
	bookset.put("6",new Book("6", 35.50, "David Lee", 30));
	bookset.put("7",new Book("7", 35.50, "David Lee", 30));
	bookset.put("1",new Book("1",28,"nsjka",58));
	bookset.put("2",new Book("2", 29.99, "John Doe", 15));
	bookset.put("4",new Book("4", 19.95, "Bob Johnson", 8));
	bookset.put("3",new Book("3", 19.95, "Jane Smith", 20));
	bookset.put("5",new Book("5", 9.99, "Alice Brown", 10));
	bookset.put("6",new Book("6", 3000, "David Lee", 30));
	
	Set<Entry<String,Book>> books1 = bookset.entrySet();
	
	for (Entry<String, Book> entry : books1) {
	   System.out.println(entry.getKey()+" "+entry.getValue());	
	}
      
	}
}
