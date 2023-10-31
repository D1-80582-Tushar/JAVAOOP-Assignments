package com.question3;


public class Book implements Displayable {

	private String name;
	private double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}


	@Override
	public void display() {
		System.out.println("Book [name=" + name + ", price=" + price + "]");
		// TODO Auto-generated method stub
		
	}

}
