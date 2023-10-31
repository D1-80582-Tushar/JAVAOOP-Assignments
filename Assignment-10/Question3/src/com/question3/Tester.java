package com.question3;

public class Tester {
//	Copy Displayable, Person, Book, Car classes from the classwork. Add getter/setters and toString() in these classes. Complete the following non-generic
//	methods with appropriate parameters and call them from main().
	public static void main(String[] args) {

		Box<Book> obj= new Box<Book>();
        obj.setObj(new Book("harr",250.0));
        Box<Person> obj2 = new Box<Person>();
        obj2.setObj(new Person("abhishek",50));
        
        Box.printDisplayableBox(obj);
        Box.printAnyBox(obj2); 
	}

}
