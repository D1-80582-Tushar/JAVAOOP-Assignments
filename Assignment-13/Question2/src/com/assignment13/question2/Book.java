package com.assignment13.question2;

import java.util.Objects;

public class Book /*implements Comparable<Book>*/{
//	Book details: isbn(string), price(double), authorName(string), quantity(int)
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {
		
	}
	
	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
//		return Objects.hash(authorName, isbn, price, quantity);  if i create hash with all properties it would not be able to differentiate between two isbn
		//as we need common hashcode for same isbn"s one in order to differentiate between same isbn prop object  
		return Objects.hash(isbn);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

//	@Override
//	public int compareTo(Book obj) {
////        int diff = this.authorName.compareTo(authorName);
//		int diff = this.isbn.compareTo(obj.isbn);
//		return diff;
//	}
	
	
}