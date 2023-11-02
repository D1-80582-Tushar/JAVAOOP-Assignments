package com.library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class PriceBookComparaterDesc implements Comparator<Book>{

	@Override
	public int compare(Book obj1, Book obj2) {
		// TODO Auto-generated method stub
		int diff = Double.compare(obj1.getPrice(), obj2.getPrice());
		return -diff;
	}
	
}

public class Books {
//    Books[
	private static ArrayList<Book> books = new ArrayList<>();
	 
	    
	 
	public static ArrayList<Book> loadData() {
		books.add(new Book("2", 29.99, "John Doe", 15));
		books.add(new Book("1", 19.95, "Jane Smith", 20));
		books.add(new Book("3", 49.99, "Bob Johnson", 8));
		books.add(new Book("4", 9.99, "Alice Brown", 10));
	    books.add(new Book("5", 35.50, "David Lee", 30));
        return books;
    }
	
	public static void addBook(ArrayList<Book> books,Scanner sc) {
	    String isbn;

		Book b = null;
	    
		System.out.println("Enter Book Isbn");
        isbn = sc.next();
        Book testobj = new Book();
        testobj.setIsbn(isbn);
        
        int index = books.indexOf(testobj);
        if(index!=-1) {
        	System.out.println("Book is already present !! adding to quantity");
			b = books.get(index);
			b.setQuantity(b.getQuantity()+1);
		}else {
			b = new Book();
			b.setIsbn(isbn);
			System.out.println("Enter Book Price");
			b.setPrice(sc.nextDouble());
			System.out.println("Enter Book Author Name");
			b.setAuthorName(sc.next());
			System.out.println("Enter Book Quantity");
			b.setQuantity(sc.nextInt());
			books.add(b);			
		}
   }
   
   public static void displayBooks(Iterator<Book> e,ArrayList<Book> books) {
        Collections.sort(books);
        for (Book book : books) {
			System.out.println(book);
		}
   }
   
   public static void deleteBook(Iterator<Book> e,Collection<Book> books,Scanner sc) {
	   System.out.println("Enter book isbn");
		String id = sc.next();
		 e = books.iterator();
		while(e.hasNext()) {
		 Book ele = e.next();
			if(ele.getIsbn().equals(id)) // note carefully (book.getIsbn() == id) will only check for references this won't work
			{ 
				 e.remove(); //good to use iterator e in order to maintain consistency between collection and iterator
			}
		}
   }
   
   public static Book isBookExistReturnBook(ArrayList<Book> books,String id) {
	   Book testobj = new Book();
       testobj.setIsbn(id);
       
       int index = books.indexOf(testobj);
       if(index!=-1) {
    	   return books.get(index);
       }else {
    	   return null;
       }
   }
   
   public static void deleteAllBooks(Collection<Book> books) throws InterruptedException {
		System.out.println("Deleting...");
		Thread.sleep(2000);
		books.removeAll(books);
		System.out.println("Successfully deleted.");
   }
   
   public static void displayBooksInPriceOrderDesc(ArrayList<Book> books) {
	   Collections.sort(books,new PriceBookComparaterDesc());
	   for (Book book : books) {
			System.out.println(book);
		} 
   }
   
   public static void reverseBookList(ArrayList<Book> books) {
	     Collections.reverse(books);
	     for (Book book : books) {
				System.out.println(book);
			} 
   }
}
