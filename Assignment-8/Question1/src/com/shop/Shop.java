package com.shop;

public class Shop {

	private Book[] books;
	private MusicAlbum[] albums;
	private Toys[] toys;
//	A shop sells diﬀerent types of products like books, music albums, and toys. Book information includes ISBN, title, price, author, and subject. Album
//	information includes title, price, singer, and musician. Toy information includes title, price, age group (string), type. Though books are tax free, music
//	albums have GST tax of 10% and toys have VAT tax of 5%. Sometimes shop keeper announce a sell, where he apply same percentage discount to every
//	purchased products. Assuming that each customer can purchase maximum 5 products at a time, write a menu driven program so that each user can
//	purchase products of his choice. At the end display total bill (including tax) to be paid by customer and total revenue of shop (excluding tax). Design
//	appropriate classes and their relations.
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public MusicAlbum[] getAlbums() {
		return albums;
	}
	public void setAlbums(MusicAlbum[] albums) {
		this.albums = albums;
	}
	public Toys[] getToys() {
		return toys;
	}
	public void setToys(Toys[] toys) {
		this.toys = toys;
	}
	
}
