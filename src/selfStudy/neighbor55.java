package selfStudy;

import java.util.Scanner;

public class neighbor55 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int[] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
		boolean fives =true;
		for(int i=0; i < nums.length; i++) {
			if(nums[i] == 5 && nums[i+1] == 5) {
				System.out.println("true");
				return;
			}
		}
		System.out.println("false");
		
	}

}
