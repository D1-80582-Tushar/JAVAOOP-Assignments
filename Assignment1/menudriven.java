package demo01;

import java.util.Scanner;

public class menudriven {
    public static int choice(Scanner sc) {
    	int choice = -1;
    	System.out.println("0 - Exit");
    	System.out.println("1 - Pizza");
    	System.out.println("2 - Cotton candy");
    	System.out.println("3 - Idli");
    	System.out.println("4 - Generate Bill");
    	choice = sc.nextInt();
    	return choice;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=-1;
		double p1 = 100.05;
		double p2 = 2.04;
		double p3 = 21.50;
		double total = 0;
		Scanner sc =new Scanner(System.in);
		
		while((value = choice(sc))!=0) {
			  switch(value) {
			    case 1:
			    	double quantity=0;
			    	System.out.println("how much?");
			    	quantity = sc.nextInt();
			    	total+=(p1*quantity);
			    	break;
			    case 2:
			    	double quantity1=0;
			    	System.out.println("how much?");
			    	quantity = sc.nextInt();
			    	total+=(p2*quantity);
			    	break;
			    case 3:
			    	double quantity2=0;
			    	System.out.println("how much?");
			    	quantity = sc.nextInt();
			    	total+=(p2*quantity);
			    	break;
			    case 4:
			    	System.out.println("YOUR TOTAL BILL AMOUNT IS :-"+ total);
			    	break;
			    default:
			       break;
			  }
		}
        
	}

}
