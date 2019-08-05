package mentor;

import java.util.Arrays;

public class KostikFindSameValuesBetweenTwoArrays {

	public static void main(String[] args) {
		String [] one = {"a","e","d","r","w","x","5"};
		String [] two = {"a","u","t","r","54","x","5"};
		//task write pro to find same values between 2 given arrays
		//and store in 1 array
		String store = "";
		for(int i = 0; i < one.length; i++) {
			for(int b = 0; b < two.length; b++) {
              if(one[i].equals(two[b])) {
            	  if(!store.contains(one[i])) {//if store does not have same letters
            		  store += one[i] + " "; //put into store those elements
            	  }else {
            		  continue;
            	  }
            	  }
              }
		}
		System.out.println(store);
		String [] resArr = store.split(" ");
		System.out.println(Arrays.toString(resArr));
	}

}
