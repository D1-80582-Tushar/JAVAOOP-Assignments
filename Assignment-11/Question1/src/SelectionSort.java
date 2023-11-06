import java.util.Comparator;

public class SelectionSort {
      static  <T> void selectionsort(T[] arr, Comparator<T> c) {
    	     for(int i=0;i<arr.length;i++) {
    	    	 for(int j=i+1;j<arr.length;j++) {
    	    		  //swap if arr[i] > arr[j]
//    	    		 if (arr[i].doubleValue() > arr[j].doubleValue()) {
//    	    			   T temp = arr[i];
//    	    			   arr[i]=arr[j];
//    	    			   arr[j]=temp;
//    	    		 }
    	    		 if (c.compare(arr[i],arr[j])>0) {
  	    			   T temp = arr[i];
  	    			   arr[i]=arr[j];
  	    			   arr[j]=temp;
  	    		 }
    	    	 }
    	     }
      }
}
