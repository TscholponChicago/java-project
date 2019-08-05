package IfElseStatement;

import java.util.Scanner;
import java.util.Random;

public class WarmUpTask {

	public static void main(String[] args) {
		/*Scanner comes from java scanner library
		 * Random comes from random library and helps to generate random numbers
		 * 
		 */
//    Random num = new Random();
//    int a = num.nextInt(10);
//	System.out.println(a);
//	int remainder = a % 2;
//	if(remainder == 0) {
//		System.out.println("Number is even");
//	}else {
//		System.out.println("Number is odd");
//	}
//	
		
	Scanner scan = new Scanner(System.in);
	Random num = new Random();
	int x = num.nextInt(10);
	
	System.out.println("Please guess a number between 0 -10:");
	int num1 = scan.nextInt();
	
	
	
	if(num1 == x) {
		System.out.println("Congratulation!");
	}else if(num1 < x) {
		System.out.println("Your guess is less. Try again!");
	}else {
		System.out.println("Your guess is too high!");
		System.out.println("");
	}
		
	   
	
		
	}

}
