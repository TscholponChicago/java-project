package forloops;

import java.util.Scanner;

public class Apple {

	public static void main(String[] args) {
     /* program that asks the name from user
      * using scanner and print "Welcome name"
      * for 15 times
      * 
      */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name:");
		String name = scan.nextLine();
		for(int a = 0 ; a <= 3; a++) {
			System.out.println("Welcome "+ name);
		}
		System.out.println("enter your child");
		String child = scan.nextLine();
		for(int b = 0; b < child.length(); b++) {
			System.out.println(child.charAt(b));
		}
		for(int c = 0; c <= 10; c++) {
			if(c % 2 == 0) {
				System.out.println("it is even");
				}
			}
		
		String country = "Kyrgyzstan";
		for(int r = 0; r < country.length(); r++) {
			if(r % 2 == 0) {
				System.out.println(country.charAt(r));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
