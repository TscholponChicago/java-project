package array;

import java.util.Arrays;

public class EvenNumbersCollector {

	public static void main(String[] args) {
		// TASK 2: declare array nums and assign numbers
		// iterate through elements and find even nums
		// create array evens and store all even nums from nums array
		// print the new array using toString method
		int numbers[] = { 1, 2 - 3, 4, -34, 55, 78, 90, 33, 10 };
		int evenNums = 0;
		for (int a = 0; a < numbers.length; a++) {
			if (numbers[a] % 2 == 0) {
				evenNums++;

			}
		}

		int[] evenArr = new int[evenNums];
		int i = 0;
		for (int d = 0; d < numbers.length; d++) {

			if (numbers[d] % 2 == 0) {
				evenArr[i] = numbers[d];
				i++;
			}
		}

		System.out.println(Arrays.toString(evenArr));
		System.out.println();

		/*
		 * Esen's version
		 */
		int[] numb = { 1, 2 - 3, 4, -34, 55, 78, 90, 33, 10 };
		int counter = 0;
		for (int num : numb) {
			if (num % 2 == 0) {
				counter++;
			}
		}
		System.out.println(counter);
		int[] evens = new int[counter]; // we open new array for even numbers
		int p = 0;
		for (int num : numb) {
			if (num % 2 == 0) {// it says if all these numbers are even numbers so
				evens[p] = num; // it says assign into new evenArr all those nums
				p++;
			}
		}
	}

}
