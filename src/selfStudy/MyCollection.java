package selfStudy;

import java.util.Arrays;

public class MyCollection {

	public static void main(String[] args) {
	   int [] arr = {24,46,-7,78,-12,34,2343};
	   printNegNum(arr);
		int [] arrs = {213,6,-12,787,-22,-45,-12,6};
		System.out.println(Arrays.toString(arrs));
		replaceNeg(arrs,2);
		}
	public static void printNegNum(int [] numbers) {
		for(int num : numbers) {
			if(num < 0) {
				System.out.println(num);
			}
		}
	}
	public static void replaceNeg(int[] arr, int replace) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				arr[i] = replace;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	}

