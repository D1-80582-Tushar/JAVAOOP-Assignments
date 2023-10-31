package com.question2;

public class tester {
//	2. Write a generic static method to ﬁnd minimum from an array of Number.
	
	//upper bound is using here 
	// it will use Number or sub classes of number here
	public static <T extends Number> T findMin(T[] arr,T min){ 	
		   for(T ele:arr) {
	     		if(ele.doubleValue() < min.doubleValue()) {
	     		     min = ele;	
	     		}
	     	}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {5,10,30,14,40,2,52,11,32};
		Double[] arr2 = {1.2,2.5,2.3,5.2,6.8,1.1};
		Number min = 100000;
		min = findMin(arr2,min);
        System.out.println(min);
	}

}
