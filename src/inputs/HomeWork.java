package inputs;

import java.util.Scanner;
public class HomeWork {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter username:");
		String userName = scan.nextLine();
		
		System.out.println("Please enter password:");
		String password = scan.nextLine();
		
		System.out.println("\tWelcome, "+userName);
		
	    System.out.println("Profile  \tPictures  \tVideos");
	    System.out.println("Posts     \tLikes    \tComments");
	    System.out.println("Products    \tOrders  \tFeedbacks");
	    
		
		System.out.println("\n____________________TASK 2___________________");
		
		System.out.println("\nProfile edit Page");
		
		System.out.println("\nFirst Name:");
		String name = scan.nextLine();
		
		System.out.println("Last Name:");
		String last = scan.nextLine();
		
		System.out.println("Address:");
		String address = scan.nextLine();
		
		System.out.println("Credit Card Number:");
	    String credit = scan.nextLine();
		
	    System.out.println("\nInformation you entered:");
		System.out.println("Name:" +name+" "+last );
		System.out.println("Address: "+address);
		System.out.println("CC Number: "+credit);
		
		System.out.println();
		System.out.println("Save now?");
		System.out.println(">Yes");
		System.out.println(">No");
		String yes = scan.nextLine();
		String no = scan.nextLine();
	
		System.out.println("\nThank you");
		
	    System.out.println("__________________________________________________________________________");	
		
		
	     
	}

}
