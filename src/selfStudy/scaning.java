package selfStudy;

import java.util.Scanner;
public class scaning {
	
	public static void main(String[] args) {
//	Scanner give = new Scanner(System.in);
//	System.out.println("******Welcome to our Club!!******");
//	System.out.println("Please enter your name: ");
//    String name = give.next();
//    System.out.println("Name: "+ name);
//	System.out.println("Please enter your last name, "+ name);
//	String lastName = give.next();
//	System.out.println("Last name: "+lastName);
//	System.out.println("Enter your hobby, "+ name);
//	String hobby = give.next();
//	System.out.println("Hobby: "+ hobby);
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your name:");
	String name = scan.next();
	System.out.println("Enter your last name:");
	String lastName = scan.next();
	System.out.println("Enter your hobby:");
	String hobby = scan.next();
	System.out.println("Enter your friend's name:");
	String friend = scan.next();
	System.out.println("---------------------------");
	System.out.println("Name: "+name);
	System.out.println("Last name: "+lastName);
	System.out.println("Hobby: "+hobby);
	System.out.println("Friend: "+ friend);
	System.out.println("---------------------------");
	System.out.println("Thanks for information!");
	
	
	}

}
