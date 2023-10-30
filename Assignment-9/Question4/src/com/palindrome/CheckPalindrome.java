package com.palindrome;

public class CheckPalindrome {

	public static boolean checkPalindrome(char[] input,int i,int j) {
		
	    while(i<=j) {
	        if(input[i]!=input[j]) {
	        	return false;
	        }else {
	        	i++;
	        	j--;
	        }
	    }
	    
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. Write a method to check if string is palindrome or not.
	    String input = "aabaa";
	    boolean ans = checkPalindrome(input.toCharArray(),0,input.length()-1);
        if(ans) {
        	System.out.println("Palindrome");
        }else {
        	System.out.println("Not a Palindrome");
        }
	}

}
