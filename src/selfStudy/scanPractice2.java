package selfStudy;

import java.util.Scanner;
public class scanPractice2 {
     
	public static void main(String [] args) {
		System.out.println("What animals you like?");
		Scanner ch =  new Scanner(System.in);
		String animal = ch.next();
		System.out.println(animal);
		System.out.println("I like "+animal );
		
		System.out.println("Do you like wild animals?");
		
		String wild = ch.next();
		System.out.println(wild + " of course.");
		System.out.println("How many books do you have?");
		int books = ch.nextInt();
		
		System.out.println("i have "+ books+" books"); 
		boolean toy = false;
		System.out.println("Do you have a toy?");
       System.out.println(toy );
		
		
		
		
		
	}
	
	
	
	
	
	
}
