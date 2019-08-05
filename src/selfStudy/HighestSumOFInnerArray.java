package selfStudy;

import java.util.Arrays;

public class HighestSumOFInnerArray {

	public static void main(String[] args) {
		
	}
	public static void highes(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;
		int index = 0;
		for(int a = 0; a < arr.length; a++) {
			int sum = 0;
			for(int b = 0; b <arr[a].length; b++) {
				sum += arr[a][b];
			}if(sum > maxSum) {
				maxSum = sum;
				index = a;
			}
		}
		System.out.println(Arrays.toString(arr[index]));
	}
}
