package MultiDimentionalArray;

import java.util.Arrays;

public class twoDim {

	public static void main(String[] args) {

		int [] arr = new int[3];
		arr[0] = 23;
		arr[1] =77;
		arr[2] = 44;
		System.out.println(arr[0]);
		
		int [] nums = {1,6,4,6,7,45,32,4,67,89,323,56,86789,232};
		
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==6) {
				nums[i]=0;
			}
			
		}
		
		
		
		System.out.println(nums.length);
		
		
		
		
		
		
		
		
		
		
		}
}
