package array;

import java.util.Arrays;

public class FindTwoMaxNumbersUsingSort {

	public static void main(String[] args) {

    int nums [] = {23,1,34,54,54,51};
    
    int dif = 0;  // here we are finding not dublicate numbers, it is empty now
    Arrays.sort(nums);
    int sort = nums[nums.length-1]; // we start looking for numbers from the end
    ///                                 
     for(int a = nums.length-2; a >= 0; a --) {// it goes to the end, and starts from the end,
    	                                // 
    	if(nums[a] == sort) continue;
    	else {
    		dif = nums[a];
    		break;
    	}
    }
		System.out.println(sort);
		System.out.println(dif);
		
		System.out.println();
		
		
		//Esen's version
		int zifri[] = {22,44,55,66,66,77};
		Arrays.sort(zifri);
		System.out.println(Arrays.toString(zifri));
		int last = zifri.length - 1;
		System.out.println(zifri[last]);
		for(int i = last; i >= 0; i--) {
			if(zifri[last] != zifri[i]) {
				System.out.println(zifri[i]);
				break;
			}
		}
		
	}

}
