package com.q1;

import java.util.Scanner;
import java.util.stream.Stream;

public class Mainq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Calculate the factorial of the given number using stream operations.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int x = sc.nextInt();
		int result = Stream
				.iterate(1, i -> i+1) // (seed first element from which we want to start, function )whose result will be our next element
				.limit(x)
				.reduce(1, (a,e) -> a*e);
	    System.out.println(result);	
	}

}
