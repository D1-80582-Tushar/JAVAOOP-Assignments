package com.shop;

public abstract class TesterHelper {
    public static Book[] loadBooks() {
        Book[] books = new Book[] {
      				    new Book("978-1984801251", "To Kill a Mockingbird", 12.99, "Harper Lee", "Fiction"),
      				    new Book("978-0061120084", "1984", 10.49, "George Orwell", "Science Fiction"),
      				    new Book("978-1451673319", "The Great Gatsby", 9.99, "F. Scott Fitzgerald", "Fiction"),
      				    new Book("978-0143124763", "The Catcher in the Rye", 11.95, "J.D. Salinger", "Fiction"),
      				    new Book("978-0060935467", "To the Lighthouse", 13.75, "Virginia Woolf", "Modernist Literature")
      				};
        return books;
  }
  
  public static MusicAlbum[] loadAlbums() {
  	MusicAlbum[] MusicAlbums = new MusicAlbum[] {
  		    new MusicAlbum("MusicAlbum 1", 1.99, "Singer 1", "Musician 1"),
  		    new MusicAlbum("MusicAlbum 2", 0.99, "Singer 2", "Musician 2"),
  		    new MusicAlbum("MusicAlbum 3", 2.49, "Singer 3", "Musician 3"),
  		    new MusicAlbum("MusicAlbum 4", 1.19, "Singer 4", "Musician 4"),
  		    new MusicAlbum("MusicAlbum 5", 1.99, "Singer 5", "Musician 5")
  		};
  	return MusicAlbums;
  }
  public static Toys[] loadToys() {
  	Toys[] Toyss = new Toys[] {
  			new Toys("Action Figure", 14.99, "Children", "Action Figures"),
  			new Toys("Dollhouse", 39.99, "Children", "Dollhouses"),
  			new Toys("Remote Control Car", 24.99, "Children", "Remote Control Toyss"),
  			new Toys("Puzzle", 9.99, "Children", "Puzzles"),
  			new Toys("Stuffed Animal", 8.99, "Children", "Stuffed Animals")
  	};
  	return Toyss;
  }
}
