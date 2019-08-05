package Casting;

import java.util.Scanner;
public class CharValue {

	public static void main(String[] args) {
//		char c = 'A';
//		System.out.println(c);
//		
//		int i = c;
//		System.out.println(i);
		String sent = "Pubished on Feb 12, 2018";
		
		
		//Esen wrote: int indexOfComma = sent.indexOf(",")+2;
		
		sent = sent.substring(sent.indexOf(",")+2);
		int year = Integer.valueOf(sent);
		if(year <= 2019) {
			System.out.println("Valid year");
		}else {
			System.out.println("Invalid year");
		}
		// TASK 2//
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your message:");
		
		String message = scan.nextLine().trim();
		
		 char first = message.charAt(0);
		 int decimalValue = first;// here we convert char into int 
		 System.out.println(decimalValue);
		 
		 if(decimalValue >= 65 && decimalValue <=90 && (message.endsWith(".")
				 || message.endsWith("!"))) {
			 System.out.println("Message valid");
		 }else {
			 System.out.println("Invalid message");
		 }
		
		
		
		
		
		
		
		
		

	}

}
