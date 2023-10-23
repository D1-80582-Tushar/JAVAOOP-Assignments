package demo01;

import java.util.Scanner;

public class print {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        System.out.println("given number: "+x);
        System.out.println("binary equivalent: "+Integer.toBinaryString(x));
        System.out.println("binary equivalent: "+Integer.toOctalString(x));
        System.out.println("binary equivalent: "+Integer.toHexString(x));
	}

}
