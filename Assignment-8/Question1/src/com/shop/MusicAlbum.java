package com.shop;

public class MusicAlbum implements Product,Cloneable{
	private String title;
	private double price;
 	private String singer;
	private String musician;
    public static final double GST = 0.10; //field initialization
	
	public MusicAlbum(String title, double price, String singer, String musician) {
		super();
		this.title = title;
		this.price = price;
		this.singer = singer;
		this.musician = musician;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public String getSinger() {
		return singer;
	}

	public String getMusician() {
		return musician;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Product productref = (Product) super.clone();
		return productref;
	}
	@Override
	public String toString() {
		return "MusicAlbum [title=" + title + ", price=" + price + ", singer=" + singer + ", musician=" + musician
				+ "]";
	}
	
	
}
