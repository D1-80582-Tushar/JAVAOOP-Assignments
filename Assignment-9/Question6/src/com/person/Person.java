package com.person;
//6. Declare an enum for Gender (MALE, FEMALE). Create a class Person with ﬁelds name, age and gender. In main(), create a array of Person. Write a menu
//driven program (using enum), to add new person, display all people, ﬁnd a person by name.

public class Person {
	
	private String name;
	private int age;
	private Gender gen;
	
	public Person(String name, int age, Gender gen) {
		super();
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
    	
}
