package String;

import java.util.Scanner;

public class DataValidation {

	public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your name:");
	String name = scan.nextLine().trim();// fe: 
	if(name.isEmpty()) {
		System.out.println("You did not provide a name.");
		
	}else {
		System.out.println("Your name is "+name+".");
	}
	
	
	
	
		
		
		
		
	}

}
