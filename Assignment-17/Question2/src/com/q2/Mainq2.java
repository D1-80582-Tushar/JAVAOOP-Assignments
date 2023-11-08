package com.q2;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Mainq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. Write a program to calculate sum of 10 random integers using streams.
//		Stream<Integer> strm = Stream.generate(() -> Math.random()).limit(25);
		Random r = new Random();
		Stream<Integer> strm = Stream.generate(() -> r.nextInt(100))
				.limit(10);
//		Stream<Integer> strm2 = Stream(strm);
//		strm.map(e->System.out.println(e));
		Optional<Integer> result = strm.reduce((a,e)->a+e);
		System.out.println(result);
	}

}
