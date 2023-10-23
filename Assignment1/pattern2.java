package demo01;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //pattern
				Scanner sc = new Scanner(System.in);
				int rows = sc.nextInt();
				for(int row=1;row<=rows;row++) {
					//spaces
					for(int col=1;col<=rows-row;col++) {
						System.out.print("  ");
					}

					//upper stars
					for(int col=1;col<=2*row-1;col++) {
						System.out.print("* ");
					}
					
					
					System.out.println();
						
				}
				for(int row=rows;row>=1;row--) {
					//spaces
					for(int col=1;col<rows-row+1;col++) {
						System.out.print("  ");
					}

					//lower stars
					for(int col=1;col<2*row-2;col++) {
						System.out.print("* ");
					}
					
					System.out.println();
						
				}
	}

}
