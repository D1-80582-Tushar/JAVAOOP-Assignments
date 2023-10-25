package com.app.fruits;

import java.util.Scanner;

public class Tester {

	
	 private static int menu(Scanner sc) {
		int choice=0;
		System.out.println("0 - Exit");
		System.out.println("1 - Add Mango");
		System.out.println("2 - Add Orange");
		System.out.println("3 - Add Apple");
		System.out.println("4 - Display names of all fruits");
//		eg : for-each --- null checking --getName()
		System.out.println("5 - Display all fresh fruits , in the basket");
//		eg : for-each , null checking --toString , taste, isFresh : getter
		System.out.println("6 - Display tastes of not fresh fruits in the basket.");
		System.out.println("7 - Mark a fruit as stale.");
		choice = sc.nextInt();
		return choice;
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit[] basket;
        Scanner sc =new Scanner(System.in);
        System.out.println("Priye grahak apni basket ke shamta ko nirdharit kare ?");
        int size = sc.nextInt();
        basket = new Fruit[size];
        
        int choice;
        Fruit fruit;
        double q;
		String color;
		int counter = 0;
		 
        while((choice = menu(sc))!=0){
        	switch(choice){
        	   case 1:
        		   System.out.println("Weight?");
        		   q = sc.nextInt();
        		   System.out.println("Color?");
        		   color = sc.next();
        		   basket[counter++] = new Apple("Apple",q,color);
        		   q=0.0;
        		   color =null;
        		   break;
        	   case 2:
        		   System.out.println("Weight?");
        		   q = sc.nextInt();
        		   System.out.println("Color?");
        		   color = sc.next();
        		   basket[counter++] = new Orange("Orange",q,color); 
        		   q=0.0;
        		   color =null;
        		   break;
        	   case 3:
        		   System.out.println("Weight?");
        		   q = sc.nextInt();
        		   System.out.println("Color?");
        		   color = sc.next();
        		   basket[counter++] = new Mango("Mango",q,color); 
        		   q=0.0;
        		   color =null;
        		   break;
        	   case 4:
        		   System.out.println("------------------FRUIT BASKET ITEMS--------------------------");
        		   //for display or edit purpose it better to use for each loop
        		   for(Fruit fru:basket) {
        			     if(fru != null) {
        			    	 System.out.println(fru.getName());        			    	 
        			     }
        		   }
        		   
        		   System.out.println("------------------THAT'S IT :)--------------------------");
        		   break;
        	   case 5:
        		   System.out.println("------------------FRUIT BASKET FRESH ITEMS--------------------------");
        		   //for display or edit purpose it better to use for each loop
        		   for(Fruit fru:basket) {
        			     if(fru != null) {
        			    	 if(fru.isFresh()) {
        			    		 if(fru instanceof Apple) {
        			    			 Apple appl = (Apple) fru;
        			    			 System.out.println(fru.toString() + appl.taste());   
        			    		 }else if(fru instanceof Orange) {
        			    			 Orange oran = (Orange) fru;
        			    			 System.out.println(fru.toString() + oran.taste());  
        			    		 }else {
        			    			 Mango man = (Mango) fru;
        			    			 System.out.println(fru.toString() + man.taste());   
        			    		 }
        			    		          			    	         			    		 
        			    	 }
        			     }
        		   }
        		   
        		   System.out.println("------------------THAT'S IT :)--------------------------");
        		   break;
        	   case 6:
        		   System.out.println("------------------FRUIT BASKET NOT FRESH ITEMS--------------------------");
        		   //for display or edit purpose it better to use for each loop
        		   for(Fruit fru:basket) {
        			     if(fru != null) {
        			    	 if(!fru.isFresh()) {
        			    		 if(fru instanceof Apple) {
        			    			 Apple appl = (Apple) fru;
        			    			 System.out.println(appl.taste());   
        			    		 }else if(fru instanceof Orange) {
        			    			 Orange oran = (Orange) fru;
        			    			 System.out.println(oran.taste());  
        			    		 }else {
        			    			 Mango man = (Mango) fru;
        			    			 System.out.println(man.taste());   
        			    		 }
        			    		          			    	         			    		 
        			    	 }
        			     }
        		   }
        		   
        		   System.out.println("------------------THAT'S IT ;)--------------------------");
        		   break;
        	   case 7:
        		   
        		   System.out.println("------------------MARK ITEM AS NOT FRESH--------------------------");
        		   //for display or edit purpose it better to use for each loop
        		   int i;
        		   System.out.println("Enter index?");
        		   i=sc.nextInt();
        		   if(i>=0 && i<counter) {
        			     basket[i].isFresh =false;
        		   }else {
        			   System.out.println("invalid index");
        		   }
        		   
        		   System.out.println("------------------ MARKED SUCCESSFULLY :)--------------------------");
        		   break;
        		default:
        			break;
        	}
        }
        }

}
