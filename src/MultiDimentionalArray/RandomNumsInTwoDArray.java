package MultiDimentionalArray;

import java.util.Arrays;
import java.util.Random;

public class RandomNumsInTwoDArray {

	public static void main(String[] args) {
      
		int [][] n = getMultiArr(3,5);//this method returns 2D array
		// 3 means 3 arrays 5 means 5 elements in each array
		System.out.println(Arrays.deepToString(n));
	}

	// task 3: write a method that accepts 2 integ
	// first is for outer second is for inner
	// method should create 2DAr and assign ran num to 100
	// return 2D arr back to user
	public static int[][] getMultiArr(int size1, int size2) {
		int[][] nums = new int[size1][size2];
		Random ran = new Random();
        
		for (int a = 0; a < nums.length; a++) {
			for(int b = 0; b <nums[a].length; b++) {
				nums[a][b] = ran.nextInt(101);
			}
			
		}
		return nums;
	}

}
