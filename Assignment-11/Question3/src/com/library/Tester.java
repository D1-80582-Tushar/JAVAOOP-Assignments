package com.library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Tester {
    
	private static int menu(Scanner sc) {
		int choice = 0;
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete book of given id");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("0 - EXIT");
		choice = sc.nextInt();
		return choice;
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		Collection<Book> books = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
	    int choice;
		while((choice=menu(sc))!=0) {
		     switch (choice) {
			case 1://add a book
				Book b = new Book();
				System.out.println("Enter Book Isbn");
				b.setIsbn(sc.next());
				System.out.println("Enter Book Price");
				b.setPrice(sc.nextDouble());
				System.out.println("Enter Book Author Name");
				b.setAuthorName(sc.next());
				System.out.println("Enter Book Quantity");
				b.setQuantity(sc.nextInt());
				books.add(b);
				break;
			case 2://display all books
				for (Book book : books) {
					System.out.println(book);
				}
				break;
			case 3://delete book of given id
				System.out.println("Enter book isbn");
				String id = sc.next();
				Book b1=null;
				//find book
				for (Book book : books) {
					if(book.getIsbn().equals(id)) // note carefully (book.getIsbn() == id) will only check for references this won't work
					{ 
						 b1=book;
					}
				}
				books.remove(b1);
				break;
			case 4://check if book exist
				System.out.println("Enter book isbn");
				String id1 = sc.next();
				Book b2=null;
				for (Book book : books) {
					if(book.getIsbn().equals(id1)) // note carefully (book.getIsbn() == id) will only check for references this won't work
					{ 
						 b2=book;
					}
				}
				
				if(b2 != null){
					System.out.println("Present");
					System.out.println(b2);
				}else {
					System.out.println("Not Found");
				}
				break;
			case 5:
				System.out.println("Deleting...");
				Thread.sleep(2000);
				books.removeAll(books);
				System.out.println("Successfully deleted.");
				break;
			case 6:
				System.out.println("Number of books:"+books.size());
			default:
				break;
			}	
		}
	}

}
