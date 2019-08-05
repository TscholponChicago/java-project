package selfStudy;

import java.util.Arrays;

public class LoopingInArray {

	public static void main(String[] args) {
		//TASK create array and initialize 4 colors
		//loop through each element using loop and print each color
		String color[] = {"red","blue","purple","green"};
		for(int a = 0; a < color.length; a++) {
			//System.out.print(a);//count how many elements side of array
		   System.out.println(color[a]);//prints just all elements
		}
		System.out.println();
		
		System.out.println(Arrays.toString(color));//prints each element in array
		//TASK print color names if the length of color is 4 or more
		String country[] = {"Kyrgyzstan","Uzbekistan","Ukraine","Russia","China"};
		for(int b = 0; b < country.length; b ++) {
			if(country[b].length() >= 6) {
				System.out.println(country[b]);
			}
		}
		
	}
}
