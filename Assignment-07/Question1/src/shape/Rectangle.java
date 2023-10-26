package shape;

public class Rectangle extends Polygon {
    private double length,breadth;
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return  (length*breadth);
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

}
