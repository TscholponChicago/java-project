package selfStudy;

import java.util.Scanner;
public class IfElseStatament {

	public static void main(String[] args) {
	
	 
     Scanner scan = new Scanner(System.in);
     System.out.println("Please enter points:");
     int points = scan.nextInt();
     
     if(points >= 100) {
    	 System.out.println("Invalid Grade.");
     }else if(points >= 91 && points <= 100) {
    	 System.out.println("You got A");
     }else if(points >= 81 && points <= 90) {
    	 System.out.println("You got B");
     }else if(points >= 70 && points <= 80) {
    	 System.out.println("You got C");
     }else if(points >= 61 && points <=81) {
    	 System.out.println("You failed");
     }else {
    	 System.out.println("Study harder");
     }
		
		
		
		
		
	}

}
