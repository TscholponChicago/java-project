package returnTypeMethod;

import java.util.Arrays;
import java.util.Random;

public class returnArray {

	public static void main(String[] args) {
		int [] numbers = returnArray(2,55);
		System.out.println(Arrays.toString(numbers));
	}
	// TASK: Create a method that takes integer(size), Integer(bound) 
	//and returns array of Integers.Method idea: method should create list of integers
	//and assign random numbers between zero to given bound.
	//Size of array should be given size.
	public static int [] returnArray(int size, int bound) {
		int [] nums = new int[size];
		Random ran = new Random();
	
		for(int i = 0; i < nums.length; i++) {
			nums[i] = ran.nextInt(bound);
		}
		return nums;
	}

}
