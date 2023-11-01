
public class Tester {
//	A generic sort method for implementing selection sort algorithm is given below. In main(), create array of "Double" and sort it by calling selectionSort().
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Double[] arr = {10.3,20.4,15.4,21.6,32.1};
        Integer[] arr1 = {2,4,5,1,0,60,3,55};
        SelectionSort.selectionsort(arr);
        SelectionSort.selectionsort(arr1);

        for (Double double1 : arr) {
			System.out.print(double1 +" ");
		}  
        
        System.out.println();
        for (Integer double1 : arr1) {
			System.out.print(double1 +" ");
		}  
	}

}
