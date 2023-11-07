package com.q1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Tester {
    
	private static int menu(Scanner sc) {
		int choice = 0;
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete book of given id");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Sort books by price in desc order");
		System.out.println("7. Reverse the list");
		System.out.println("8. Save books in file");
		System.out.println("9. Load books from file");
		System.out.println("0 - EXIT");
		choice = sc.nextInt();
		return choice;
	}
	

//	. In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus. Save books in ﬁle and load books from ﬁle. Use DataOutputStream
//	and DataInputStream.
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	
		ArrayList<Book> books = new ArrayList<>();
		Iterator<Book> e = null;
        books = Books.loadData();
		Scanner sc = new Scanner(System.in);
		
	    int choice;
		while((choice=menu(sc))!=0) {
		     switch (choice) {
			case 1://add a book
				Books.addBook(books,sc);
				break;
			case 2://display all books
				Books.displayBooks(e,books);
				break;
			case 3://delete book of given id
				Books.deleteBook(e,books,sc);
				break;
			case 4://check if book exist
				System.out.println("Enter book isbn");
				String id = sc.next();
			    Book b = Books.isBookExistReturnBook(books,id);
			    if(b!=null) {
			    	System.out.println(b);
			    }else {
			    	System.out.println("Not Found");
			    }
				break;
			case 5:
			    Books.deleteAllBooks(books);
				break;
			case 6:
	            Books.displayBooksInPriceOrderDesc(books);
	            break;
			case 7:
				Books.reverseBookList(books);
				break;
			case 8:
				Books.saveBooks(books);
				break;
			case 9:
				Books.readFileBook();
				break;
			default:
				break;
			}	
		}
	}

}
