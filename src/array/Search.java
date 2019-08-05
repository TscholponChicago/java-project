package array;

import java.util.Arrays;

public class Search {

	public static void main(String[] args) {
      //TASK declare array and store elements{23,-3,55,67,-9}
	  // print out index of -3 if it exists in the array	
      // if it does not exists print zero
		int elements[] = {34, 55, 67, -3, 90};
		
		for(int a = 0; a < elements.length; a++) {
			if(elements[a] == 55) {
				System.out.println(a);
				break;
			}
		    
		}
		//Arrays.sort(elements);// if we dont put this method it will not find what we are looking for/
		//it will give just unpredictible result
		System.out.println(Arrays.toString(elements));
		int result = Arrays.binarySearch(elements, 55);// binaySearch is best way to find specific element, 
		System.out.println(result);
	//	-(1) - 1 ==> -2
		
		
	}

}
