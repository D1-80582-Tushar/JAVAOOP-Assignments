
public class SelectionSort {
      static <T extends Number> void selectionsort(T[] arr) {
    	     for(int i=0;i<arr.length;i++) {
    	    	 for(int j=i+1;j<arr.length;j++) {
    	    		  //swap if arr[i] > arr[j]
    	    		 if (arr[i].doubleValue() > arr[j].doubleValue()) {
    	    			   T temp = arr[i];
    	    			   arr[i]=arr[j];
    	    			   arr[j]=temp;
    	    		 }
    	    	 }
    	     }
      }
}
