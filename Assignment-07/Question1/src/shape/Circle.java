package shape;

public class Circle extends BoundedShape{
    private double radius;
	@Override
	public double calcArea() {
		return PI*radius*radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
