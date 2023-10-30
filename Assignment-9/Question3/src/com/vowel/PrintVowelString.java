package com.vowel;

public class PrintVowelString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	3. From an array of strings print the strings ending with vowels.
		String[] words = {"apple", "banana", "grape", "kiwi", "cherry", "pear"};
	    String[] vowels = {"a","e","i","o","u"};
	    
	    for(int i=0;i<words.length;i++) {
	    	for(int j=0;j<vowels.length;j++) {
	    		if(words[i].endsWith(vowels[j])) {
	    			System.out.println(words[i]);
	    		}
	    	}
	    }
	
	}

}
