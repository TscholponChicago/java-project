package selfStudy;

import java.util.Random;
import java.util.Scanner;

public class uniqueRandomNumber {

	public static void main(String[] args) {
    /*2. Write a program that finds the random generated number between 0 - 100 
     * using loop. Once program finds the random number loop has to stop and 
     * print the number of attempts.
     * Flow:Target number is 49
     * Target number is found. 
     * Number of attempts: 49
     * 
     */
//		Random ran = new Random();
//		int target = ran.nextInt(100);
//		int attempts = 0;
//		for(int a = 0; a < 100; a++) {
//			attempts++;
//			if(a == target) {
//				System.out.println("Number is found");
//				System.out.println("Target number is "+target);
//				System.out.println("Number of attempts "+attempts);
//				break;
//			}
//		}
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		boolean found = false;
		int secretNum = ran.nextInt(10);
		
		System.out.println("Please guess number from 0 to 10");
        int guessed = scan.nextInt();		
        if(secretNum > guessed) {
        	System.out.println("Your guessed number is to low.");
        	
        }else if(guessed > secretNum) {
        	System.out.println("your guessed number is too high");
        	
        }else {
        	System.out.println("Confratulations!");
        	found = true;
        }
       System.out.println("Found"+ found);
       if (found ==false) {
    	   System.out.println("This is your last chanse.Pls guess the number");
    	   int secondGuess = scan.nextInt();
    	   if(secondGuess == secretNum) {
           System.out.println("Congrats");
    		   
    	   }else {
    		   System.out.println("You lost");
    	   }
    	   System.out.println("Secret number was :"+ secretNum);
       }
	}

}
