package Switch;

import java.util.Scanner;

public class AgeValidator {

	public static void main(String[] args) {

       //write program that asks user age from the user
		//switch based n the age
		// if age 16 print"almost done with high school"
		// for 2 4 print "almost done with university"
		// for  everything else print "keep living"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		
//		switch (age) {
//		  case (16):
//			 System.out.println("almost done with high school");
//		     break;
//		  case (24):
//			  System.out.println("almost done with university");
//		     break;
//		  default:
//			  System.out.println("Keep living");
//		  
//		
//		}
		if(age > 0 && age <= 120) {
		switch (age) {
		  case (16):
			  System.out.println("almost done with high school");
		     
		     break;
		  case (24):
			  System.out.println("almost done with university");
		     break;
		  default:
			  System.out.println("Keep living");
	  
		}
		}else {
			System.out.println("invalid age");
		}
		
		


	}
}
