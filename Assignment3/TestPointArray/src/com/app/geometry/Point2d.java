package com.app.geometry;
import static java.lang.Math.*;
//Q4. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
//ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
//string form of point's x & y co-ords
//Hint : public String getDetails())
//Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
//both points are having same x,y co-ords or false otherwise.
//Add calculateDistance method to calculate distance between current point and specified point &
//return the distance to the caller.
//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
//Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
//from user (Scanner) --to create 2 points (p1 & p2)
//Use getDetails method to display point details.(p1's details & p2's details)
//Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
//position)
//If they are not located at the same position , display distance between p1 & p2
public class Point2d {
    int x;
    int y;
    
    public Point2d(){
      
     }
	public Point2d(int x,int y){
       this.x = x;
       this.y = y;
    }
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getDetails() {
		return "point is ("+x+","+y+")";
	}
	
	public Boolean isEqual(Point2d p) {
	   if(this.x == p.x && this.y== p.y) {		   
		   return true;	
	   }
	   return false;
	}
	
	public int calculateDistance(Point2d p) {
		  return (int) sqrt(pow(p.x-x,2)+pow(p.y-y,2));
	}
	

}
