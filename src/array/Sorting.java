package array;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int ages[] = {34,66,12,99,42,45,22,93};
		System.out.println(Arrays.toString(ages));// it just gives elements from my array
		Arrays.sort(ages);
		System.out.println(Arrays.toString(ages)); // it helps to sort elements from small value to greater
		
		int  toys[] = {34,11,456,22,985,34};
		Arrays.sort(toys);
		System.out.println(Arrays.toString(toys));
	}

}
