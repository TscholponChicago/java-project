package String;

import java.util.Scanner;

public class MeerimStr {

	public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
//     
//     System.out.println("Please enter symbols:");
//	 String symbols = scan.nextLine();
//	 
//	 System.out.println("Please enter word:");
//	 String word = scan.nextLine();
//	 
//	 String first = symbols.substring(0,symbols.length()/2);
//	 System.out.println("First part of symbols "+first);
//		.(letetr
//	 String second = symbols.substring(2);
//	 System.out.println("Second part of symbols "+second);
//	
//	 System.out.println(first + word + second);
//	 
	 System.out.println("Pls enter a word:"); 
	 String word = scan.nextLine();
	 
	 System.out.println("pls enter index of char");
	 int num = scan.nextInt();
	 
	 System.out.println("character of position "+ num + " is: " +word.charAt(num));
	 System.out.println("the length of message:" + word.length());
	 
	 
	 char let = word.charAt(1);
	 System.out.println("the position of "+let +": "+word.indexOf(let));
	}

}
