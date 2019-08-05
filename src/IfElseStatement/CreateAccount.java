package IfElseStatement;

import java.util.Scanner;

public class CreateAccount {

	public static void main(String[] args) {
//      String userName = "test";
//      String userName1 = "james";
//      Scanner scan = new Scanner(System.in);
//	  System.out.println("Please enter user name: ");
//	  String enterName = scan.nextLine();
//	  if(enterName.equals(userName) || enterName.equals(userName1)) {
//		  System.out.println("User name taken");
//	  }else {
//		  System.out.println("User name created!");
//	  }
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter three numbers:");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	int num3 = scan.nextInt();
	if(num1> num2 && num1> num3) {
		System.out.println("The bigger number is: "+ num1);
	}else if(num2 > num1 && num2 > num3) {
		System.out.println("The bigger number is :"+num2);
	}else if(num3 > num1 && num3 > num2) {
		System.out.println("The bigger number is: "+num3);
	}else {
		System.out.println("These numbers are equal");
	}
		
		
		
		
	}

}
