package shape;

public abstract class BoundedShape {
	double x;
	double y;
	public abstract double calcArea();
	public static final double PI = 3.14;
//	Create an abstract class BoundedShape with ﬁelds x, y. Provide abstract method calcArea(). Inherit it into a Circle class with additional ﬁelds radius and
//	override calcArea() method. Inherit BoundedShape into another abstract class Polygon with additional ﬁeld number of sides. Inherit BoundedShape into
//	classes Triangle (ﬁelds: side1, side2, side3), Square (ﬁelds: side), and Rectangle (ﬁelds: length, breadth). Override calcArea() method in them.
//	2. Create an abstract Player class with id, name, age, and matchesPlayed as ﬁelds. Create a Batter interface with methods like getRuns(), getAverage(), and
//	getStrikeRate(). Creater a Bowler interface with methods like getWickets(), and getEconomy(). Create a class Cricketer (with ﬁelds like runs, wickets, etc.)
//	inherited from Player as well as Batter and Bowler interfaces. In all classes write appropriate constructors, getter/setters, accept(), toString(), and
//	equals() methods. In main(), create a team (array) of 11 players and input their details from end user. Create a new (utilility) class Players that contains
//	static methods to count number of batters, number of bowlers, total batter runs, total bowler wickets, return a batter with maximum runs, and return a
//	bowler with maximum wickets.
	
	
}
