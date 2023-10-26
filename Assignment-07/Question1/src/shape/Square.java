package shape;

public class Square extends Polygon {
    private double side;
    
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return 3*3;
	}

	public void setSide(double side) {
		this.side = side;
	}
}
