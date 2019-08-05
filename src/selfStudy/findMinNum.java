package selfStudy;

public class findMinNum {

	public static void main(String[] args) {
		int [] nums = {13,43,54657,0,1,34545,56,};
		int min = nums[0];
		for(int a = 0; a < nums.length; a++) {
			if(nums[a]<min) {
				min = nums[a];
			}
		}
		System.out.println(min);
	}

}
