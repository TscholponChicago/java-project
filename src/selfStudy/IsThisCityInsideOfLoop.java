package selfStudy;

import java.util.Arrays;

public class IsThisCityInsideOfLoop {

	public static void main(String[] args) {
		String cities [] = {"Miami","New York","Bishkek", "Osh"};
		int len = cities.length;
		boolean find = false;
		for(int a = 0; a < len; a++) {
			if(cities[a].equalsIgnoreCase("osh")) {
				find = true;
				break;
			}else {
				find = false;
			}
		}if(find) {
			System.out.println("Hot city found");
		}else {
			System.out.println("Hot city not found");
		}
			//TASK 2 To find the number of osh
		
		int counter = 0; // is for counting how many times osh appears in the loop
		for(int b = 0; b < cities.length; b++) {
			if(cities[b].equalsIgnoreCase("osh")) {
				counter ++;    // increases 
			}
		}if(counter >= 1) { //  if there is at least 1 osh
			System.out.println("Number of Osh : " + counter);
		
		}
		
         
	}

}
