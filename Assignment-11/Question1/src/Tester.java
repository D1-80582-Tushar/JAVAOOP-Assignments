import java.util.Comparator;

public class Tester {
//	A generic sort method for implementing selection sort algorithm is given below. In main(), create array of "Double" and sort it by calling selectionSort().
	public static void main(String[] args) {
//        class ArrComaparator implements Comparator<Double>{
//
//			@Override
//			public int compare(Double ele1, Double ele2) {
//				int diff = Double.compare(ele1, ele2);
//				return diff;
//			}
//        	
//        }
		
		Double[] arr = {10.3,20.4,15.4,21.6,32.1};
        SelectionSort.selectionsort(arr,(x,y)-> Double.compare(x, y));
        for (Double double1 : arr) {
			System.out.print(double1 +" ");
		}  
        
//        System.out.println();
//        for (Integer double1 : arr1) {
//			System.out.print(double1 +" ");
//		}  
	}

}
