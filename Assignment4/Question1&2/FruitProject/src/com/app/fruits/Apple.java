package com.app.fruits;

public class Apple extends Fruit{

	public Apple( String name,Double weight,String color) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
		this.isFresh = true;
	}
	
	

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
    @Override
	public String taste() {
		return "sweet";
	}
	

}
