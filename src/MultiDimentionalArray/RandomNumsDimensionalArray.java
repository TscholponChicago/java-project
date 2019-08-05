package MultiDimentionalArray;

import java.util.Random;

public class RandomNumsDimensionalArray {

	public static void main(String[] args) {
		
		
		                  // 1 array   second arr   third arr        fourth arr
		int [][] nums = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		//part print out the max sum value that one inner array gives
		for(int [] n : nums) {   // n represents each array
			for(int i : n) {     // i represents each element from each array
				System.out.print(i + " ");
			}
			System.out.println();
		}
		int maxSum = 0;
        for(int ii = 0; ii < nums.length; ii++) {
        	int sum = 0;
        	for(int j = 0; j < nums[ii].length; j++) {
        		sum += nums[ii][j];
        	}
        	System.out.println(sum);
        	maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
	}

}
