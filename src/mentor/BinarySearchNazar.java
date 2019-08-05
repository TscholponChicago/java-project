package mentor;

import java.util.Arrays;

public class BinarySearchNazar {

	public static void main(String[] args) {
		int arr[] = { 12, 34, 546, 78, 89, 879, 543, 324, 34, 343 };

		System.out.println(Arrays.toString(bubbleSort(arr)));
		//System.out.println(bynarySearch(arr, 100));
	}

	/*
	 * define beginning end ending point start loop define midle pointe(start +
	 * end)/2 check your number if its equal the middle return it if less then a
	 * middle move your end to the middle if your number is higher, move start to
	 * the middle
	 */
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

//	public static int[] bynarySearch(int[] arr, int num) {
//		Arrays.sort(arr);
//		int start = 0;
//		int end = arr.length - 1;
//		while (start <= end) {
//			int mid = (start + end) / 2;
//			if (arr[mid] == num)
//				return mid;
//
//			else if (num < arr[mid])
//				end = mid - 1;
//			else
//				start = mid + 1;
//		}
//		return -1;
//	}
}
