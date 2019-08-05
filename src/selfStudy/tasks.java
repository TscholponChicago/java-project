package selfStudy;

import java.util.Scanner;
public class tasks {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is a capital of France?");
		String capital = scan.next();
		
		System.out.println("What is 6 multiplied by 7?");   //?
		int multipl = scan.nextInt();
		
		System.out.println("Enter a decimal number between 1.0 and 10.0");
		double num = scan.nextDouble();
		
		System.out.println("Are birds your favourite pats?");
       boolean answer = true;
       System.out.println(answer);
       // String answer1 = scan.next();
       //  System.out.println(answer1);
        
        System.out.println("List your favourite letter");
		char letter = ' ';
		String let = scan.next();
		System.out.println(letter);
		
		System.out.println("Are you living in an appartment?");
		boolean apartment = true;
		
		
		
		System.out.println(apartment);
		
		System.out.println("How many group members does your group have?");
		int member = scan.nextInt();
		
		System.out.println("What is a name of your home town?");
		String town = scan.next();
		
		System.out.println("List your birthday in numbers using decimals.");
		double birthday = scan.nextDouble();
		
		System.out.println("This practice is easy.");
		boolean practice = false;
		System.out.println(practice);
		
	}

}
