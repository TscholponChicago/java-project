package selfStudy;

public class FindTheBiggestSum {

	public static void main(String[] args) {
		//Find the sum of each array
		int [][] nums = {{12,22,34,14,23},{76,66,86,44,56},{90,88,96,1323,434}};
		int maxSum = 0;
		for(int a = 0;  a< nums.length; a++) {
			int sum = 0;
			for(int b = 0; b < nums[a].length; b++) {
				sum += nums[a][b];
			}
			//System.out.println(sum);
			maxSum = Math.max(maxSum, sum);
			
		}
		System.out.println(maxSum);
	}

}
