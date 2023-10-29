package com.shop;

public class Toys implements Product,Cloneable{
	private String title;
	private double price;
	private String age_group;
	private String type;
	public static final double VAT_TAX = 0.05;
	
	public Toys(String title, double price, String age_group, String type) {
		super();
		this.title = title;
		this.price = price;
		this.age_group = age_group;
		this.type = type;
	}
	
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public String getAge_group() {
		return age_group;
	}
	public String getType() {
		return type;
	}

	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//shallow copy of object
		Product productref = (Product) super.clone();
		return productref;
	}
	@Override
	public String toString() {
		return "Toys [title=" + title + ", price=" + price + ", age_group=" + age_group + ", type=" + type + "]";
	}
	
	
	
	
}
