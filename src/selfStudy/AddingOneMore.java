package selfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class AddingOneMore {

	public static void main(String[] args) {
	
		
//		int [] nums = {12,34,65,76};
//		
//		int [] box = new int [nums.length + 1];
//		int n = 3;
//		for(int a = 0; a <nums.length; a++) {
//			   box[a] = nums[a];
//			   
//		}
//		 box[box.length-1] = n;
//		System.out.println(Arrays.toString(nums));
//		System.out.println(Arrays.toString(box));
	  
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your array");
		String words[] = {scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine()};
		System.out.println("enter your word");
		String word= scan.nextLine();
		String [] arr = new String[words.length +1];
		for(int b = 0; b < words.length; b++ ) {
			
			arr[b + 1] = words[b];
			arr[0] = word;
		}
	System.out.println(Arrays.toString(arr));
	}

}
