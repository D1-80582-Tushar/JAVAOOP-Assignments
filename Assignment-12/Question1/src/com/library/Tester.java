package com.library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

//Store book details in a library in a list -- ArrayList.
//Book details: isbn(string), price(double), authorName(string), quantity(int)
//Write a menu driven program to
//1. Add new book in List
//If book not present, then add a new book (hint - indexOf())
//If book is present, sum its quantity i.e. new quantity = existing quantity + input quantity
//2. Display all books in forward order using random access
//3. Search a book with given isbn (hint - indexOf())
//4. Delete a book at given index.
//5. Delete a book with given isbn.
//6. Delete a book with given name.
//7. Sort books by isbn in asc order -- Collections.sort(list);
//8. Sort books by price in desc order -- Collections.sort(list, comparator);
//9. Reverse the list -- Collections.reverse(list);

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
		System.out.println("0 - EXIT");
		choice = sc.nextInt();
		return choice;
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
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
			case 7:
				Books.reverseBookList(books);
			default:
				break;
			}	
		}
	}

}
