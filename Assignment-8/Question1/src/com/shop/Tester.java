package com.shop;

import java.util.Scanner;

public class Tester {
    public static int menu(Scanner sc) {
       int choice;
       System.out.println("0-EXIT");
       System.out.println("1-BUY BOOK");
       System.out.println("2-BUY MUSIC ALBUM");
       System.out.println("3-BUY TOY");
       System.out.println("4-SEE YOUR BASKET");
       System.out.println("5-SHOW CUSTOMER BILL");
       System.out.println("6-SHOW SHOP REVENUE");
       choice = sc.nextInt();
       return choice;
    }
    

    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // here i have added try catch as clonenotsupported is checked exception compiler will do check 
		// for this so we need to add a explicit try catch or throw method here
		//in case of unchecked exception jvm will throw error on its behalf and complier will not check for
		// this either for try catch or throws in catching method;
		
		try {
			
		 System.out.println("--------------------------Welcome To Shop-----------------------------------");
		 System.out.println("--------------------------What you want?-----------------------------------");

		 int bag_size=0;
		 double total_revenue = 0.0;
		 double total_bill = 0.0;
		 
		 Product[] basket = new Product[5];
		 Shop newshop = new Shop();
		 
		 newshop.setBooks(TesterHelper.loadBooks());
		 newshop.setAlbums(TesterHelper.loadAlbums());
		 newshop.setToys(TesterHelper.loadToys());
		 
		 
		 Scanner sc = new Scanner(System.in);
		 int choice;
		 
		 while((choice = menu(sc))!=0) {
			 switch (choice) {
			 case 1:
				 System.out.println("----------------BOOK LIST------------------");
				 for(Book b:newshop.getBooks()) {
					 if(b instanceof Book) {
						 System.out.println(b);
					 }
				 }
				 
				 System.out.println("choose one by title:");
				 String boo = sc.next();
				 for(Book b:newshop.getBooks()) {
					 String a = b.getTitle();
					 String test = a.replaceAll("\\s+", "").toLowerCase();
					
					 if((test).equals(boo.trim().toLowerCase())) {
                         if(bag_size>=5) {
                             System.out.println("you are at full capacity!!");                        	 
                        	 break;
                         }else {
                        	 
                        	 basket[bag_size++] = (Product)b.clone();
                        	 total_bill = total_bill + b.getPrice();
                        	 total_revenue = total_revenue+b.getPrice();
                        	 System.out.println("-------------------Book Added Succesfully---------------------");
                         }
					 }else {
						 continue;
					 }
				 }
				 break;
			 case 2:
				 System.out.println("----------------MUSIC ALBUM LIST------------------");
				 for(MusicAlbum b:newshop.getAlbums()) {
					 if(b instanceof MusicAlbum) {
						 System.out.println(b);
					 }
				 }
				 System.out.println("choose one by title:");
				 String album = sc.next();
				 for(MusicAlbum b:newshop.getAlbums()) {
					 String a = b.getTitle();
					 String test = a.replaceAll("\\s+", "").toLowerCase();
					
					 if((test).equals(album.trim().toLowerCase())) {
                         if(bag_size >=5) {
                             System.out.println("you are at full capacity!!");                        	 
                        	 return;
                         }else {
                        	 basket[bag_size++] = (Product)b.clone();
                        	 total_bill = total_bill + b.getPrice() + b.getPrice() * MusicAlbum.GST;
                        	 total_revenue = total_revenue + b.getPrice();
                        	 System.out.println("-------------------ALBUM Added Succesfully---------------------");
                         }
					 }else {
						 continue;
					 }
				 }
				 break;
			 case 3:
				 System.out.println("----------------TOY LIST------------------");
				 for(Toys b:newshop.getToys()) {
					 if(b instanceof Toys) {
						 System.out.println(b);
					 }
				 }
				 System.out.println("choose one by title:");
				 String Toy = sc.next();
				 				 
				 for(Toys b:newshop.getToys()) {
					 String a = b.getTitle();
					 String test = a.replaceAll("\\s+", "").toLowerCase();
					 if((test).equals(Toy.trim().toLowerCase())) {
                         if(bag_size >= 5) {
                             System.out.println("you are at full capacity!!");                        	 
                        	 return;
                         }else {
                        	 basket[bag_size++] = (Product)b.clone();
                        	 total_bill = total_bill + b.getPrice() + b.getPrice() * Toys.VAT_TAX;
                        	 total_revenue = total_revenue + b.getPrice();
                        	 System.out.println("-------------------Toy Added Succesfully---------------------");
                         }
					 }else {
						 continue;
					 }
				 }
				 break;
			 case 4:
				 System.out.println("---------------------Printing basket items------------------------");
				 for(Product obj:basket) {
					  if(obj instanceof Book) {
						  System.out.println(obj);						  
					  }else if(obj instanceof MusicAlbum) {
						  System.out.println(obj);
					  }else if(obj instanceof Toys){
						  System.out.println(obj);
					  }
				 }
				 break;
			 case 5:
				 System.out.println("---------------------Customer Bill------------------------");
                 System.out.println(total_bill);
                 break;
			 case 6:
				 System.out.println("---------------------SHOP REVENUE------------------------");
                 System.out.println(total_revenue);
                 break;
			 default:
				 break;
			 }
		 }
		 
		 sc.close();
	 }catch(Exception e) {
		 System.out.println("Invalid Input"+e.getMessage()); 
	 }
	}
}
