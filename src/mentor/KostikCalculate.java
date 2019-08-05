package mentor;

public class KostikCalculate {

	public static void main(String[] args) {
		int [] nums = {12,55,34,21,87,99,54,1,675,-23};
		//part 1: calculate the axact average vales f int array
		int sum = 0;
		for(int a = 0; a< nums.length; a++) {
			sum += nums[a];
		}
		sum = sum / nums.length;
		System.out.println(sum);
		//part 2: find sum of same array except the largest and smallest
		// values without using sort method
		int max = nums[0];
		int min = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}else if(nums[i] < min) {
				min = nums[i];
			}
		}
	     sum = (sum - min - max) / nums.length;
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
		
	}

}
