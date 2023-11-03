package com.assignment13.question4;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		. In above assignment, Use TreeSet to store all books in descending order of price. Natural ordering for the Book should be isbn (do not change it). Display
//		them using iterator() and descendingIterator().
	class BookPriceDescComparator implements Comparator<Book>{

			@Override
			public int compare(Book b1, Book b2) {
				// TODO Auto-generated method stub
				if(b1.getIsbn() == b2.getIsbn()){ // won't consider if isbn are same returning 0
					return 0;
				}
				else if(b1.getPrice() == b2.getPrice()){ //will return both of same prices
					return 1;
				}else {
					int diff = Double.compare(b1.getPrice(), b2.getPrice());
					return -diff;
				}
			}
		
	}
	// agar value same hogi toh treeset mai add nhi hoti hai aur maine yaha getisbn pai return 0 kiya hai
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("2", 29.99, "John Doe", 15));
		books.add(new Book("1", 19.95, "Jane Smith", 20));
		books.add(new Book("3", 19.95, "Bob Johnson", 8));
		books.add(new Book("4", 9.99, "Alice Brown", 10));
	    books.add(new Book("5", 35.50, "David Lee", 30));
    
	
	TreeSet<Book> bookset = new TreeSet<Book>(new BookPriceDescComparator());
	bookset.addAll(books);
	bookset.add(new Book("2",28,"nsjka",58));

	
	Iterator<Book> itr = bookset.iterator();
	
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
	System.out.println("-------------------------------");
      Iterator<Book> revset = bookset.descendingIterator();
      while (revset.hasNext()) {
		 Book book = revset.next();	
		 System.out.println(book);
	   }
      
	}
}
	
