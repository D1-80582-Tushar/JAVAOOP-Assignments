package demo01;

import java.util.Scanner;

public class acceptdouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        double x;
        double sum=0;
        
        for(int i=0;i<2;i++) {
        	 if(sc.hasNextDouble()) {
        		 x=sc.nextDouble();
             	 sum+=x;
             }else {
             	System.out.println("error");
             }	 
        }
        
        System.out.println(sum/2);
 	}

}
