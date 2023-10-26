package shape;

public class Triangle extends Polygon {
	private double side1,side2,side3;
	@Override
	public double calcArea() {
		double s = (this.side1+this.side2+this.side3)/3;
		return Math.sqrt(s*(Math.pow(s-side1, 2)+Math.pow(s-side2, 2)+Math.pow(s-side3, 2)));
	}
	public void setSides(double side1,double side2,double side3) {
		if((side1+side2)>side3 && (side3+side1)>side2 && (side2+side3)>side1) {
			this.side1 = side1;
            this.side2 =side2;
            this.side3 =side3;
		}else {
			System.out.println("Invalid Triangle!! ");
		}
	}

}
