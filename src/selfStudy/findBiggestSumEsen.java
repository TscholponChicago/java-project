package selfStudy;

public class findBiggestSumEsen {

	public static void main(String[] args) {
		int [][] nums = {{1,2,3,4},{12,33,42,8},{4,2,44}};
		int maxSum = 0;
		for(int [] a : nums) {
			int sum = 0;
			for(int b : a) {
				sum += b;
			}if( sum > maxSum) {
				maxSum = sum;
			}
			
		}
		System.out.println(maxSum);
	}

}
