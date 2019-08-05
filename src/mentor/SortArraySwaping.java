package mentor;

import java.util.Arrays;

public class SortArraySwaping {

	public static void main(String[] args) {
		int [] arr = {1,6,4,7,8,78,34,89,789,3,1};
      System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	public static int[] bubbleSort(int[] arr) {
		int countSwaps = 0;
		boolean swaped = true;
		while(swaped) {
			swaped = false;
		
      for(int a = 0; a < arr.length-1 - countSwaps; a++) {
    	  countSwaps =0;
    	 
    	  if(arr[a] > arr[a+1]) {
    		   int temp = arr[a];
    		  arr[a] = arr[a+1] ;
              arr[a+1] = temp;
              swaped = true;
    	  }
      }
      countSwaps++;
	}
	return arr;
}
}