package com.question3;

// in case of interfaces ,it also have to be extends here
public class Box<T extends Displayable> {
    T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public static void printDisplayableBox(Box<?> b) {
		b.getObj().display();
	}
	
	public static void printAnyBox(Box<?> b) {
	   System.out.println(b.getObj().toString());
	}
      
}
