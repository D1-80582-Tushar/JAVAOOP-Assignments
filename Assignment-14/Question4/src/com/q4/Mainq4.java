package com.q4;

import java.util.Scanner;

public class Mainq4 {
	
	private static int menu(Scanner sc) {
		int choice=0;
		System.out.println("0-EXIT");
		System.out.println("1-ADD");
		System.out.println("2-SUBSTRACT");
		System.out.println("3-MULTIPLY");
		System.out.println("4-DIVIDE");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void calculate(double num1,double num2,Arithmetic op){
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while((choice = menu(sc))!=0) {
			switch (choice) {
			case 1:
				System.out.println("Enter num 1");
				double num1 = sc.nextDouble();
				System.out.println("Enter num 2");
				double num2 = sc.nextDouble();
				calculate(num1,num2,(x,y)->x+y);
				break;
			case 2:
				System.out.println("Enter num 1");
				double num3 = sc.nextDouble();
				System.out.println("Enter num 2");
				double num4 = sc.nextDouble();
				calculate(num3,num4,(x,y)->x-y);
				break;
			case 3:
				System.out.println("Enter num 1");
				double num5 = sc.nextDouble();
				System.out.println("Enter num 2");
				double num6 = sc.nextDouble();
				calculate(num5,num6,(x,y)->x*y);
				break;
			case 4:
				System.out.println("Enter num 1");
				double num7 = sc.nextDouble();
				System.out.println("Enter num 2");
				double num8 = sc.nextDouble();
				calculate(num7,num8,(x,y)->x/y);
				break;
			default:
				break;
			}
		}
	}

}
