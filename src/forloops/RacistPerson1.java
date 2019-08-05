package forloops;

import java.util.Scanner;

public class RacistPerson1 {

	public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     
     for(;;) {
    	 System.out.println("Please enter a password:");
    	 String pass = scan.nextLine();
    	 
    	 if(pass.equalsIgnoreCase("secret435")) {
    		 
    		 System.out.println("Access granted!");
    		 System.out.println("Welcome to your profile!");
    		 break;
    	 }else {
    		 System.out.println("Try again!");
    	 }
     }
     
     
     for(;;) {
    	 System.out.println("What is your name?");
    	 String name = scan.next();
    	 if(name.equalsIgnoreCase("cholpon")) {
    		 continue;
    	 }else {
    		 System.out.println("great");
    	 }
     }
		
		
	}

}
