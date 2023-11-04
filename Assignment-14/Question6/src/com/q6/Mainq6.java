package com.q6;


public class Mainq6 {
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count=0;
		for (T t : arr) {
			if(c.compare(t,key)) {
			    count++;	
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double [] arr = {44.2, 77.5, 77.5, 22.2, 55.7, 66.5};
		Double key = 77.5;
		int cnt = countIf(arr, key, (x,y)-> x.equals(y));
		System.out.println("Count = " + cnt); // 4 
	}

}
