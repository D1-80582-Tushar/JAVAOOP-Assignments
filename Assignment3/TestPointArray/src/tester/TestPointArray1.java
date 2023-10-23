package tester;
import java.util.Scanner;

import com.app.geometry.*;

public class TestPointArray1 {
    private static int menu(Scanner sc){
    	int choice;
    	System.out.println("1-Display details of a specific point");
    	System.out.println("2-Display x, y co-ordinates of all points");
    	System.out.println("3-Display distance between specified points ");
    	System.out.println("4-Exit");
    	choice =sc.nextInt();
    	return choice;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points");
        int n = sc.nextInt();		
		
		Point2d[] array = new Point2d[n-1];
		
		for(int i=0;i<array.length;i++) {
			array[i] = new Point2d();
			System.out.println("enter point:-"+(i+1));
			array[i].setX(sc.nextInt());
			array[i].setY(sc.nextInt());
		}
		
		int choice;
		while((choice = menu(sc))!=4) {
			switch(choice) {
			    case 1:
			    	 //for only display purpose we can use for-each only
			    	 for(Point2d point:array) {
			    		 System.out.println(point.getDetails());
			    	 }
			    	 break;
			    case 2:
			    	 //for only display purpose we can use for-each only
			    	 for(Point2d point:array) {
			    		 System.out.println(point.getDetails());
			    	 }
			    	 break;
			    case 3:
			    	 //for only display purpose we can use for-each only
			    	 System.out.println("Points List");

			    	 for(Point2d point:array) {
			    		 System.out.println(point.getDetails());
			    	 }
			    	 System.out.println("choose point p1 and p2 for distance");
			    	 
			    	 int p1;
			    	 int p2;
			    	 int distance;
			    	 p1 = sc.nextInt();
			    	 p2 = sc.nextInt();
			    	 distance = array[p1-1].calculateDistance(array[p2-1]);
			    	 System.out.println("Distance between "
			       	+ "point p1 ("
			    	 +array[p1-1].getX()
			    	 +","
			    	 +array[p1-1].getY() 
			    	 +") ,"
			    	 	+ "point p2 ("
			    	 +array[p2-1].getX()
			    	 +","
			    	 +array[p2-1].getY() 
			    	 +") is"
			    	 +distance);
			    	 
			    	 break;
			    default:
			    	break;
			}
		};
	}

}
