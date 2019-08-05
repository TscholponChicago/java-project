package groupProject1;

import java.util.Scanner;

public class yOrnoWithForLoop {

	public static void main(String[] args) {
		
		/*Write a program to prompt the user to enter the numbers
		 *  till the user wants (by asking user if he wants to continue) and at the end it should display the count of positive, 
		 * negative and zeros entered. (Hint: use do while loop)Input: 
	Enter the number: 9
	Do you want to continue y/n? y
	Enter the number: -5
	Do you want to continue y/n? y
	Enter the number: 0
	Do you want to continue y/n? y
	Enter the number: 66
	Do you want to continue y/n? n

        Output:
	Positive numbers: 2
	Negative numbers: 1
	Zero numbers: 1
		 */ 
		Scanner input = new Scanner(System.in);
		int positive = 0;
	    int negative = 0;
	    int  zero =0;
	    String yn="";
	    do{
	      System.out.println("Enter the number:");
	      int num = input.nextInt();
	      if(num > 0){
	        positive++;
	      }if(num < 0){
	        negative++;
	      }if(num == 0){
	        zero++;
	      }
	      System.out.println("Do you want to continue y/n?");
	      yn=input.next();
	      
	      while(!yn.contentEquals("y") && !yn.equals("n")) {
	    	  System.out.println("Pls enter valid answer y/n?");
	    	  yn = input.next();
	      }
	      
	      
	    }while(yn.equals("y"));
		
		
		
		
	}

}
