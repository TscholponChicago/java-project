package selfStudy;

import java.util.Arrays;

public class biggestNum {

	public static void main(String[] args) {
	int[][] nums = {{3,324,54},{24,433,44},{324,7}};
	biggestNum(nums);
	}
	public static void biggestNum(int[][] arr) {
		int biggest = arr[0][0];
		for(int a = 0; a < arr.length; a++) {
			for(int b = 0; b < arr[a].length; b++) {
				if(arr[a][b] > biggest) {
					biggest = arr[a][b];
				}
			}
		}
		System.out.println("Biggest:"+biggest);
	}
	
}
