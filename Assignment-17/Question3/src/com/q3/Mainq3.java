package com.q3;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Mainq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. Create an IntStream to represent numbers from 1 to 10. Call various functions like sum(), summaryStatistics() and observe the output.
		IntStream  strm= IntStream.of(1,2,3,4,5,6,7,8,9,10);
	    int sum = strm.sum();
	    
	    System.out.println(sum);
		IntStream  strm1= IntStream.of(1,2,3,4,5,6,7,8,9,10);
		IntSummaryStatistics iss = strm1.summaryStatistics();

	    System.out.println(iss.getMin() + " - "+ iss.getCount()+" - "+iss.getAverage());
	}

}
