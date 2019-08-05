package mentor;

import java.util.Arrays;

public class KostikMoveAllZerosToEnd {

	public static void main(String[] args) {
		int [] nums  = {0,0,55,0,76,58,-8,0,0,123};
		//write pro to move all zero to the end
		int increase = 0;
		for(int a = 0; a < nums.length; a++) {
			if(nums[a]!= 0) {
				int temp = nums[a];
				nums[a] = nums[increase];
				nums[increase] = temp;
				increase++;
			}
		}
		System.out.println(Arrays.toString(nums));

	}

}
