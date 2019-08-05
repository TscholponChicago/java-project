package IfElseStatement;

import java.util.Scanner;
public class Profile {

	public static void main(String[] args) {

//       String color = "Green";

//	   int size = color.length();
//	   System.out.println(size);
		
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Please create a password:");
	   String password = scan.nextLine();
	   int lengthOfPassword = password.length();
	   
	   if(lengthOfPassword >= 5 && lengthOfPassword <=12) {
		   System.out.println(password +"created");
	   }else {
		   if(lengthOfPassword < 5 ) {
			   System.out.println("Password length is too short");
		   }else {
			   System.out.println("Password is too long");
		   }
	   }
	   
		String s = new String ();
		
		String ss;
		ss = "hose";
		System.out.println(ss);
	}

}
