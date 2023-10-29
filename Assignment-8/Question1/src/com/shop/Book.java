package com.shop;

public class Book implements Product,Cloneable{
	 private String ISBN;
	 private String title;
	 private double price;
	 private String author;
	 private String subject;
	 
	public Book(String iSBN, String title, double price, String author, String subject) {
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.author = author;
		this.subject = subject;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthor() {
		return author;
	}

	public String getSubject() {
		return subject;
	}

	public Object clone() throws CloneNotSupportedException {
        Product  obj=(Product)super.clone();
		return obj;
	}
	
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + ", author=" + author + ", subject="
				+ subject + "]";
	}
	 
	
}
