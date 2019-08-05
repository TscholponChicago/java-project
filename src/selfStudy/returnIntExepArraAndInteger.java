package selfStudy;

import java.util.Arrays;
import java.util.Random;

public class returnIntExepArraAndInteger {

	public static void main(String[] args) {
		int [] numbers = {23,454,23,35,23,42,4,4,4,4,4,444,4,23};
		int twthree = findOccur(numbers,23);
		int four = findOccur(numbers,4);
        System.out.println(twthree);
        System.out.println(four);
        System.out.println(Arrays.toString(getArray()));
        System.out.println(Arrays.toString(getArr()));
        System.out.println(Arrays.toString(arr(2)));
	}
	/*TASK: return int, exx int arr and int
	 * methoind will look for value in the array
	 * and return the count of occurence
	 * 
	 */
	public static int findOccur(int [] arr, int value) {
		int counter = 0;
		for(int n : arr) {
			if(n == value) {
				counter++;
			}
		}
		return counter;
	}
	/*meth getArray. return int[]
	 *  no paramethers
	 * in the method build array and assign vlaue then return it
	 */
	public static int [] getArray() {
		int [] nums = new int [3];
		nums[0] = 11;
		nums[1] = 23;
		nums[2] = 3;
		return nums;
	}
	public static int[] getArr() {
		int [] numbers = {13,34,456,768,879,234};
		return numbers;
	}
	public static int [] arr(int size) {
		
		Random r = new Random();
		int [] arrr = new int[size];
		for(int i = 0; i < size;i++) {
		  arrr[i] = r.nextInt(101);
		}
		
		return arrr;
	} 
	
	}


