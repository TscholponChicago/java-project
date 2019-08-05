package array;

import java.util.Arrays;
import java.util.Random;

public class RandNumberWithForL {

	public static void main(String[] args) {
   
      int ages [] = new int[15];
      Random ran = new Random();
      for(int i = 0; i < ages.length; i++) {
    	  ages[i] = ran.nextInt(30);
    	  
      }
		
		System.out.println(Arrays.toString(ages));
		
		
	}

}
