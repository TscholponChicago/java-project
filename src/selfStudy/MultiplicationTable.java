package selfStudy;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a number:");
	  int num = scan.nextInt();
	  // if num is valid or not
	  if(num < 1 || num > 10) {
		  System.out.println("ERROR: Invalid Number");
		  System.exit(0);
	  }
	  
		for(int a = 1; a <= 10; a ++) {
			System.out.println(num + " x " + a + " = " + (num * a)+" |");
			
		}
		
		System.out.println("_______________");

	}

}
