package array;

import java.util.Arrays;

public class NoNegativity {

	public static void main(String[] args) {
		//TASK 3 : create and assign value to array
		// iterate through it and replace negative numbers with zero
		int [] numbers = {1, 2, -3, 4, -34, 55, 78, -90, 33, 10};
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				numbers[i] = 0;
			}
		}
		System.out.println(Arrays.toString(numbers));
		
	}

}
