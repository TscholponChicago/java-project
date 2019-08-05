package array;

import java.util.Arrays;

public class sortingArray {

	public static void main(String[] args) {
		String[] shows = { "Game of Thrones", "Friends", "Prison Break", "Doctor Who", "Grey Anatomy" };
		Arrays.sort(shows);
		System.out.println("Sorted list of shows:");
		int counter = 0;
		for (int i = 0; i < shows.length; i++) {
			counter++;
			System.out.println("#" + i + " " + shows[i]);
		}

		System.out.println(Arrays.toString(shows));
		int[] grades = { 15, 25, 33, 35, 66, 44, 78, 95, 98, 1, 500 };
		//1 way to find min and max using sort array
		Arrays.sort(grades);
		System.out.println("Min grade : "+grades[0]);
		System.out.println("Max grade: "+grades[grades.length-1]);
		System.out.println();
		//2 way to find max and min
		int maxValue = grades[0];
		
		int minValue = grades[0];
		for(int t=0; t < grades.length; t++) {
			if(maxValue < grades[t]) {
				maxValue = grades[t];
			}if(minValue > grades[t]) {
				minValue = grades[t];
			}
		}
		System.out.println("Max value is: "+ maxValue);
		System.out.println("Min value is: "+ minValue);
		System.out.println();
		
			
		String [] groceryList = {"apple","carrot","orange","cherry","strawberry"};
		Arrays.sort(groceryList);

		System.out.println("Index of apple is : "+Arrays.binarySearch(groceryList,"apple"));
		System.out.println("Index of orange is : "+Arrays.binarySearch(groceryList, "orange"));
		//method arays copy of range Arrays.copyOfRange(originalArray,from,to)to is not included
		
		
	}

}
