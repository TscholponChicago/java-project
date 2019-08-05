package IfElseStatement;

import java.util.Scanner;
public class NumberFinder {

	public static void main(String[] args) {
	
     //Write  a code that asks to create username from username from user on console
     // check if entered username already exists in the database.(In database there are 2 usernames now
     //if entered username already exists print "username taken else "username created!
     	
     
     Scanner scan = new Scanner(System.in);
    
     String userName1 = "test";
     String userName2 = "james";
     System.out.println("Please enter name:");
     String enteredName = scan.next();
     if(enteredName.equals(userName1) || enteredName.equals(userName2)) {
    	 System.out.println("User name is taken.");
     }else {
         System.out.println("User name is created.");
     
     }
		
	}

}
