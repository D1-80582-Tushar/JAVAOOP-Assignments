package com.person;

import java.util.Scanner;

//6. Declare an enum for Gender (MALE, FEMALE). 
//Create a class Person with ﬁelds name, age and gender.
//In main(), create a array of Person. Write a menu
//driven program (using enum), to add new person, display all people, ﬁnd a person by name.
enum Gender{
	MALE,
	FEMALE
}

enum Per{
	EXIT,
	ADDPERSON,
	DISPLAYALLPEOPLE,
	FINDAPERSON
}

public class Tester {
     	
    public static int menu(Scanner sc) {
    	  Per[] arr = Per.values();
          
          for(Per g:arr) {        	
          	System.out.println(g.ordinal() +" --> "+" do "+g.name().toLowerCase() );
          }
          
      	System.out.print("Enter choice: ");
  		int choice = sc.nextInt();
  		return choice;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person[] persons = new Person[20];
		Scanner sc = new Scanner(System.in);  
		Per[] arr = Per.values();
		
		int choice=0;
		int index=0;
		while((choice=menu(sc))!=0) {
			
			if(choice >= 20) {
				break;
			}
			
			Per ch = arr[choice];
		    switch (ch) {
			case ADDPERSON:
				System.out.println("------Add a person------");
				if(index>=20) {
					 System.out.println("out of capacity..");
				}else {					
					persons[index++] = new Person("Sanket",12,Gender.FEMALE);
				}
				break;
			case DISPLAYALLPEOPLE:
				for(Person p:persons) {
					if(p!=null) {
						System.out.println(p);						
					}
				}
				break;
			case FINDAPERSON:
			    break;
			default:
				break;
			}	
		}
	}

}
