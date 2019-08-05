package foreachloop;

import java.util.Arrays;

public class incrementValuesInArray {

	public static void main(String[] args) {
		
     
    
     // TASK 3: create and assign nums 
    // iterate through elemts and replace negative nums with 0
    int numbs[] = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
    int negatives = 0;
    for(int b = 0; b < numbs.length; b ++) {
    	if(numbs[b] == '-') {
    		negatives += numbs[b];
    	}
    	//System.out.println(Arrays.toString(negatives));
    }
     
     
     
	}

}
