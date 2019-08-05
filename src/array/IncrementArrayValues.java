package array;

import java.util.Arrays;

public class IncrementArrayValues {

	public static void main(String[] args) {
		// TASK 1:Mine. write pro and assign values from 1 to 9
				// print those values separ by space
				// usin loop : a) if value is even double it and assign back
				// b) if value is odd tripple it and assign back
				// c) print out all values in single line with space: 3 4 9 8 15 12 21 16 27
				
		      int [] nums = {1,2,3,4,5,6,7,8,9};
	     
		  //    System.out.println();
		      for(int i = 0; i < nums.length; i++) {
		    	  System.out.print(nums[i] + " ");
		    	   if(nums[i] % 2 == 0) {
		    		   nums[i] *= 2;
		    		   
		    	   }else {
		    		   nums[i] *= 3;
		    	   }
		      }
		      System.out.println();
		     System.out.println(Arrays.toString(nums));

	}

}
