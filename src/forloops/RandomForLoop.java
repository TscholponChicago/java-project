package forloops;

import java.util.Random;
import java.util.Scanner;

public class RandomForLoop {

	public static void main(String[] args) {
      Random ran = new Random();
       int ranNum = ran.nextInt(101);
      
      Scanner scan = new Scanner(System.in);
      int guessedNum;
      
	  do {
		  System.out.println("Please guess a number:");
	  
		  guessedNum = scan.nextInt(); 
		  if(guessedNum < ranNum) {
			  System.out.println("Guessed number is to low");
		  }else if(guessedNum > ranNum) {
			  System.out.println("Guessed number is to high");
		  }else {
			  System.out.println("Congratulations!");
		  }
		  }while(guessedNum != ranNum);
		  
	  
	  
	  }
	  	
		
	}


