package array;

import java.util.Arrays;

public class sortingString {

	public static void main(String[] args) {
		/*TASK 1; create array cars and store elements
		 * bmw, amg,mercedes,toyota,kia,moskvich
		 * 
		 */
		String [] cars = {"kia","bmw","lexus","moskvich","jiguli","toyota","honda"};
		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));
		
		String names[] = {"chopa","nazar","kate","jame","hannamaria"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		String cities [] = {"chicago","new york","bishkek","baku"};
		Arrays.sort(cities);
		System.out.println(Arrays.toString(cities));
	}

}
