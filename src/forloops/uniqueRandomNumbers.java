package forloops;

import java.util.Random;

public class uniqueRandomNumbers {

	public static void main(String[] args) {
    Random ran = new Random();
    String unique = "";
   
	for(int a = 0; a < 8; a++) {
		int b = ran.nextInt(10);
		while(unique.contains(b+"")){
		b =ran.nextInt(10);
		}
	   unique+=b;
	  }	
		System.out.println(unique);
		

	}

}
