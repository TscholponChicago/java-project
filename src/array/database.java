package array;

import java.util.Arrays;
import java.util.Random;

public class database {

	public static void main(String[] args) {
		int [] ages = new int[20];
		Random ran = new Random();
		for(int a = 0; a < ages.length; a++) {
			ages[a] = ran.nextInt(100);
		} 
		
		System.out.println(Arrays.toString(ages));
		
			
			
			
		}
		
		
	}


