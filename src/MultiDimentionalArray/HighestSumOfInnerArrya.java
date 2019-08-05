package MultiDimentionalArray;

import java.util.Arrays;

public class HighestSumOfInnerArrya {

	public static void main(String[] args) {//this task is about INNER ARRAY
		int[][] nums = { { 4, 2, 6, 45, 23, 1 }, { 22, 34, 66 }, { 1, 2, 3 } };
		highestSumOfInner(nums);
        highestSumOfInner(nums);
	}
    // Task 2: Create void meth that accepts 2D in Arr
	//and prints inner array that has highest sum
	public static void highestSumOfInner(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;// if put 0
		int index = 0;
		for (int a = 0; a < arr.length; a++) {// it runs for outerloop
			int sum = 0;
			for (int b = 0; b < arr[a].length; b++) {// runs for innerloop
				sum += arr[a][b];// sum holds total of inner array, [a] represents of arrays
			}
			if (sum > maxSum) {//when/after? we had found the sum
				maxSum = sum;//this sum will be assign into maxSum
				index = a;// it will remember index of inner array
			}
		}
		System.out.println(Arrays.toString(arr[index]));
	}

}
