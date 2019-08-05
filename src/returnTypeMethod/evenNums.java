package returnTypeMethod;

import java.util.Arrays;

public class evenNums {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,64,42,3,133};
		System.out.println(countEvenNumbers(numbers));
	}
	//TASK: write pro that accepts int array and return int
	//method should count even nums and return count of even numbers
	public static int  countEvenNumbers(int[] arr) {
		int evenCounter = 0;
		for(int i :arr ) {
			if(i % 2 == 0) {
				evenCounter ++;
			}
		}
		return evenCounter;

	}

}
