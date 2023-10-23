package demo01;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //pattern
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for(int row=1;row<=rows;row++) {
			//spaces
			for(int col=1;col<=rows-row;col++) {
				System.out.print(" ");
			}

			//stars
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
			
			//spaces	
		}
	}

}
