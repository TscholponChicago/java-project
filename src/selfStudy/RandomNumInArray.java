package selfStudy;

import java.util.Arrays;
import java.util.Random;

public class RandomNumInArray {

	public static void main(String[] args) {

      int ages [] = new int[10];
      Random ran = new Random();
      
      int age = ran.nextInt(25);
      ages[3] = age;
      System.out.println(Arrays.toString(ages));
	}

}
