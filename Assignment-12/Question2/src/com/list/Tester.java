package com.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester {
//	. Create a list of strings. Find the string with highest length using Collections.max().
	public static void main(String[] args) {
		class MaxLengthStringComparator implements Comparator<String>{

			@Override
			public int compare(String obj, String obj1) {
				int diff = obj.length() - obj1.length();
				return diff;
			}
			
		}
		// TODO Auto-generated method stub
        List<String> arr = new ArrayList<>();
        arr.add("hehehehe");
        arr.add("golubholu");
        arr.add("monusonu");
        arr.add("pill");
        arr.add("ellla");
        
        String maxLength = Collections.max(arr,new MaxLengthStringComparator());
        System.out.println(maxLength);
        
	}

}
