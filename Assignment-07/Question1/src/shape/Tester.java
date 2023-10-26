package shape;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundedShape[] arr_of_shapes = new BoundedShape[5];
        arr_of_shapes[0] = new Circle();
        arr_of_shapes[1] = new Rectangle();
        arr_of_shapes[2] = new Square();
        arr_of_shapes[3] = new Triangle();
        arr_of_shapes[4] = new Circle();
        
        for(BoundedShape obj:arr_of_shapes) {
        	if(obj instanceof Circle) {
        		((Circle) obj).setRadius(4);
        		System.out.println(obj.calcArea());
        	}else if(obj instanceof Rectangle) {
        		((Rectangle) obj).setLength(5);
        		((Rectangle) obj).setBreadth(7);
        		System.out.println(obj.calcArea());
        	}else if(obj instanceof Square) {
        		((Square) obj).setSide(4);
        		System.out.println(obj.calcArea());
        	}else {
        		((Triangle)obj).setSides(1,2,3);
        		System.out.println(obj.calcArea());
        	}
        }
           
	}

}
